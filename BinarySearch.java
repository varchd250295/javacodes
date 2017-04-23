import java.io.*;

class BinarySearch

{
	public static void main(String args[])throws IOException

		{

			BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of elements");

		int n=Integer.parseInt(xx.readLine());

		int a[]=new int[n];

		System.out.println("Enter the elements(sorted)");

		for(int i=0;i<n;i++)
		a[i]=Integer.parseInt(xx.readLine());


			System.out.println("Enter the element to be searched");

			int e=Integer.parseInt(xx.readLine());

			int lb=0,ub=(n-1);
			int mid=(ub+lb)/2;

			while(ub>=lb && a[mid]!=e)
			{
				if(e>a[mid])lb=mid+1;

				if(e<a[mid])ub=mid-1;

				mid=(lb+ub)/2;

			}

			if(a[mid]==e)System.out.println("The element is at the index :"+mid);
			else
			System.out.println("Element not found");

		}

	}

