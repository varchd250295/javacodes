import java.io.*;
import java.util.*;

class CodeJam_1A_A
{
	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		FileReader f;

		int i=0,j=0,r,c,z;
		String s="";

		BufferedReader fin=new BufferedReader(f=new FileReader("C:\\Users\\Asus\\Desktop\\input.txt"));

		int T=Integer.parseInt(fin.readLine());

		FileWriter fw=new FileWriter("C:\\Users\\Asus\\Desktop\\output.txt");

		for(z=1;z<=T;z++)
		{

			StringTokenizer st=new StringTokenizer(fin.readLine());

			r=Integer.parseInt(st.nextToken());

			c=Integer.parseInt(st.nextToken());

			char grid[][]=new char [r][c];

			for(i=0;i<r;i++)
			{
				while (st.hasMoreTokens())
				{
					s=st.nextToken();
					System.out.println(s);
					grid[i] = s.toCharArray();
				}
			}

			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
					System.out.println(grid[i][j]);
				System.out.println();
			}

				fw.write("Case #" + z + ":\r\n");
	//			fw.write();
				fw.write("\r\n");

		}

		fw.close();
		f.close();

	}

}