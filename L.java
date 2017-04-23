import java.io.*;

class L

{


	public static String add(String a,String b)

	{

		int l1=a.length();
		int l2=b.length();

		int c,p,carry;
		String s="";
		if(l1>l2)
		c=l1;
		else c=l2;

		char q,w;
		for(int i=c-1;i>=0;i--)

		{
			q=a.charAt(i);
			w=b.charAt(i);

			int t=((int)q)-48 + ((int)w)-48 + carry;

			if(t>9)
			{
				s=(char)(t%10) +  s;
				carry=1;
			}

			else
			 {
				 s=(char)t + s;
				 carry=0;
			 }

			if(carry==1)s='1'+s;

			return s;

		}



	public static boolean mod(String a,String b)
	{
		int l1=a.length();
		int l2=b.length();
		String temp=a;
		int te;

		if(l1<l2)temp=a;
		else temp=b;
        te=temp.length();


		if(l1>l2)
		{
			 while(te<l1)
				{if(temp.equals(a))return true;
				 temp=add(temp,temp);
			   }

			}

			else

				{
					while(te<l2)

					{
						if(temp.equals(b)) return true;
						temp=add(temp,temp);
					}

				}

				return false;

       }

	public static void main(String args[]) throws IOException

  {
	BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));


	System.out.println("Enter the no. of test cases");



	int w=Integer.parseInt(xx.readLine());

	for(int q=1;q<=w;q++)

    {

	String l=xx.readLine();

	String fib[]=new String[l];fib[0]="1";
	String a="0",b="1",n=l;

	if(l==1)
	{
		System.out.println(1);
		System.exit(0);
	}

	for(int i=1;i<l;i++)
	{
		fib[i]=a+b;
		a=b;
		b=fib[i];

	}
    int p=l-1;
	for(int i=1;i<=l;i++)
	{
		long k=fib[i-1];
		for(int j=i;j<=p;j++)
			if((fib[j]%k)==0)n++;

	}

	System.out.println("\t" + (++n));

}


}

}












