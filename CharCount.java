import java.io.*;

class CharCount

{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a String(enter ~ to terminate)");

		String s;

		int space,tab,newline;
		space=tab=0;
		newline=-1;


		do{
			s=xx.readLine();
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==' ')space++;
				if(s.charAt(i)=='\t')tab++;
				if(s.charAt(i)=='\n')newline++;

			}
			newline++;

		}while(s.charAt(s.length()-1)!='~');

		System.out.println("Spaces = "+ space +" \n New Lines =" + newline +" \n Tabs =" + tab);


		}

	}

