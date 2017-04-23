import java.io.*;

class DNA
{

	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the DNA sequences separated by spaces");

		 String a[]=(xx.readLine()).split(" ");

		 int n=a.length;

		 int c[]=new int[n];

		 for(int i=0;i<n;i++)
		 {
			 int ns=a[i].length();

			 for(int j=0;j<(ns-3);j++)
			 {
				 String t=a[i].substring(j,j+4);

				 if(t.equals("TATA"))
				 c[i]++;
			 }
		 }

		 for(int i=0;i<(n-1);i++)
		 {
			 for(int j=i+1;j<n;j++)
			 {
				 if(c[j]>c[i])
				 {
					c[j]=c[j]+c[i];
					c[i]=c[j]-c[i];
					c[j]=c[j]-c[i];

					 String p=a[i];
					 a[i]=a[j];
					 a[j]=p;

				 }

			 }

		 }

		 for(int i=0;i<n;i++)
			 System.out.println(a[i]);

		 }

	 }




