import java.io.*;

class Bullshit

{
	int x=5,y=7;
	int g;
	int m[][]={{1,1,1,1,1,1,1},{0,0,0,0,1,1,1},{1,1,0,0,1,1,1},{1,1,0,0,0,1,1},{1,1,1,1,0,1,1}};

	int f(int r,int c)
	{
		if((r-1)>=0)
		{
			if(m[r-1][c]==0)
			g=f(r-1,c);

		}

		if((c+1)<=(y-1))
		{
			if(m[r][c+1]==0)
			g=f(r,c+1);
		}

		if((r+1)<=(x-1))
		{
			if(m[r+1][c]==0)
			g=f(r+1,c);
		}

		if((c-1)>=0)
		{
			if(m[r][c-1]==0)
			g=f(r,c-1);
		}

		m[r][c]=2;

		return 0;

	}


	public static void main(String args[])throws IOException
	{

		Bullshit z=new Bullshit();

		int t=z.f(1,0);



		for(int i=0;i<5;i++)
		{
			for(int j=0;j<7;j++)
			System.out.print(z.m[i][j]);

			System.out.println();

		}

	}

}



