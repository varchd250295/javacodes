import java.io.*;

class Winner
{ 	String y;
	int i=0;
	synchronized void win()
	{	i++;
		if(i==1)
		y=Thread.currentThread().getName();
	}


}


class Race implements Runnable
{
	Winner w;
	Thread t;

	Race(String s,Winner w)
	{
		this.w=w;
		t=new Thread(this,s);
		t.start();
	}

	public void run()
	{
		w.win();
	}

}


class ThreadRace

{
	public static void main(String args[])
	{
		Winner w=new Winner();

		Race r[]=new Race[100];

		for(int i=1;i<=100;i++)
		{
			r[i-1]=new Race((new Integer(i)).toString(),w);
		}


		try
		{
			for(int i=0;i<100;i++)
				r[i].t.join();

		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");

		}

		System.out.println("Winner = "+ w.y);

	}

}




