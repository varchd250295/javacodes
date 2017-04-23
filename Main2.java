import java.io.*;

class Main1

{
	public static void main(String args[])throws IOException

	{
		System.out.println("In class : Main1");

	}

	public static void main()throws IOException
	{
		System.out.println("In class : Main1(again)");
	}

	public void main(int i)throws IOException //parameter used ONLY to distinguish this definition from the above definition(with no parameters)
	{
		System.out.println("In class : Main1(yet again)");
	}
}


class Main2
{
	public static void main(String args[])throws IOException//the main method from which the execution starts has to have the prototype as 'public static void main(String args[])' (the programs WILL compile but a runtime error stating the same will be elicited), but another main method in a class(not same as file name) can have any prototype for the main method.

	{
		System.out.println("In class: Main2");

		Main1.main(null);

		Main1.main();

		(new Main1()).main(0);
	}

}



