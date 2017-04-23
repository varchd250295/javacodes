import java.io.*;
import java.util.*;

class LIS
{
	static int length=0;
	static int lis(int arr[],int n)  /// n-> n'th no. in the give array, that is, the number at index(n-1)
	{
		if(n==1)
		return 1; // base case. Note that 'n' cannot be '0' as 'tis the order of the number, not its index

		int temp;
		int locallength=1;//stores the length of the LIS upto the current iteration's value of 'n'

		for(int i=1;i<n;i++)
		{

			temp=lis(arr,i);

			if(arr[n-1]>arr[i-1] && (1 + temp)>locallength)
			locallength=1+temp;


		}

		length=(length<locallength)?locallength:length;

		return locallength;
	}





	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int arr[]={10,22,9,33,21,50,41,60,80};
		int n=arr.length;

		lis(arr,n);

		System.out.println(length);
	}
}

