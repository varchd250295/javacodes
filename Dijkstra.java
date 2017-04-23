import java.io.*;
import java.util.*;

class Dijkstra
{
	static int p[],key[],G[][];

	static void relax(int u,int v)
	{
		if(key[v]>(key[u]+G[u][v]))
		{
			p[v]=u;
			key[v]=(key[u]+G[u][v]);
		}
	}

	static void shortestPath(int s,int d)
	{
		if(s==d)
		System.out.println(s);
		else
		{
			shortestPath(s,p[d]);
			System.out.println(d);
		}

	}

	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		 G=new int[][]{{0,4,0,0,0,0,0,8,0},
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

		p=new int[n];
		key=new int[n];


		Arrays.fill(key,Integer.MAX_VALUE);
		Arrays.fill(p,-1);

		System.out.println("Enter the source vertex : ");

		int s=Integer.parseInt(xx.readLine());

		key[s]=0;

		System.out.println("Enter the destination vertex :");

		int d=Integer.parseInt(xx.readLine());


		LinkedList Q=new LinkedList();
		LinkedList S=new LinkedList();


		for(int i=0;i<n;i++)
		Q.add(i);

		while(!Q.isEmpty())
		{
			int min=Integer.MAX_VALUE,u=0;
			int in=0;
			int temp;

			for(int i=0;i<Q.size();i++)
			{
				temp=(int)Q.get(i);
				if(key[temp]<min)
				{
					min=key[temp];
					u=temp;
					in=i;
				}

			}

			Q.remove(in);

			S.add(u);

			for(int i=0;i<n;i++)
			{
				if(G[u][i]==0)continue;

				relax(u,i);
			}

		}

		shortestPath(s,d);
	}
}







