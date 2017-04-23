import java.io.*;

class AmountToWords

{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter amount(<=1,00,000)");

		int a=Integer.parseInt(xx.readLine());

		System.out.println("Amount in words : " + words(a));

	}


	static String words(int a)
	{
		if(a==1000000)
		return "One Lakh";

		String s="";

		String x[]={"","one","two","three","four","five","six","seven","eight","nine"};

		String y[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

		String z[]={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};



		if(a/10000!=1)
		{
			s=s+z[a/10000] + " ";
			s=s+x[(a/1000)%10];
		}

		else

		s=s+y[(a/1000)%10];

		if(a/1000!=0)
		s=s+ " thousand ";

		s=s+x[(a/100)%10];

		if((a/100)%10!=0)
		s=s+ " hundred ";

		if(Integer.toString(a).length()>2 && (a%100!=0))
		s=s+ " and ";

		if((a/10)%10!=1)
		{
			s=s+ z[(a/10)%10] + " ";

			s=s+ x[a%10];
		}
		else
		s=s+y[(a/10)%10] + " ";

		return s;
	}

}






