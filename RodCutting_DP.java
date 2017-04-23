import java.io.*;

class RodCutting_DP
{


	static int cut(int []p,int n)
	{

		int val[]=new int[n+1];  // val[x] indicates the max revenue possible from cutting a rod of length 'x'

		val[0]=0;

		for(int i=1;i<=n;i++)  // i indicates the current length for which we are calculation the max revenue. Eg. if i=3, then we are calculating the subproblem for n=3 that is, we are calculating the max revenue from cutting a rod of length '3'
		{
			int q=Integer.MIN_VALUE;

			for(int j=0;j<i;j++)
				q=Math.max(q,(p[j]+val[i-j-1]));

			val[i]=q;
		}
		return val[n];
	}





	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int p[]={1,5,8,9,10,17,17,20};  // p[x-1] indicates the value/price of a rod piece of length 'x'


		int n=p.length; //the length of the given rod

		System.out.println("The maximum revenue possible is : "+ cut(p,n));

	}

}


