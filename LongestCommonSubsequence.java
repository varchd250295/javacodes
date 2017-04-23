import java.io.*;

class LongestCommonSubsequence
{

	static void lcsDisplay(String x,int b[][],int i,int j)
	{
		if(i==0 || j==0)return;

		if(b[i][j]==0)
		{
			lcsDisplay(x,b,i-1,j-1);
			System.out.print(x.charAt(i-1));
		}

		else if(b[i][j]==1)
			lcsDisplay(x,b,i,j-1);
		else
			lcsDisplay(x,b,i-1,j);

	}



	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the two strings :");

		String x=xx.readLine();
		String y=xx.readLine();

		int lx=x.length();
		int ly=y.length();

		int c[][]=new int[lx+1][ly+1];
		int b[][]=new int[lx+1][ly+1];  // 0->the diagonal arrow condition; the value(row) is a part of the subsequence, 1-> the left arrow condition it. the trimming of the 'y' string condition  .  2-> The upward arrow condition ie. the trimming of string 'x' condition

		for(int i=1;i<=lx;i++)
		{
			for(int j=1;j<=ly;j++)
			{
				if(x.charAt(i-1)==y.charAt(j-1))
				{
					c[i][j]=c[i-1][j-1]+1;
					b[i][j]=0;
				}
				else if(c[i-1][j]>=c[i][j-1]) // so we truncate the 'x' string
				{
					c[i][j]=c[i-1][j];
					b[i][j]=2;
				}
				else
				{
					c[i][j]=c[i][j-1];
					b[i][j]=1;

				}

			}

		}


		lcsDisplay(x,b,lx,ly);

		System.out.println();

	}

}


