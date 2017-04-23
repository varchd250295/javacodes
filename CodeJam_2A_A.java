import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

class CodeJam_2A_A
{
	public static void main(String args[])throws IOException
	{
		Scanner inp=new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		int T=inp.nextInt();
		int i,n;
		long k[],s[],d;
		Double time,temp;

		FileWriter fw=new FileWriter("C:\\Users\\Asus\\Desktop\\output.txt");

		for(i=0; i<T; i++)
		{
			d=inp.nextLong();
			n=inp.nextInt();
			k=new long[n];
			s=new long[n];

			for(int j=0; j<n; j++)
			{
				k[j]=inp.nextLong();
				s[j]=inp.nextLong();
			}

			time=((double)d-k[n-1])/s[n-1];

			for(int j=n-2; j>=0; j--)
			{
				temp=((double)d-k[j])/s[j];

				if(temp>time)
					time=temp;
			}

			DecimalFormat df = new DecimalFormat("#.000000");
			fw.write("Case #"+(i+1)+": "+df.format(((double)d/time))+"\r\n");
		}

		fw.close();

	}
}