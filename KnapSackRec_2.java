import java.io.*;

class KnapSackRec

{

	static int knapsack(int W,int wt[],int val[],int n)  // 'n' contains the current item under consideration i.e. the n'th item in the sequence (index being (n-1) for the corresponding value and weight arrays)
	// 'W' signifies the currently remaining weight that can be used
	{

		if(W==0 || n==0)
		return 0;

		//now, we must account for the case when the weight of the current object is greater than the remaining cpaacity of the knapsack , thus eliminating the need for the W<=0 condition in the preceding line(W==0 will suffice)

		if(wt[n-1]>W)
		return knapsack(W,wt,val,(n-1));   // n'th item not included

		else
			return Math.max((val[n-1] + knapsack((W-wt[n-1]),wt,val,(n-1))), knapsack(W,wt,val,(n-1)));

	}




	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int val[]={12,10,8,11,14,7,9};
		int wt[]={4,6,5,7,3,1,6};

		int W=18;
		int n=val.length;

		int maxVal=knapsack(W,wt,val,n);

		System.out.println(maxVal);
	}

}

