import java.io.*;

class DarkByte2

{

	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		String s[]=(xx.readLine()).split(" ");

		int M=Integer.parseInt(s[0]);
		int N=Integer.parseInt(s[1]);

		int k=Integer.parseInt(xx.readLine());

		int n=M*N;

		String a[][]=new String[M][N];

		for(int i=0;i<M;i++)
		{
			s=(xx.readLine()).split(" ");

			a[i]=s;

		}

		String dark[]=new String[M*N];

		int c=M+N-1;
		int l=0;

		for(int i=0;i<c;i++)
		{
			for(int j=0;j<M;j++)
			{
				for(int o=0;o<N;o++)
				{
					if((j+o)==i)
					dark[l++]=a[j][o];
				}

			}

		}

		System.out.println(dark[k-1]);

	}

}





