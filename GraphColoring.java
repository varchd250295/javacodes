import java.io.*;
import java.util.*;


class GraphColoring
{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));


		int g[][]={
					{0,1,1,1},
					{1,0,1,0},
					{1,1,0,1},
					{1,0,1,0}};

		int n=g.length;

		int color[]=new int[n];  // colors are assumed to be numbered as 0,1,2.....
		Arrays.fill(color,-1);

		for(int i=0;i<n;i++)
		{
			int temp=0;

			for(int j=0;j<n;j++)
			{
				if(g[i][j]==0)
				continue;

				if(color[j]==temp)
				{
					temp++;
					j=-1;
				}
			}
			color[i]=temp;

		}


		System.out.println("The final vertex colors are :");

		for(int i=0;i<n;i++)
		System.out.println("Vertex "+(i)+" : "+color[i]);

	}

}
