import java.io.*;

public class Palindrome_2

{
	public static void (String args[])throws IOException

	{
		BufferedReader xx= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a String");

		String s= xx.readLine();

		int space=tab=newline=0;

		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')space++;
			if(s.charAt(i)=='\t')tab++;
			if(s.charAt(i)=='\n')newline++;
		}

		System.out.println("Spaces = "+ space +" \n New Lines =" + newline +" \n Tabs" + tab);


		}

	}

