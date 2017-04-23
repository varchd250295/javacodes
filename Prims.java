import java.io.*;

class Prims
{
	static int p[][];

	static void mst(int [][]G,int n, int r)
	{
		int key[]=new int[n];
		p=new int[n*(n-1)/2][2];
		int c=-1;

		for(int i=0;i<n;i++)
			key[i]=9999;

		boolean check[]= new boolean[n]; // false means unvisited

		key[r]=0;

		boolean flag=true;

		while(flag)
		{
			int minkeyvalue=9999;
			int min=0;

			for(int j=0;j<n;j++)
			{
				if(check[j]==false && key[j]<=minkeyvalue)
					{
						min=j;
						minkeyvalue=key[j];
					}

			}

			check[min]=true;
			int track=0;

			for(int j=0;j<n;j++)
			{

				if(G[min][j]==0)continue;

				if(check[j]==false && G[min][j]<key[j])
				{
					key[j]=G[min][j];
					track=j;
				}

			}

			p[++c][0]=min;
			p[c][1]=track;


			flag=false;

			for(int j=0;j<n;j++)
			{
				if(check[j]==false)
				{
					flag=true;
					break;
				}
			}
		}

	}





	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int G[][]={{0,4,0,0,0,0,0,8,0},
				{4,0,8,0,0,0,0,11,0},
				{0,8,0,7,0,4,0,0,2},
				{0,0,7,0,9,14,0,0,0},
				{0,0,0,9,0,10,0,0,0},
				{0,0,4,14,10,0,2,0,0},
				{0,0,0,0,0,2,0,1,6},
				{8,11,0,0,0,0,1,0,7},
				{0,0,2,0,0,0,6,7,0}
			   };

		int n=G.length;

		mst(G,n,0);

		System.out.println("The following edges are included in the MST :");

		for(int i=0;i<(n-1);i++)
			System.out.println(p[i][0] + "\t" + p[i][1]);

		}

	}




