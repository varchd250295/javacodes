import java.io.*;

class NoZero
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
			if(n%2==1)s="1"+s;
			n/=2;
		}

		while(s.length()<8)
			s="0"+s;

		String ss="";

		if(s.charAt(0)=='0')
		{
		 ss=ss+"1";
		 for(int i=1;i<(s.length());i++)
		  ss=ss + s.charAt(i);
	    }

	    else ss=s;

	    int a=0;
	System.out.println(ss);
		for(int i=(ss.length()-1),j=0;i>=0;i--,j++)

				if(ss.charAt(i)=='1')a=a+(int)Math.pow(2,j);


		System.out.println(a);

	}

}