import java.io.*;
import java.util.*;

class DAAFinal_Q4

{

		static int m,n;


	static int func(int mat[][],int x,int y,int score)
	{
		score+=mat[x][y];

		if(score<=0)
		return 0;

		if(x==(m-1) && y==(n-1))
		return score;




		int temp1=0,temp2=0;

		if(x<(mat.length-1))
		{
			temp1=func(mat,x+1,y,score);

		}

		if(y<(mat.length-1))
		{
			temp2=func(mat,x,y+1,score);
			//System.out.println(temp2);

		}

		if(temp1>0  && temp2>0)
		return Math.min(temp1,temp2);
		else if(temp1>0 && temp2<=0)
		return temp1;
		else if(temp2>0 && temp1<=0)
		return temp2;
		else
		return 0;




	}

		public static void main(String args[])throws IOException

		{
			BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));


			/*System.out.println("Enter the order of the matrix");
			int length=Integer.parseInt(xx.readLine());


			System.out.println("Enter the matrix, row-wise");

			String temp[];
			int mat[][]=new int[length][length];

			for(int i=0;i<length;i++)
			{
				temp=(xx.readLine()).split(" ");

				for(int j=0;j<length;j++)
				{
					mat[i][j]=Integer.parseInt(temp[j]);

				}

			}*/

			int mat[][]={
							{5,6,-1,2},
							{0,-5,-10,5},
							{9,2,8,1},
							{-3,-2,1,4}};

			int length=4;


			System.out.println("Enter the values of m and n");

			m=Integer.parseInt(xx.readLine());
			n=Integer.parseInt(xx.readLine());


			System.out.println(func(mat,0,0,0));


	}

}






