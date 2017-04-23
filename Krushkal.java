import java.io.*;
import java.util.*;

class Krushkal
{


	static boolean cycle(int G[][],int s,LinkedList ll, int p)
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


		static void sort(int p[][],int n)
		{
			int temp;

			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(p[i][2]>p[j][2])
					{
						temp=p[i][0];
						p[i][0]=p[j][0];
						p[j][0]=temp;

						temp=p[i][1];
						p[i][1]=p[j][1];
						p[j][1]=temp;

						temp=p[i][2];
						p[i][2]=p[j][2];
						p[j][2]=temp;

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

			int c=-1;

			int p[][]=new int[(n*(n-1)/2)][3];

			for(int i=0;i<n;i++)
			{
				for(int j=i;j<n;j++)
				{
					if(G[i][j]>0)
					{
						p[++c][0]=i;
						p[c][1]=j;
						p[c][2]=G[i][j];
					}

				}

			}

			// 'c' now indicates the last index filled(thus, (c+1) gives the no. of edges in the initial graph)
			c++;

			sort(p,c);

			int GG[][]=new int[n][n];
			boolean flag=true;


			LinkedList ll;


			for(int i=0;i<c;i++,flag=true)
			{
				GG[(p[i][0])][(p[i][1])]=p[i][2];

				GG[(p[i][1])][(p[i][0])]=p[i][2];

				for(int j=0;j<n;j++)
				{
						ll=new LinkedList();

						flag=cycle(GG,j,ll,-1);

						if(flag==false) // indicating the presence of a cycle (true=no cycles)
						break;
				}


				if(!flag)
				{
					GG[(p[i][0])][(p[i][1])]=0;

					GG[(p[i][1])][(p[i][0])]=0;
				}
			}


			//compiling the edges in the new graph(mst)

			c=-1;

			p=new int[(n*(n-1)/2)][3];

						for(int i=0;i<n;i++)
						{
							for(int j=i;j<n;j++)
							{
								if(GG[i][j]>0)
								{
									p[++c][0]=i;
									p[c][1]=j;
									p[c][2]=GG[i][j];
								}

							}

						}

				System.out.println("The edges in MST are : ");

				for(int i=0;i<=c;i++)
				System.out.println(p[i][0]+"\t"+p[i][1]);

			}

		}



