import java.io.*;
import java.util.*;

class CodeJam_B
{
	public static void main(String args[])throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

		int i,j,k;

		int t=Integer.parseInt(buf.readLine());

		FileWriter fw = new FileWriter("C:\\Users\\Asus\\Desktop\\output.txt");

		for(k=1;k<=t;k++)
		{

			String n=buf.readLine();

			char s[]=n.toCharArray();
			int l=s.length;

			for(i=0;i<l-1;i++)
			{
				if(s[i]>s[i+1])
					{
						s[i]-=1;

						for(j=i+1;j<l;j++)
							s[j]='9';

						if(i!=0 && s[i]<s[i-1])
							{
								i=-1;
								continue;
							}
						else
							break;
					}

			}

			fw.write("Case " + "#" + k + ": ");

			for(i=0;i<l;i++)
				if(s[i]!='0')
					{
						for(j=i;j<l;j++)
							fw.write(s[j]);
						break;
					}

			fw.write("\r\n");

		}

		fw.close();

	}
}