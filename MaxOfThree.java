import java.io.*;

class MaxOfThree
{
	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the three numbers :");

		int a=Integer.parseInt(xx.readLine());
		int b=Integer.parseInt(xx.readLine());
		int c=Integer.parseInt(xx.readLine());

		System.out.print("The max of the three numbers is : ");

		int temp;
		int max;

		max=(temp=a>b?a:b)>c?temp:c;

		System.out.println(max);
	}

}
