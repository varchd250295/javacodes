import java.io.*;

class ArraySort

{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of elements");

		int n=Integer.parseInt(xx.readLine());

		int a[]=new int[n];

		System.out.println("Enter the elements :");

		for(int i=0;i<n;i++)
		a[i]=Integer.parseInt(xx.readLine());

		int c=0;

		for(int i=1;i<n;i++)
		{
			if(a[i]>a[i-1])c++;
			if(a[i]<a[i-1])c--;

		}
		if(c==(n-1)||c==(1-n))
		{
			System.out.println("The Array is already sorted");
			System.exit(0);
		}

		for(int i=0;i<(n-1);i++)
		for(int j=i+1;j<n;j++)
		if(a[i]>a[j])
		{
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
		}

		System.out.println("The sorted array is :");

		for(int i=0;i<n;i++)
		System.out.println(a[i]);

	}

}


