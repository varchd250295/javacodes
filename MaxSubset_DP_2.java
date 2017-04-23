import java.io.*;
import java.util.*;

class MaxSubset_DP
{




	public static void main(String args[])throws IOException
	{

		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Set : ");

		StringTokenizer st=new StringTokenizer(xx.readLine());
		int n=st.countTokens();

		int set[]=new int[n];

		for(int i=0;i<n;i++)
		set[i]=Integer.parseInt(st.nextToken());

		System.out.println("Enter the requires sum :");
		S=Integer.parseInt(xx.readLine());


