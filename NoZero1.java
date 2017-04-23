import java.io.*;

class NoZero1
{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter an integer");

		int n=Integer.parseInt(xx.readLine());

		String s="";

		while(n>0)
		{
			if(n%2==0)s="0"+s;
			else s="1"+s;
			n/=2;
		}

		while(s.length()<8)
		s="0"+s;

		if(s.charAt(0)=='0')s="1"+s.substring(1);

		int a=0;

		for(int i=7;i>=0;i--)
		if(s.charAt(i)=='1')a=a+(int)Math.pow(2,(7-i));

		System.out.println(a);

	}

}




