import java.io.*;

class TechnorionQ18

{

	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));


		int cuts=2;
		int inc=1;

		for(int i=2;i<=99;i++)
		{
			inc++;

			cuts+=inc;

			System.out.println("No. of lines ="+i+"\t" + "Cuts = "+cuts);

		}

	}

}
