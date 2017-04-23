import java.io.*;

class ComplexNumbers
{
	float r1,r2,i1,i2;

	ComplexNumbers()throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the 2 complex numbers(first the real part and then  the imaginary part)");

		r1=Float.parseFloat(xx.readLine());
		i1=Float.parseFloat(xx.readLine());
		r2=Float.parseFloat(xx.readLine());
		i2=Float.parseFloat(xx.readLine());

	}

	String add()
	{
		if((i1+i2)>=0)
					return (Float.toString(r1+r2)+ " + i" + Float.toString(i1+i2));
					else
					return (Float.toString(r1+r2) + " - i" + Float.toString(Math.abs(i1+
					i2)));
	}

	String diff()
	{		if((i1-i2)>=0)
			return (Float.toString(r1-r2)+ " + i" + Float.toString(i1-i2));
			else
			return (Float.toString(r1-r2) + " - i" + Float.toString(Math.abs(i1-i2)));

	}

}

class TestComplexNumbers

{

	public static void main(String args[])throws IOException

	{

		ComplexNumbers a=new ComplexNumbers();

		System.out.println("Sum = "+a.add());

		System.out.println("Difference = "+a.diff());

	}

}




