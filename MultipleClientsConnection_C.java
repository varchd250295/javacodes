import java.io.*;
import java.net.*;

class MultipleClientsConnection_C
{

	public static void main(String args[])
	{
		Socket socket;
		String temp;
		int port;
		String ip;


		//port=Integer.parseInt(args[1]);
		//ip=args[0];

		port=8080;
		ip="127.0.0.1";

		try
		{
			socket=new Socket(ip,port);

			System.out.println("Connected to the server : "+socket.getRemoteSocketAddress());

			System.out.println("Type the messages to be sent(enter '~' to close connection");

			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			BufferedReader xx=new  BufferedReader(new InputStreamReader(System.in));

			while(!(temp=xx.readLine()).equals("~"))
			{



			}

			socket.close();



		}
		catch(IOException e)
		{
			System.out.println("IOException Occured!");
			e.printStackTrace();

		}

	}


}
