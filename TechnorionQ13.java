import java.io.*;

class TechnorionQ13

{

	static boolean odd(int n)
	{
		while(n!=0)
		{
			if((n%10)%2!=0)
			return true;

			n/=10;
		}
		return false;

	}

	static boolean even(int n)
	{
		while(n!=0)
		{
			if((n%10)%2==0)
			return true;

			n/=10;
		}

		return false;

	}


	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int sum=0;

		for(int i=100;i<=999;i++)
		{

			if(odd(i)&&even(i))
			{
				sum+=i;
				System.out.println(i);

			}

		}


		System.out.println(sum);

	}

}
