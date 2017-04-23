import java.io.*;

class BinaryRecursion

{


	static int search(int arr[],int l, int r,int e)
	{
		int m=(l+r)/2;
		int out;

		if(l<=r)
		{
			if(arr[m]==e)
				return m;

			if(e<arr[m])
			out=search(arr,l,m-1,e);
			else
			out=search(arr,m+1,r,e);

			return out;

		}
		else
			return -1;


	}

	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int arr[]={2,5,8,10,11,12,17,18,26,30,42,51,54,60};

		System.out.println("Enter the element to be searched: ");

		int e=Integer.parseInt(xx.readLine());

		int out=search(arr,0,arr.length-1,e);

		if(out<0)
			System.out.println("The element is not present in the array!");
		else
			System.out.println("The element lies at index :"+out);

		}

	}

