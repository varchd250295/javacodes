import java.io.*;
import java.util.*;

class DFSFull   //traverses the entire graph in Depth-first manner(no source specified)
{
	static int n,time;
	static int[]proc,d,color,f;

	static void DFS_visit(int [][]G,int u)
	{
		time++;
		d[u]=time;
		color[u]=1;

		for(int i=0;i<n;i++)
		{

			if(G[u][i]==0)continue;

			if(color[i]==0)
			{
				System.out.println(i);
				proc[i]=u;
				DFS_visit(G,i);
			}

		}
		color[u]=2;
		time++;
		f[u]=time;
	}


	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader (new InputStreamReader(System.in));

		int [][]graph=	{
							{0,1,0,0,1,0,0,0},
							{1,0,0,0,0,1,0,0},
							{0,0,0,1,0,1,1,0},
							{0,0,1,0,0,0,1,1},
							{1,0,0,0,0,0,0,0},
							{0,1,1,0,0,0,1,1},
							{0,0,1,1,0,1,0,1},
							{0,0,0,1,0,0,1,0}
						};


		//System.out.println("Enter the source :");

		//int s=Integer.parseInt(xx.readLine());

		n=graph.length;

		proc=new int[n];
		color=new int[n];
		d=new int[n];
		f=new int[n];

		for(int i=0;i<n;i++)
			proc[i]=-1;

		time=0;
		for(int i=0;i<n;i++)
		{
			if(color[i]==0)
			{
				System.out.println(i);
				DFS_visit(graph,i);
			}
		}


	}

}



