import java.io.*;

class CrazyTree2

{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		String s[]=(xx.readLine()).split(" ");

		int L=Integer.parseInt(s[0]);

		int Q=Integer.parseInt(s[1]);
		int l=Math.pow(2,L);

		int arr[];

		for(int i=1;i<=l;i++)
		arr[i-1]=i;

		for(int i=0;i<Q;i++)
		{
			s=xx.readLine().split(" ");
			int x=Integer.parseInt(s[0]);
			int y=Integer.parseInt(s[1]);

			int d=L-y;
			int c=L;

			for(int j=0;j<d;j++)
			{
				for(int k=0,int l=0;k<c;k++)
				{
				 	arr[k]=

