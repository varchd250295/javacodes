import java.io.*;

class Complex
{

	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the two complex numbers(in the form 'a+ib', first a, then b)");

		Double a1=Double.parseDouble(xx.readLine());
		Double b1=Double.parseDouble(xx.readLine());
		Double a2=Double.parseDouble(xx.readLine());
		Double b2=Double.parseDouble(xx.readLine());

		if((b1+b2)<0)
		System.out.println("Sum : " +(a1+a2)+" -i "+Math.abs(b1+b2));

		else
		System.out.println("Sum : " +(a1+a2)+" +i" +(b1+b2));

		if((a1*b2+a2*b1)<0)
		System.out.println("Product : " +(a1*a2-b1*b2) + " -i "+ Math.abs(a1*b2+a2*b1));

		else
		System.out.println("Product : " +(a1*a2-b1*b2) + " +i "+ Math.abs(a1*b2+a2*b1));

	}

}

