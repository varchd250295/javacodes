import java.io.*;

class DarkByteRev

{
	public static void main(String args[])throws IOException
		{
			BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a Number");
			String s=xx.readLine();

			String ss="";
			for(int i=0;i<s.length();i++)
			{
				ss=s.charAt(i)+ss;
			}

			if(ss.equals(s))
			System.out.println("TRUE");
			else
				System.out.println("FALSE");

			}


		}


