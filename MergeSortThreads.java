import java.io.*;

class threads extends Thread

{
	int arr[],l,r;

	Thread left,right;

	threads(int []arr,int l,int r)
	{
		this.arr=arr;
		this.l=l;
		this.r=r;
		start();
	}

	public void run()
	{
		sort();

	}

	void sort()
	{
		if(l<r)
		{
			int m=(l+r)/2;

			left =new threads(arr,l,m);
			right =new threads(arr,m+1,r);
			try
			{

				left.join();
				right.join();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}

			merge(arr,l,r);
		}

	}


	void merge(int []arr,int l,int r)
	{
		int m=(l+r)/2;
		//System.out.println(m);
		int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i)
		  L[i] = arr[l + i];
		for (int j=0; j<n2; ++j)
          R[j] = arr[m + 1+ j];


        int i = 0, j = 0;

        int k = l;
		while (i < n1 && j < n2)
		{
		     if (L[i] <= R[j])
		        {
		          arr[k] = L[i];
		          i++;
		        }
		     else
		        {
		           arr[k] = R[j];
		           j++;
		         }
		     k++;
        }

              while (i < n1)
		        {
		            arr[k] = L[i];
		            i++;
		            k++;
		        }


		        while (j < n2)
		        {
		            arr[k] = R[j];
		            j++;
		            k++;
		        }
    }







}

class MergeSortThreads
{

	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int arr[]={38,27,43,3,9,82,10};

		int len=7;

		Thread t=new threads(arr,0,len-1);

		try
					{

						t.join();
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
			}

		for(int i=0;i<len;i++)
			System.out.print(arr[i]+"\t");

	}
}
