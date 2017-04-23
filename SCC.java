import java.io.*;
import java.util.*;

class SCC
{
	static int time=0,n;
	static int[]color,d,f;
	static LinkedList ll;

	static int G[][]={
						{0,0,0,0,1,0,0,0},
						{1,0,0,0,0,0,0,0},
						{0,1,0,1,0,0,0,0},
						{0,0,1,0,0,0,0,0},
						{0,1,0,0,0,0,0,0},
						{0,1,0,0,1,0,1,0},
						{0,0,1,0,0,1,0,0},
						{0,0,0,1,0,0,1,1}
					};

	static void DFS(int u,boolean flag)
	{
		d[u]=++time;

		color[u]=1;

		for(int i=0;i<n;i++)
		{
			if(G[u][i]==0)continue;

			if(color[i]==0)
			{
				if(flag==true)
				System.out.print("\t"+i);

				DFS(i,flag);
			}

		}

		color[u]=2;

		f[u]=++time;

		if(flag==false)
		ll.addFirst(u);
	}


	public static void main(String args[])throws IOException

	{

		BufferedReader xx=new BufferedReader (new InputStreamReader(System.in));

		n=G.length;

		color=new int[n];
		f=new int[n];
		d=new int[n];

		ll=new LinkedList();



		//first DFS

		for(int i=0;i<n;i++)
		{
			if(color[i]==0)
			DFS(i,false);
		}

		//for(int i=0;i<n;i++)
		//System.out.println(ll.get(i));


		color=new int[n];

		//transpose
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int temp=G[i][j];
				G[i][j]=G[j][i];
				G[j][i]=temp;
			}
		}



		//second DFS

		for(int i=0;i<n;i++)
		{
			int temp=(int)ll.get(i);

			//System.out.println(temp);
			if(color[temp]==0)
			{
				System.out.print(temp);
				DFS(temp,true);
				System.out.println();
			}

		}
					//System.out.println(color[0]);


	}

}





