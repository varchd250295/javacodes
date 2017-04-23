import java.io.*;

class DAAQ2
{
	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 'N' and 'S', in that order");

		int n=Integer.parseInt(xx.readLine());

		int s=Integer.parseInt(xx.readLine());


		int ub=(int)Math.pow(10,n) -1;
		int lb=(int)Math.pow(10,n-1);

		for(int i=ub; i>=lb;i--)
		{
			int temp=i;
			int sum=0;

			while(temp>0)
			{
				sum+=temp%10;
				temp/=10;
			}

			if(sum==s)
			{
				System.out.println(i);
				break;
			}
		}

	}

}
