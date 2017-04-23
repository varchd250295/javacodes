import java.io.*;

//classic producer consumer shit- buffer size = 1(only one object stored at a time)

class Q
{
	int num;

	boolean available=false;

	synchronized void get()
	 {                                          // or synchronized(this)
		try
		{
			while(!available)
				wait();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted!!!");
		}


		System.out.println("Consumed!!!  product with tag - " +num);

		available=false;
		notifyAll();
	}

	synchronized void put(int i)
	{
		while(available)
		{
			try
			{
				wait();

			}
			catch(InterruptedException e)
			{
				System.out.println("Interrupted!!!");
			}
		}

		num=i;

		System.out.println("New stuff produced! tag- " +num);

		available=true;

		notifyAll();
	}

}


class Consumer implements Runnable

{
	Q q;

	Consumer(Q q)
	{
		this.q=q;

		new Thread(this,"Consumer").start();
	}


	public void run()
	{
		for(int i=0;i<10;i++)

		q.get();
	}

}


class Producer implements Runnable
{
	Q q;

	Producer(Q q)
	{
		this.q=q;

		new Thread(this,"Producer").start();

	}

	public void run()
	{

		for(int i=0;i<10;i++)
		q.put(i);
	}

}

class ProCon
{
	public static void main(String args[])
	{

		Q q=new Q();

		Producer p=new Producer(q);

		Consumer c=new Consumer(q);

	}

}









