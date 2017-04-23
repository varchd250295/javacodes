import java.io.*;

abstract class Shape
{
	abstract int numberOfSides();

}

class Trapezoid
{

	int numberOfSides()
	{
		return 4;
	}

}

class Triangle

{
	int numberOfSides()
		{
			return 3;
		}
}

class Hexagon
{
	int numberOfSides()
	{
			return 6;
	}

}

class TryShape
{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the name of the shape(trapezoid, triangle or hexagon)");

		String s=xx.readLine();

		if(s.equalsIgnoreCase("trapezoid"))
		System.out.println("Number of sides =" + (new Trapezoid()).numberOfSides());

		if(s.equalsIgnoreCase("triangle"))
				System.out.println("Number of sides =" + (new Triangle()).numberOfSides());


		if(s.equalsIgnoreCase("hexagon"))
				System.out.println("Number of sides =" + (new Hexagon()).numberOfSides());


	}

}

