import java.io.*;

class Resistance

{
	public static void main(String args[])throws IOException

	{

		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the value of the resistances");

		float r1=Float.parseFloat(xx.readLine());

		float r2=Float.parseFloat(xx.readLine());

		System.out.println("Equivalent Resistance = " +(1/((1/r1) + (1/r2))));

	}

}

