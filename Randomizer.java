import java.io.*;
import java.util.Random;

class Randomizer
{
	public static void main(String args[])throws IOException

	{

		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of random  numbers");
		int n=Integer.parseInt(xx.readLine());


		System.out.println("Enter the range for the random numbers");
		int lb=Integer.parseInt(xx.readLine());
		int ub=Integer.parseInt(xx.readLine());

		int sum=0;
		double avg;
		Random r=new Random();
		int a;


		for(int i=1;i<=n;i++)
		{

			a=r.nextInt((ub-lb)+1)+lb;// nextInt(int x) generates a random int value between 0(inclusive) and x(exclusive)
			sum+=a;
		}

		avg=((double)sum)/n;


		System.out.println("Sum =" +sum + "\n Average =" + avg);

		for(int i=0;i<n;i++)
		System.out.print("*");
	}

}
