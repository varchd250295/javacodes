import java.io.*;
import java.util.*;
import java.text.*;

// room no.s are stored in a 2d array with 3 rows, each representing a floor. For every floor, the rooms are numbered from 0-99, the first 50(0-49) being in Wing A and the rest in wing B;
//Wing A= 0, Wing B=1
//Room number format- *floor no.* *room index*, Eg. 049 is room 49 in wing A, ground floor. Room 098 is room 98 in Wing B, on the ground floor. 000 is also a valid room
class Room
{
	boolean status; //false=unoccupied

	boolean fac[]=new boolean[8];

	int cost; //per diem

	Room()
	{
		status=false;
		cost=0;
		Random r=new Random();

		for(int i=0;i<8;i++)
		{
			boolean temp=r.nextBoolean();

			fac[i]=temp;

			if(temp)
			cost+=500;

		}

	}

}

class Occupant
{

	String name;

	Date checkin;


	int roomno;


	Occupant()
	{
		name=null;
		checkin=null;
		roomno=-1;
	}

}





class HotelReservation

{
	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		String facname[]={"AC","Television","Personal Computer","International Calling","Laundry","Wi-fi","Safe","Valet"};

		Room room[][]=new Room[3][100]; //rows=floors and columns=no. of rooms per floor

		LinkedList guests=new LinkedList();

		String search;

		for(int i=0;i<300;i++)
			room[i/100][i%100]=new Room();

		int option;

		while(true)
		{
			System.out.println("What do you want to do? \n 1.Count Vacant Rooms \n 2.Allocate Room to visitor \n 3.Search for a visitor \n 4.Generate Bill \n 5.Exit Application \n");

			option=Integer.parseInt(xx.readLine());

			switch(option)
			{
				case 1:	int f[]={0,0,0};

						for(int i=0;i<300;i++)
						{
							if(room[i/100][i%100].status==false)
							f[i/100]++;

						}

						System.out.println(" No. of Vacant Rooms : \n Ground Floor - \t"+f[0]+"\n First Floor - \t" +f[1]+"\n Second Floor - \t"+f[2]);

						break;


				case 2:	System.out.println("Enter the name of the occupant");
						String name=xx.readLine();
						boolean check=false;


						while(true)
						{

							System.out.println("Pick from the following list of facilities and enter the desired facilities separated by space(single line, space-separated input)");

							for(int i=0;i<8;i++)
							System.out.println(i+". "+facname[i]);

							String in=xx.readLine();


							String choice[]=in.split(" ");
							boolean flag, flag2;


							flag2=true;


							for(int i=0;i<300;i++,flag2=true)
							{
								if(room[i/100][i%100].status==true)continue;

								boolean temp[]=room[i/100][i%100].fac;



								boolean choice2[]=new boolean[8];

								for(int k=0;k<choice.length;k++)
									choice2[Integer.parseInt(choice[k])]=true;



								for(int j=0;j<8;j++)
									if(choice2[j]!=temp[j])
									{
										flag2=false;
										break;
									}


								if(flag2==true) // Room meets the requirements
								{
									check=true;

									Occupant t=new Occupant();

									t.name=name;
									t.roomno=i;

									t.checkin=new Date();
									room[i/100][i%100].status=true;
									System.out.println("Congratulations "+name+"!!! You have been allocated room no : "+i);

									guests.add(t);

									break;
								}

							}

							if(check==false) // No room meets the requirements
							{
								System.out.println("No currently vacant room meets the stipulated requirements! Press '*' to cancel the allocation process or any other key to try again!");
								in=xx.readLine();

								if(in.equals("*"))
								break;


							}
							else
							break;

						}


						break;

				case 3: System.out.println("Enter the Visistor's name to be searched :");
						search=xx.readLine();
						boolean flag=false;

						for(int i=0;i<guests.size();i++)
						{
							if(((Occupant)guests.get(i)).name.equalsIgnoreCase(search))
							{
								flag=true;
								System.out.println("The guest is residing in room no. : "+((Occupant)guests.get(i)).roomno);
							}
						}

						if(flag==false)
						System.out.println("No such visitor found");

						break;

				case 4:	System.out.println("Enter the visitor's name whose bill is to be generated");

						search=xx.readLine();
						Date today=new Date();

						flag=false;

						for(int i=0;i<guests.size();i++)
						{
							if(((Occupant)guests.get(i)).name.equals(search))
							{
								Occupant temp=(Occupant)guests.get(i);
								flag=true;

								double diff=today.getTime()-temp.checkin.getTime();


								int noofdays=(int)Math.ceil(diff/(1000*24*60*60));

								System.out.println("No  of days : "+noofdays);


								double bill=noofdays*room[temp.roomno/100][temp.roomno%100].cost;

								room[temp.roomno/100][temp.roomno%100].status=false;

								guests.remove(temp);

								System.out.println("Your bill :  Rs. " + bill);

								break;

							}
						}


						if(flag==false)
						System.out.println("No such visitor found");
						break;

				case 5: System.exit(0);

			}

		}

	}

}

















