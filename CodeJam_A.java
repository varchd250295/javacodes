import java.io.*;
import java.util.*;

class CodeJam_A
{
	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		FileReader f;

		BufferedReader fin=new BufferedReader(f=new FileReader("C:\\Users\\Asus\\Desktop\\input.txt"));

		int T=Integer.parseInt(fin.readLine());

		FileWriter fw=new FileWriter("C:\\Users\\Asus\\Desktop\\output.txt");
		int cc=1;

		while((T--)>0)
		{

			StringTokenizer st=new StringTokenizer(fin.readLine());

			String s=st.nextToken();

			int k=Integer.parseInt(st.nextToken());

			int len=s.length();


			char ss[]=s.toCharArray();

			int count=0;

			for(int i=0;i<=(len-k);i++)
			{
				if(ss[i]=='+')
				continue;
				else
				{
					for(int j=0;j<k;j++)
					{
						if(ss[i+j]=='-')
						ss[i+j]='+';
						else
						ss[i+j]='-';
					}


					count++;

				}


			}

			if((String.valueOf(ss).indexOf('-'))!=-1)
			{
				fw.write("Case #"+(cc++)+": ");
				fw.write("IMPOSSIBLE");
				fw.write("\r\n");
			}
			else
			{
				fw.write("Case #"+(cc++)+": ");
				fw.write(String.valueOf(count));
				fw.write("\r\n");
			}

		}

		fw.close();
		f.close();

	}

}