import java.io.*;
import java.util.*;

class RodCutting_MEM
{

	static int val[];

	static int cut(int []p,int n)
	{
		if(val[n]>=0)return val[n];

		int q;

		if(n<=0)
		q=0;
		else
		{
			q=Integer.MIN_VALUE;
			for(int i=0;i<n;i++)
				q=Math.max(q,p[i]+cut(p,n-i-1));

		}

		val[n]=q;

		return val[n];
	}





	public static void main(String args[])throws IOException

		{
			BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

			int p[]={1,5,8,9,10,17,17,20};  // p[x-1] indicates the value/price of a rod piece of length 'x'


			int n=p.length; //the length of the given rod

			val=new int[n+1];
			Arrays.fill(val,Integer.MIN_VALUE);

			cut(p,n);


			System.out.println("The maximum revenue possible is : "+ val[n]);

		}

}
