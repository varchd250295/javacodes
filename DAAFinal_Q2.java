import java.io.*;
import java.util.*;

class DAAFinal_Q2

{
	static int X,Y;

	static int sequence(int n)
	{

		if(n==1)return X;

		if(n==2)return Y;

		return (sequence(n-1)+sequence(n-2));

	}


	static boolean checkPrime(int n)
	{

		int limit=n/2;
		if(n==1 || n==0)return false;
		if(n==2 || n==3)return true;

		for(int i=2;i<=limit;i++)
		{
			if(n%i==0)return false;
		}

		return true;
	}


	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter X and Y :");

		 X=Integer.parseInt(xx.readLine());

		Y=Integer.parseInt(xx.readLine());

		System.out.println("Enter 'i' : " );

		int val=Integer.parseInt(xx.readLine());

		int count=0;
		int prime;


		if(checkPrime(X))
			count++;

		if(count==val)
		{System.out.println(X);
		System.exit(0);}

		if(checkPrime(Y))
		count++;

		if(count==val)
				{System.out.println(X);
		System.exit(0);}

		int i=2;


		while(true)
		{
			prime=sequence(++i);

			if(checkPrime(prime))
			{
				count++;

				if(count==val)
				{
					System.out.println(prime);
					System.exit(0);
				}
			}

		}

	}

}

