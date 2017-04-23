import java.io.*;
import java.util.*;



class MaxSubset_MEM
{
	static int S;
	static boolean mat[][];

	static boolean func(int set[],int in,int sum)
	{

		if(in<0)
		return false;

		if(sum-set[in]==0)
			return (mat[in][sum]=true);

		if(sum-set[in]>0)
		{
			if(func(set,in-1,sum-set[in]))
			return (mat[in][sum]=true);
		}

		if(func(set,in-1,sum))
		return (mat[in][sum]=true);

		return false;


	}


	static void display(int n,int set[])
	{
		if(mat[n-1][S]==false)
			System.out.println("No Such Subsets exits!");

		else
		{
			int sum=S;
			int cur=n-1;
			while(sum>0)
			{
				while(mat[cur][sum]==true)
				cur--;

				System.out.print(set[cur+1]+"\t");

				sum-=set[cur+1];

			}

		}

	}


	public static void main(String args[])throws IOException
	{

		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Set : ");

		StringTokenizer st=new StringTokenizer(xx.readLine());
		int n=st.countTokens();

		int set[]=new int[n];

		for(int i=0;i<n;i++)
		set[i]=Integer.parseInt(st.nextToken());

		System.out.println("Enter the required  sum :");
		S=Integer.parseInt(xx.readLine());

		mat=new boolean[n][S+1];  // all the values are false by default


		func(set,n-1,S);

		display(n,set);

		/*for(int i=0;i<n;i++)
		{
			for(int j=0;j<=S;j++)
			{	if(mat[i][j]==true)
				System.out.print("T");
				else
				System.out.print("F");
			}
			System.out.println();
		}*/
	}
}
