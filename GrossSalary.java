import java.io.*;

class GrossSalary
{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the basic salary");

		double bs=Double.parseDouble(xx.readLine());

		System.out.println("Gross Salary= "+((.2*bs)+(.8*bs)+bs));

	}

}

