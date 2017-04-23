import java.io.*;

class Fractional

{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a number :");

		float a=Float.parseFloat(xx.readLine());

		System.out.println(a-((int)a));

	}

}
