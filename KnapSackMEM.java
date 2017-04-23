import java.io.*;
import java.util.*;


class KnapSackMEM

{
	static int k[][];

	static int knapsack(int W,int wt[],int val[],int n)  // 'n' contains the current item under consideration i.e. the n'th item in the sequence (index being (n-1) for the corresponding value and weight arrays)
	// 'W' signifies the currently remaining weight that can be used
	{

		if(W==0 || n==0)
		return k[n][W]=0;


		if(k[n][W]==-1)
		{
			if(wt[n-1]>W)
			return k[n][W]=knapsack(W,wt,val,n-1);

			else
			return k[n][W]=Math.max(val[n-1]+knapsack(W-wt[n-1],wt,val,n-1),knapsack(W,wt,val,n-1));
		}
		else
		return k[n][W];

	}


	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int val[]={12,10,8,11,14,7,9};
		int wt[]={4,6,5,7,3,1,6};

		int W=18;
		int n=val.length;
		k=new int[n+1][W+1];

		for(int i=0;i<=n;i++)
		Arrays.fill(k[i],-1);


		int maxVal=knapsack(W,wt,val,n);

		System.out.println(maxVal);

		for(int i=0;i<=n;i++)
		{
					for(int w=0;w<=W;w++)
					System.out.print(k[i][w]+" ");

					System.out.println();
		}
	}

}

