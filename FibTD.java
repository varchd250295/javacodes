import java.io.*;
import java.util.*;

class FibTD
{
	static int arr[]=new int[100];

	static int fib(int x)
	{
		if(x==0)return 1;
		if(x==1)return 1;

		if(arr[x]!=0)
			return arr[x];
		else
			{
				arr[x]=fib(x-1)+fib(x-2);
				return arr[x];
			}


	}

	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader (new InputStreamReader(System.in));


		System.out.println("Enter the terms to be found, one by one(Enter -1 to stop)");

		int x=Integer.parseInt(xx.readLine());

		while(x!=-1)
		{
			System.out.println("Required Term : \t "+fib(x));
			x=Integer.parseInt(xx.readLine());

		}
	}

}
