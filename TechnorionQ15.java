import java.io.*;

class TechnorionQ15

{

	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int n=100;
		int k=n-1;

		int count=0;


		count+=6*k;

		for(int i=k-1;i>=1;i--)
		{
			count=count+ (6*i - ((i+1)*2-1));

		}

		System.out.println(count);

	}
}

