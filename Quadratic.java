import java.io.*;

class Quadratic

{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the value of the 3 constants 'a,b and c', in the standard form of quadratic equation");

		int a=Integer.parseInt(xx.readLine());
	    int b=Integer.parseInt(xx.readLine());
		int c=Integer.parseInt(xx.readLine());

		double d= Math.pow(b,2)-(4*a*c);

		if(d<0){System.out.println("Non-Real Roots");
				System.exit(0);}

		double r1= ((-b)+Math.pow(d,.5))/(2*a);

		double r2= ((-b)-Math.pow(d,.5))/(2*a);

		System.out.println("First Root = " +r1);

		System.out.println("Second Root = " +r2);

	}

}




