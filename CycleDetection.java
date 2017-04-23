import java.io.*;
import java.util.*;


class CycleDetection  // only for connected graphs
{

		static boolean cycle(int G[][],int s,LinkedList ll, int p) // 'p' is the parent vertex of the current vertex 's'
		{
				//checking if the current element 's' is already in the visited list

				for(int i=0;i<ll.size();i++)
				{
					if(s==((int)(ll.get(i))))
						return false;

				}

				//pushing the current element to the list
				ll.add(s);

				boolean flag=true;


				//recursive call

				for(int i=0;i<G.length;i++)
				{
					if(i!=p && i!=s && G[s][i]!=0)
					flag=cycle(G,i,ll,s);

					if(flag==false)
					return false;

				}

				return true;
		}









	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int G[][]=	{	{0,1,0,1,0,0},
						{1,0,1,0,0,0},
						{0,1,0,0,0,0},
						{1,0,0,0,1,1},
						{0,0,0,1,0,1},
						{0,0,0,1,1,0},
					};

		int n=G.length;

		LinkedList ll=new LinkedList();

		if(cycle(G,0,ll,-1))
		System.out.println("No Cycles!!!");
		else
		System.out.println("Cycle Exists!!!");

	}

}



