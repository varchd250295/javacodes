import java.io.*;

class SecondLargest

{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of the array");

		int n=Integer.parseInt(xx.readLine());
		int a[]=new int[n];

		System.out.println("Enter the elements");

		for(int i=0;i<n;i++)
		a[i]=Integer.parseInt(xx.readLine());


		int l,sl;
		l=sl=a[0];

		for(int i=1;i<n;i++)

			if(a[i]>l)
			{
				sl=l;
				l=a[i];
			}

			else if(a[i]>sl &&a[i]<l)sl=a[i];



		System.out.println("The Second Largest Element is : " + sl);


	}

}




