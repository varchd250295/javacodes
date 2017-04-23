import java.io.*;

class DAAQ4
{
	static int count=0;
	static int k;
	static int r,c;

	static void func(int mat[][],int x,int y,int sum)
	{
		sum+=mat[x][y];

		if(sum==k && (x==(r-1)) && (y==(c-1)))
		{
			count++;
			return;
		}

		if(sum>k)
		return;


		if(sum<k)
		{
			if(x!=(r-1))
			func(mat,x+1,y,sum);

			if(y!=(c-1))
			func(mat,x,y+1,sum);
		}

		return;

	}




	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the value of 'k'");


		k=Integer.parseInt(xx.readLine());
		//System.out.println("Enter the number of rows and then the no. of columns");
		//int r=Integer.parseInt(xx.readLine());
		//int c=Integer.parseInt(xx.readLine());


		//int mat[][]=new int[r][c];

		int mat[][]={
						{1,2,3},
						{4,6,5},
						{3,2,1}
					};


		r=3;
		c=3;

		func(mat,0,0,0);

		System.out.println(count);
	}
}
