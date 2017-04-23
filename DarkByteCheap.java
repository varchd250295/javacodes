import java.io.*;

class DarkByteCheap

{
	public static void main(String args[])throws IOException
		{
			//BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Array size and then the elements");

			int n=Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
			int a[]=new int[n];
			boolean flag=true;

			int count=0;
			for(int i=0;i<n;i++)
				a[i]=Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

			for(int i=0;i<n;i++,flag=true)
			{
				for(int j=0;j<n;j++)
				{
					if(a[j]==a[i] && i!=j)
					{
						flag=false;
						break;
					}
				}
				if(flag)count++;
			}


		System.out.println("No. of rare notes: " +count);
	}
}




