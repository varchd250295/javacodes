import java.io.*;
import java.util.*;

class LIS_DP
{
	static int val[];
	static int lis(int []arr,int n)
	{
	 val=new int[n];  // val[x] stores the length of the LIS till the index x(inclusive)

		Arrays.fill(val,1);

		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]>arr[j] && 1+val[j]>val[i])
				val[i]=1+val[j];

			}

		}
		int max=0;


		for(int i=0;i<n;i++)
		max=max<val[i]?val[i]:max;


		return max;
	}



	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int arr[]={10,22,9,33,21,50,41,60,80};
		int n=arr.length;

		int length=lis(arr,n);

		System.out.println(length);

		System.out.println(Arrays.toString(val));
	}
}

