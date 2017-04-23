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

class TestCalc
{

	public static void main(String atrgs[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("What do you want to do? \n a.Add \n b.Subtract \n c.Multiply \n d.Divide");

		char c=(char)xx.read();
		String s=xx.readLine();


		System.out.println("Enter the 2 numbers");

		String s1=xx.readLine();
		String s2=xx.readLine(); //assuming both the numbers are of the same type(fractional or integral))

		Calc a=new Calc();

		boolean f1=false,f2=false;

		for(int i=0;i<s1.length();i++)
		if(s1.charAt(i)=='.'){f1=true;break;}

		for(int i=0;i<s2.length();i++)
		if(s2.charAt(i)=='.'){f2=true;break;}



		if(f1||f2)
			{
				double d1=Double.parseDouble(s1);
				double d2=Double.parseDouble(s2);

				if((double)(float)d1!=d1 || (double)(float)d2!=d2 )
					System.out.println(a.x(d1,d2,c));
				else
					System.out.println(a.x((float)d1,(float)d2,c));

			}

		else
			{
				long l1=Long.parseLong(s1);
				long l2=Long.parseLong(s2);

				if((long)(int)l1!=l1 || (long)(int)l2!=l2)
				System.out.println(a.x(l1,l2,c));
				else
				System.out.println(a.x((int)l1,(int)l2,c));

			}

	}

}









