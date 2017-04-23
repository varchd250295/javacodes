import java.io.*;

class Q2

{

	public static void main(String args[])throws IOException

	{

		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of test cases");

		int t=Integer.parseInt(xx.readLine());

		int b[]= new int[28];

		for(int i=0;i<26;i++)
			b[i]=i+65;

			b[26]=32;
			b[27]=46;



		int a[],f,k,ttt,tt,tem;
		char c,temp;


		for(int i=1;i<=t;i++)
		{	a=new int[28];

			String s=xx.readLine();

			int l=s.length();

			for(int j=0;j<l;j++)

			{
				c=s.charAt(j);
				f=(int)c;

				if(f>64 && f<92)
					a[f-65]++;

					else if(f==32)a[26]++;

					else if(f==46)a[27]++;


			}
			tem=l;
			for(int j=0,j<28;j++)
			{
				if(a[j]==0)
				{
					for(int h=0;

			for(int j=0;j<27;j++) //SORT
			{
				for(int z=j+1;z<28;z++)
					{
						if(a[j]<a[z])
						{
							ttt=a[j];
							tt=b[j];
							a[j]=a[z];
							b[j]=b[z];
							a[z]=ttt;
							b[z]=tt;
					     }

					     if(a[j]==a[i])
					     {
							 if(b[j]<b[z])
							 {
								 ttt=a[j];
								tt=b[j];
								a[j]=a[z];
								b[j]=b[z];
								a[z]=ttt;
							   b[z]=tt;

						     }

			             }

					 }

				 }
				 int pp=28
				for(int e=0;e<pp;j++)
				{
					if(a[e]==0)
					for(int r=0,


				System.out.println(b[0]);


			int d[]=new int[28];

			for(int z=0;z<28;z++)
				d[27-z]=b[z];

				System.out.println(b[27]);




			for(int z=0;z<l;z++)
			{   temp= s.charAt(z);
				for(int x=0;x<28;z++)
				  {if(temp==b[x])
				  	System.out.print(((char)d[x]));

				  }

			}

			System.out.println();

		}

	}

}



















