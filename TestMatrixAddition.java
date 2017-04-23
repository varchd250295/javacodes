import java.io.*;

class MatrixAddition

{

	void  add(int a[][],int b[][])
	{
		for(int i=0;i<a.length;i++)
		{for(int j=0;j<a[0].length;j++)
		display(a[i][j]+b[i][j]);
		System.out.println();
		}

	}

	void display(int x)
	{
		System.out.print(x+"\t");

	}

}

class TestMatrixAddition

{

	public static void main(String args[])throws IOException

	{

		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the order of the first matrix");
		String s1=xx.readLine();

		System.out.println("Enter the order of the second matrix");
		String s2=xx.readLine();

		if(!(s1.equals(s2)))
		{
			System.out.println("The matrices aren't compatible for addition");
			System.exit(0);
		}

		String q[]=s1.split("x");
		int m=Integer.parseInt(q[0]);
		int n=Integer.parseInt(q[1]);

		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		System.out.println("Enter the elements of the first matrix");

		for(int i=0;i<m;i++)
		for(int j=0;j<n;j++)
		a[i][j]=Integer.parseInt(xx.readLine());


		System.out.println("Enter the elements of the second matrix");

		for(int i=0;i<m;i++)
		for(int j=0;j<n;j++)
		b[i][j]=Integer.parseInt(xx.readLine());


		MatrixAddition o=new MatrixAddition();
		o.add(a,b);
	}
}


