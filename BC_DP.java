import java.io.*;

class BC_DP
{

	static int C[][];
	static int BC(int n,int k)
	{

		 C=new int[n+1][k+1];

		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=(Math.min(i,k));j++)
			{
				if(j==0||j==i)
				C[i][j]=1;

				else
				C[i][j]=C[i-1][j-1]+C[i-1][j];

			}
		}

		return C[n][k];
	}




	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the values of n and k :");


		int n=Integer.parseInt(xx.readLine());
		int k=Integer.parseInt(xx.readLine());

		System.out.println(BC(n,k));

		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=k;j++)
			{
				System.out.print(C[i][j]+"\t");
			}

			System.out.println();
		}

	}

}
