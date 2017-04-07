import java.io.*;
import java.util.*;
class CodeChef_April_1
{
	public static void main(String args[])throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

		int t=Integer.parseInt(buf.readLine());


		for(int i=0;i<t;i++)
		{
			String dish1[]=new String[4];
			String dish2="";
			int j=0,sim=0;

			StringTokenizer st1 = new StringTokenizer(buf.readLine()," ");
			while(st1.hasMoreTokens())
			{
				dish1[j++]=st1.nextToken();
			}

			StringTokenizer st2 = new StringTokenizer(buf.readLine()," ");
			while(st2.hasMoreTokens())
			{
				dish2=st2.nextToken();
				for(j=0;j<4;j++)
					if(dish1[j].equals(dish2)) sim++;
			}

			if(sim>1)
				System.out.println("similar");
			else
				System.out.println("dissimilar");

		}
	}
}