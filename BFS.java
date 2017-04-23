import java.io.*;
import java.util.*;

class BFS
{
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


		System.out.println("Enter the source :");

		int s=Integer.parseInt(xx.readLine());


		int n=graph.length;

		int color[]=new int[n];   //white->0 ; grey-> 1 ; black-> 2
		int d[]=new int[n];
		int proc[]=new int[n];


		for(int i=0;i<n;i++)
		{
			if(i==s)continue;

			color[i]=0;
			d[i]=Integer.MAX_VALUE;

			proc[i]=-1;

		}

		color[s]=1;
		d[s]=0;
		proc[s]=-1;

		LinkedList ll=new LinkedList();

		ll.add(s);

		while(!ll.isEmpty())
		{
			int u=(int)ll.removeFirst();

			System.out.println(u);

			for(int i=0;i<n;i++)
			{
				if(graph[u][i]==0)continue;

				if(color[i]==0)
				{
					color[i]=1;
					d[i]=d[u]+1;
					proc[i]=u;
					ll.add(i);
				}

			}

			color[u]=2;
		}

	}

}








