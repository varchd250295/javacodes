import java.io.*;

class Prime
{

		Prime(int n)
		{


			if(n<=3)
			{	if(n==2)System.out.println("2");
				else
				System.out.println("2 \n3");
				System.exit(0);
			}


			boolean f=true;

			System.out.println("2 \n3");
			for(int i=4;i<n;i++,f=true)
			{
				if(i%2==0)continue;

				for(int j=3;j<(Math.ceil(Math.sqrt(i)));j+=2)
				if(i%j==0)
				{f=false;
				break;
				}

				if(f)System.out.println(i);

			}

		}



}


class TestPrime
{
	public static void main(String args[])throws IOException

	{

		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the limit");

		Prime x=new Prime(Integer.parseInt(xx.readLine()));

	}


}


