import java.io.*;

class DarkByte4

{

	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));
		boolean flag=true;
		int k=Integer.parseInt(xx.readLine());

		String out="";

		for(int K=1;K<=k;K++)

		{
			int keep=0;
			int n=Integer.parseInt(xx.readLine());

			int count=2;
			int t=5;
			while(count!=n)
			{
				flag=true;

				int l=(int)Math.sqrt(t);
				for(int i=3;i<=l;i+=2)
				{
					if(t%i==0)
					{
						flag=false;
						break;
					}
				}
				if(flag)
				{
					count++;
					keep=t;
				}

				t+=2;
			}

			keep%=9;

			out+=keep+"\n";

		}

		System.out.println(out);

	}

}




