import java.io.*;

class RodCutting_Rec
{

	static int cut(int []p,int n)   // n is the length of the current piece under consideration
	{
		if(n<=0)return 0;

		int q=Integer.MIN_VALUE;

		for(int i=0;i<n;i++)
			q=Math.max(q,p[i]+cut(p,(n-i-1)));

		return 	q;
	}



	public static void main(String args[])throws IOException

		{
			BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

			int p[]={1,5,8,9,10,17,17,20};  // p[x-1] indicates the value/price of a rod piece of length 'x'


			int n=p.length; //the length of the given rod


			System.out.println("The maximum revenue possible is : "+ cut(p,n));
		}
	}

