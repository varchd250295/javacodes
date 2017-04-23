import java.io.*;

class MatrixChain_DP
{

	static int s[][];

	static int mat(int p[],int n)
	{
		int m[][]=new int[n][n];    // m[x][y] gives the minimum cost of multiplying matrices Ax to Ay;
		 s=new int[n-1][n];

		for(int i=0;i<n;i++)
		m[i][i]=0;

		for(int L=2;L<n;L++)
		{
			for(int i=1;i<(n-L+1);i++)
			{
				int j=i+L-1;

				m[i][j]=Integer.MAX_VALUE;

				for(int k=i;k<j;k++)
				{
					int count=m[i][k]+m[k+1][j]+ (p[i-1]*p[k]*p[j]);

					if(count<m[i][j])
					{
						m[i][j]=count;

						s[i][j]=k;
					}
				}

			}
		}
		//return m[1][n-1];
		return m[2][5];
	}


	static void printOpt(int i,int j)
	{
		if(i==j)
		System.out.print("A"+i);
		else
		{
			System.out.print("(");
			printOpt(i,s[i][j]);
			printOpt(s[i][j]+1,j);
			System.out.print(")");
		}
	}



	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int p[]={30,35,15,5,10,20,25};  // so we have 6 matrices, A1 through A6
		int n=p.length;

		System.out.println(mat(p,n));

		System.out.println(s[1][6]);

		printOpt(1,6);


	}

}

