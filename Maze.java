import java.io.*;

class Maze

{
	int j=-1;
	int C,R,x,y;
	int a[]=new int[1000];
	int m[][]={{1,0,0,1,1,1,1,1},{1,1,0,0,0,0,0,1},{1,1,0,1,0,1,1,1},{1,1,0,1,1,1,1,1},{1,1,0,1,1,1,1,1},{1,1,0,0,0,1,1,1},{1,1,0,1,0,1,1,1},{1,1,0,1,0,0,1,1},{1,1,1,1,1,0,1,1}};


	 int mazeRec(int r,int c,int i)

	{
		if(i!=0)
		a[++j]=i;

		if(c==C && r==R)
		return 1;

		if(r!=0 && i!=3)
		{
			if(m[r-1][c]!=1)
			{
				if(mazeRec(r-1,c,1)==1)
				return 1;
			}

		}


		if(c!=(y-1) && i!=4)

		{
			if(m[r][c+1]!=1)
			{
				if(mazeRec(r,c+1,2)==1)
				return 1;
			}

		}


		if(r!=(x-1) && i!=1)
		{
			if(m[r+1][c]!=1)
			{
				if(mazeRec(r+1,c,3)==1)
				return 1;
			}

		}

		if(c!=0 && i!=2)
		{
			if(m[r][c-1]!=1)
			{
				if(mazeRec(r,c-1,4)==1)
				return 1;
			}
		}

		a[j--]=0;
		return 0;

	}

	int main()

	{	int r,c,k=0;
		System.out.println("Enter the starting indices(row, then column)");
		scanf("%d",&r);
		scanf("%d",&c);

		int l=z.mazeRec(r,c,0);


		while(z.a[k]!=0)
		{
			if(z.a[k]==1)
			System.out.println("Up");

			if(z.a[k]==2)
			System.out.println("Right");

			if(z.a[k]==3)
			System.out.println("Down");

			if(z.a[k]==4)
			System.out.println("Left");
			k++;
		}

	}

}






