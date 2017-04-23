import java.io.*;

class Rectangle

{
	float length=0,width=0, area=0;

	void get()throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the length and width of the rectangle");

		length=Float.parseFloat(xx.readLine());

		width=Float.parseFloat(xx.readLine());

	}

	void set()
	{
		if(length>0 && length<20 && width>0 && width<20)
		{
			area=length*width;
			System.out.println("Area = "+area);
		}

		else
		{
			System.out.println("Parameters out of specified range");
			System.exit(0);
		}

	}

}


class TestRectangle
{

	public static void  main(String args[])throws IOException

	{

		Rectangle a=new Rectangle();
		a.get();
		a.set();

	}

}



