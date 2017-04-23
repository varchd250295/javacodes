import java.io.*;

class Operations

{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 2 numbers :");

		int a= Integer.parseInt(xx.readLine());
		int b= Integer.parseInt(xx.readLine());

		System.out.println("Sum ="+(a+b));
		System.out.println("Difference ="+(a-b));
		System.out.println("Product ="+(a*b));
		System.out.println("Modulus ="+(a%b));
		System.out.println("Quotient =" + ((double)a/b));
		System.out.println("Left shift ="+ (a<<2));
		System.out.println("Right shift = "+(a>>>b));

	}

}


