import java.io.*;
class Calc

{

	double x(int a,int b,char c)
	{
		switch(c)
		{
			case 'a' : return (double)a+b;
			case 'b' :return (double)a-b;
			case 'c': return a*(double)b;
			case 'd' : return a/(double)b;
			default : return 0;
		}
	}



	double x(long a,long b,char c)
	{
		switch(c)
			{
				case 'a' : return (double)a+b;
				case 'b' :return (double)a-b;
				case 'c': return a*(double)b;
				case 'd' : return a/(double)b;
				default : return 0;
			}
	}


	double x(double a,double b,char c)

	{
		switch(c)
		{
				case 'a' : return a+b;
				case 'b' :return a-b;
				case 'c': return a*b;
				case 'd' : return a/b;
				default : return 0;
			}
	}

	double x(float a,float b,char c)
	{
		switch(c)
				{
					case 'a' : return (double)a+b;
					case 'b' :return (double)a-b;
					case 'c': return (double)a*b;
					case 'd' : return (double)a/b;
					default : return 0;
				}
	}



}

class TextCalc
{

	public static void main(String atrgs[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("What do you want to do? \n a.Add \n b.Subtract \n c.Multiply \n d.Divide");

		char c=(char)xx.read();
		String s=xx.readLine();


		System.out.println("Enter the 2 numbers");

		String s1=xx.readLine();
		String s2=xx.readLine(); //assuming both the numbers of the same datatype

		Calc a=new Calc();

		boolean f=false;

		for(int i=0;i<s1.length();i++)
		if(s1.charAt(i)=='.'){f=true;break;}



		if(f)
			{
				System.out.println("Are the numbers : single precision(float)->1 or double precision(double)->2?");
				if(Integer.parseInt(xx.readLine())==1)
					System.out.println(a.x(Float.parseFloat(s1),Float.parseFloat(s2),c));
				else
					System.out.println(a.x(Double.parseDouble(s1),Double.parseDouble(s2),c));

			}

		else
			{
				System.out.println("Int datatype->1 or Long ->2)");
				if(Integer.parseInt(xx.readLine())==1)
				System.out.println(a.x(Integer.parseInt(s1),Integer.parseInt(s2),c));
				else
				System.out.println(a.x(Long.parseLong(s1),Long.parseLong(s2),c));

			}

	}

}









