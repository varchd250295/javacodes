import java.io.*;

class TechnorionQ16

{


	static boolean checkzero(int n)
	{
		while(n>0)
		{
			if(n%10==0)
			return true;

			n/=10;

		}

		return false;
	}

	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int a,b,c,temp;
		int count=0;
		int l1=0,l2=0,l3=0;

		for(int i=100;i<=999;i++,l1=0,l2=0,l3=0)
		{
			if(checkzero(i))continue;

			a=i;
			b=(a%100)*10 + (a/100);
			c=(a%10)*100 + (a/10);

			if(a>=b && a>=c)
			{
				l3=a;

				l1=b;
				l2=c;
			}


			else if(b>=a && b>=c)
			{
				l3=b;

				l1=a;
				l2=c;
			}


			else if(c>=b && c>=a)
			{
				l3=c;

				l1=a;
				l2=b;
			}

			if(l1>l2)
			{
				temp=l1;
				l1=l2;
				l2=temp;
			}


			if((((double)l2)/l1) == (((double)l3)/l2))
			{
				System.out.println(l1+"\t"+l2+"\t"+l3);
				count++;
			}

		}

		System.out.println(count);

	}

}








