import java.io.*;

class Transpose
{
	public static void main(String args[])throws IOException

	{

		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the order of the  matrix");

		int m=Integer.parseInt(xx.readLine());
		int n=Integer.parseInt(xx.readLine());


		int a[][]=new int[m][n];
		System.out.println("Enter the elements of the matrix, row-wise");

		for(int i=0;i<m;i++)
		for(int j=0;j<n;j++)
		a[i][j]=Integer.parseInt(xx.readLine());

		for(int i=0;i<n;i++)
		{for(int j=0;j<m;j++)
		System.out.print(a[j][i] +"\t");
		System.out.println();
		}

	}

}




