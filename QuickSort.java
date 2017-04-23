import java.io.*;

class QuickSort

{
	 static void sort(int arr[],int l,int r)throws IOException
	{

		if(l<r)
		{
			int j=l-1;
			int temp;
			int pivot=arr[r];

			for(int i=l;i<r;i++)
			{
				if(arr[i]<pivot)
				{
					temp=arr[++j];
					arr[j]=arr[i];
					arr[i]=temp;

				}

			}

			temp=arr[++j];
			arr[j]=arr[r];
			arr[r]=temp;

			sort(arr,l,j-1);


			sort(arr,j+1,r);

		}
	}


	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int arr[]={20,2,8,9,1,4,23,42,15,17,19,51,4};


		int n=arr.length;


		sort(arr,0,n-1);

		System.out.println("The sorted array is : ");

		for(int i=0;i<n;i++)
			System.out.print(arr[i]+"\t");

	}

}
