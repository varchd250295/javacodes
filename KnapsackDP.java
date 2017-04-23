import java.io.*;

class KnapsackDP
{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int val[]={12,10,8,11,14,7,9};
		int wt[]={4,6,5,7,3,1,6};

		int W=18;
		int n=val.length;

		int k[][]=new int[n+1][W+1];


		for(int i=0;i<=n;i++)
		{
			for(int w=0;w<=W;w++)
			{
				if(i==0 || w==0)
				k[i][w]=0;

				else if(wt[i-1]<=w)
				k[i][w]=Math.max((val[i-1]+k[i-1][w-wt[i-1]]),k[i-1][w]);

				else
				k[i][w]=k[i-1][w];

			}

		}

		System.out.println("Max Value Possible : " + k[n][W]);


		for(int i=0;i<=n;i++)
		{
			for(int w=0;w<=W;w++)
			{
				if((new Integer(k[i][w])).toString().length()==1)
				System.out.print(k[i][w]+"  ");
				else
				System.out.print(k[i][w]+" ");
			}

			System.out.println();
		}

	}

}

