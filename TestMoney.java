import java.io.*;

class Money
{

	float rupee,paise;

	Money(String s)
	{
		float t=Float.parseFloat(s);
		paise=t-(long)t;
		rupee=t-paise;

	}

	float add(Money a,Money b)
	{
		return a.rupee+a.paise+b.rupee+b.paise;

	}

	float subtract(Money a,Money b)
	{
		return a.rupee+a.paise-b.rupee -b.paise;
	}
}

class TestMoney
{
	public static void main(String args[])throws IOException

	{

		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the values");

		Money a=new Money(xx.readLine());
		Money b=new Money(xx.readLine());
		float s=a.add(a,b);
		float d=a.subtract(a,b);

		System.out.println("Sum ="+ ((long)s)+"  Rupee(s) and  " +Math.abs(Math.round((s-((long)s))*100)) + "  paise");
		System.out.println("Difference =" +((long)d)+"  Rupee(s) and  " +Math.abs(Math.round((d-((long)d))*100)) + "  paise");

	}

}

