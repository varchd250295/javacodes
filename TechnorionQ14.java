import java.io.*;

class TechnorionQ14

{

	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int sum;

		for(int i=1;i<=100;i++)
		{
			sum=0;

			for(int j=i;;j++)
			{
				sum+=j;
				if(sum==101)
				System.out.println(i+" to " + j);

				else if(sum>101)
				break;

			}

		}

	}
}


