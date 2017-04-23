import java.io.*;

class MatrixChain_Rec
{

	static int mat(int p[],int i,int j)
	{
		if(i==j)return 0;

		int min=Integer.MAX_VALUE;

		for(int k=i;k<j;k++)
		{
			int count=mat(p,i,k)+mat(p,k+1,j)+(p[i-1]*p[k]*p[j]);

			min=Math.min(min,count);
		}

		return min;
	}




	public static void main(String args[])throws IOException

	{
	BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

	int p[]={30,35,15,5,10,20,25};
	int n=p.length;

	System.out.println(mat(p,1,n-1));   // (n-1) is the max value that 'j' can take which is equal to the number of matrices. Therefore, the number of matrices is equal to (the size of the array 'p'-1) i.e. equal in value to the last index of the array 'p'
	System.out.println(mat(p,2,5));


	}


}


