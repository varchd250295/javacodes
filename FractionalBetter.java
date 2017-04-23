import java.io.*;

class FractionalBetter

{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a number :");

		String a=xx.readLine();

		int i=0;
		while(a.charAt(i)!='.')
			i++;

			if(a.charAt(a.length()-1)!='f')System.out.println("0"+a.substring(i));
			else
					System.out.println("0"+a.substring(i,a.length()-1));

	}

}
