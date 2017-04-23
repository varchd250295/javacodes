import java.io.*;

class DarkByte1

{
	static int counter=2;

	static boolean dark(int n)
	{
		if(counter>n)
		return true;

		if(n%counter==0)
		return false;

		int next=n-(n/counter);

		counter++;

		return dark(next);
	}

	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int N=Integer.parseInt(xx.readLine());

		for(int i=1;i<=N;i++)
		{
			if(dark(i))
				System.out.print(i +"\t");

			counter=2;

		}

	}

}



