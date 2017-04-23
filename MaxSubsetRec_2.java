import java.io.*;
import java.util.*;



class MaxSubsetRec
{

	static LinkedList ll;
	static int S;


	static boolean func(int set[],int in,int sum) 	// for any current iterations, 'in' contains the index of the current set's final element(basically, we keep considering elements from the right end and for every iterations(recursive call) we keep shrinking the set by '1', such that the elements to the left of and including the element at index 'in' are yet to be considered(whether to be included in the final subset or not)
												//'sum' contains the "sum so far" that is, for the current recrusive branch, after considering all of the elements beyond 'in', if any. ('Considering' means we may or may not have included the various elements beyond 'in'(in the bigger picture though, ALL possibilities are considered))

	{
		if(in<0)
		return false;

		if(sum + set[in]==S)
		{
			ll.add(set[in]);
			return true;
		}

		if(func(set,in-1,sum))
		{
			return true;
		}
		if(func(set,in-1,sum+set[in]))
		{
			ll.add(set[in]);
			return true;
		}

		return false;

	}



	public static void main(String args[])throws IOException
	{

		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Set : ");

		StringTokenizer st=new StringTokenizer(xx.readLine());
		int n=st.countTokens();

		int set[]=new int[n];

		for(int i=0;i<n;i++)
		set[i]=Integer.parseInt(st.nextToken());

		System.out.println("Enter the required sum :");
		S=Integer.parseInt(xx.readLine());

		ll=new LinkedList();

		func(set,n-1,0);

		if(ll.isEmpty())
		System.out.println("No such subsets exist!");
		else
		{
			System.out.println("The required subset is :");
			System.out.println(Arrays.toString(ll.toArray()));

		}

	}
}

