import java.io.*;

public class PT1

{

   public static void main(String[] args)

   {

      C ob = new C();

      Producer p1 = new Producer(ob, 1);

      Consumer c1 = new Consumer(ob, 1);
		p1.setPriority(10);
      p1.start();


      c1.start();

   }

}

class C

{

   private int contents;

   private boolean available = false;

   public synchronized int get()

   {

      while (available == false)

                  {

         try

                                 {

            wait();

         }

         catch (InterruptedException e) {  }

      }

     available = false;

      notifyAll();

      return contents;

   }

   public synchronized void put(int value)

   {

      while (available == true)

                  {

         try {

                                                                wait();

                                                }

         catch (InterruptedException e) {}

      }

      contents = value;

      available = true;

      notifyAll();

   }

}



class Consumer extends Thread

{

   private C ob1;

   private int number;

   public Consumer(C ob2, int number)

   {

      ob1 = ob2;

      this.number = number;

   }

   public void run()

   {

      int value = 0;

         for (int i = 0; i < 10; i++)

                                {

            value = ob1.get();

            System.out.println("Consumer #"+ this.number+ " got: " + value);

                                }

                }

}



class Producer extends Thread

{

                private C ob1;

                private int number;



                public Producer(C ob2, int number)

                {

                                ob1 = ob2;

                                this.number = number;

                }



                public void run()

                {

                                for (int i = 0; i < 10; i++)

                                {

                                                ob1.put(i);

                                                System.out.println("Producer #" + this.number+ " put: " + i);

                                try {

                                                                sleep(100);

                                                } catch (InterruptedException e) { }

                                }

                }

}
