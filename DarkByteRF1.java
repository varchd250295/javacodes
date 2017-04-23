import java.io.*;

class DarkByteRF1

{

	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int n=Integer.parseInt(xx.readLine());

		System.out.println((n<<6)+(n<<3));
	}

}


