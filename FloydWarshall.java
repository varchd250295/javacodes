import java.io.*;
import java.util.*;

class FloydWarshall    // for the given graph 'G'the weight value for 2 vertices not directly connected is infinity while that for the same vertex(say, x to x) is 0
{
	static final int max=Integer.MAX_VALUE;
	static int G[][]={
						{0,3,8,max,-4},
						{max,0,max,1,7},
						{max,4,0,max,max},
						{2,max,-5,0,max},
						{max,max,max,6,0}
					};
	static int[][] p;

	static void displayPath(int u,int v)
	{
		if(u==v)
		System.out.println(u);
		else if(p[u][v]==max)
		System.out.println("No Path");
		else
		{
			displayPath(u,p[u][v]);
			System.out.println(v);
		}
	}


	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int n=G.length;

		p=new int[n][n];
		int pn[][];

		int Gn[][];
		int temp;


		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j && G[i][j]<max)
				p[i][j]=i;
			}
		}


		for(int k=0;k<n;k++)
		{
			Gn=new int[n][n];
			pn=new int[n][n];

			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{

					if(G[i][k] ==max || G[k][j]==max)  // simulating the mathematical infinity
					temp=max;
					else
					temp=G[i][k]+G[k][j];

					if(G[i][j]<=temp)
					{
						Gn[i][j]=G[i][j];
						pn[i][j]=p[i][j];
					}
					else
					{
						Gn[i][j]=temp;
						pn[i][j]=p[k][j];
					}

				}

			}

			G=Gn;
			p=pn;
		}

		//printing the final matrix

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(G[i][j]==max)
				System.out.print("~"+"\t");
				else
				System.out.print(G[i][j] + "\t");
			}

			System.out.println();
		}


		displayPath(0,2);

	}


}

