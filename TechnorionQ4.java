import java.io.*;

class TechnorionQ4

{

	static boolean unique(long n)
	{

		String s=Long.toString(new Long(n));
		int nod=s.length();


		for(int i=0;i<nod;i++)
		{
			for(int j=i+1;j<nod;j++)
				if(s.charAt(i)==s.charAt(j))
				return false;

		}

		return true;

	}

	static int sod(long n)
	{
		int sum=0;

		while(n>0)
		{
			sum+=(n%10);

			n/=10;
		}

		return sum;
	}


	static boolean compare(String s1,String s2)//checks if the number of digits is same and that each of digits is identical(check if they are permutations of each other)

	{

		if(s1.length()!=s2.length())
			return false;

		boolean flag=false;

		int len=s1.length();

		for(int i=0;i<len;i++)
		{
			flag=false;

			for(int j=0;j<len;j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					flag=true;
					break;
				}
			}

				if(flag==false)
				return false;

		}

		return true;

	}









	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int count=0;

		String check="";

		boolean flag=true;


		for(long i=0;i<=9876543210l;i++)
		{
			if(!unique(i))
			continue;

			if(i%3!=0)
			continue;

			String temp[]=check.split(" ");
			int len=temp.length;

			flag=true;

			String t2=Long.toString(new Long(i));

			for(int j=0;j<len;j++)
			{
				String t1=temp[j];

				if(compare(t1,t2))
				{
					flag=false;
					break;
				}

			}

			if(flag==true)
			{
				count++;
				check=check+" " +t2;

				//System.out.println(check);
			}



		}

		System.out.println(count);
	}
}





