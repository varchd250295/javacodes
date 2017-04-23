import java.io.*;

class Palindrome

{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a String");

		String s= xx.readLine();
		boolean f=true;
		for(int i=0;i<(s.length()/2);i++)
		  if(s.charAt(i)!=s.charAt(s.length()-i-1))
		  	f=false;

		  	if(f)System.out.println("Palindrome");
		  	else System.out.println("Not Palindrome");

		}

	}

