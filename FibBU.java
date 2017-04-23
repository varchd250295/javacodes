import java.io.*;
import java.util.*;

class FibBU

{
	static int arr[]=new int[100];

	static int fib(int x)
	{
		int t=x;

		while(arr[t]==0)
		t--;

		for(int i=t+1;i<=x;i++)
			arr[i]=arr[i-1]+arr[i-2];

		return arr[x];
	}



	public static void main(String args[])throws IOException

		{
			BufferedReader xx=new BufferedReader (new InputStreamReader(System.in));
			arr[0]=0;
			arr[1]=1;

			System.out.println("Enter the terms to be found, one by one(Enter -1 to stop)");

			int x=Integer.parseInt(xx.readLine());

			while(x!=-1)
			{
				System.out.println("Required Term : \t "+fib(x));
				x=Integer.parseInt(xx.readLine());

			}
		}

	}

