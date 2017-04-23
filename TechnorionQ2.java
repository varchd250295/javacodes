import java.io.*;

class TechnorionQ2

{

	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int count=0;

		for(int i=1;i<=5000;i++)
		{
			if(((int)Math.pow((i+125),0.5))==((int)Math.pow(i,0.5)))
			count++;
		}


	System.out.println(count);
}

}
