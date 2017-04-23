import java.io.*;

interface Windint
{
	void check(double i);
	void mile(double x);
	void beaufort(double x);
}



class Wind implements Windint

{
	double kmhr,knots,B;

	Wind(String s)
	{
		kmhr=Double.parseDouble(s);
	}


	public void check(double i)
	{
		if(i<2)
		System.out.println("The Wind is Calm");

		else if(i>120)
		System.out.println("The Wind is a European Windstorm");

		else
		System.out.println("The Wind Intensity is moderate");

	}


	public void mile(double x)
	{
		knots= x/1.852;
	}

	public void beaufort(double x)
	{
		double t=2/(double)3;
		B= Math.round(Math.pow((x/3.01),t));
	if(B>12)B=12;
	}

}

class TryWind

{

	public static void main(String args[])throws IOException

	{

		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));


		System.out.println("Enter the wind speed in km/hr");


		Wind o=new Wind(xx.readLine());

		o.check(o.kmhr);

		o.mile(o.kmhr);

		o.beaufort(o.kmhr);

		System.out.println("Wind Speed in Knots is :" + o.knots);

		System.out.println("Wind Speed in Beaufort Scale is  :" + o.B);

	}

}



