import java.io.*;
import java.util.*;

class Graph2

{

	static void greedycoloring(int sub,LinkedList adj[])
	    {
	        int result[]=new int[sub];

	        Arrays.fill(result,-1);

	        result[0]= 0;



	        boolean available[]=new boolean[sub];

	     //   for(int cr=0;cr<sub;cr++)
	            //available[cr]=false;


	        for(int u=1;u<sub;u++)
	        {
	                Iterator <Integer> it=adj[u].iterator();

	                while(it.hasNext())
	                {
	                    int i=it.next();
	                    if(result[i]!=-1)
	                        available[result[i]]=true;
	                }


	                int cr;

	                for(cr=0;cr<sub;cr++)
	                    if(available[cr]==false)
	                        break;



	                result[u]=cr;

	                it=adj[u].iterator();

	                while(it.hasNext())
	                {
	                    int i=it.next();
	                    if(result[i]!=-1)
	                        available[result[i]]=false;
	                }


	        }

	        for (int u = 0; u < sub; u++)
	            System.out.println("Subject" + (u+1) + " :\t slot  "
	                                + result[u]);
    }

	static void addEdge(LinkedList subject[],int v,int w)
	{
	        subject[v].add(w);
	        subject[w].add(v);
    }

	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the no. of students");
		int st=Integer.parseInt(xx.readLine());

		System.out.println("Enter the no. of subjects");
		int sub=Integer.parseInt(xx.readLine());


		LinkedList students[]=new LinkedList[st];

		for(int i=0;i<st;i++)
		{
			students[i]=new LinkedList();
			System.out.println("Enter the subject choices(separated by spaces) for student "+ (i+1) + "(a choice has to be a number between 0 and " + (sub-1)+") :");

			String temp[]=(xx.readLine()).split(" ");  // taking all the subject choices in one line (StringTokenizer can also be used

			for(int j=0;j<(temp.length);j++)
			students[i].add(Integer.parseInt(temp[j]));

		}

		LinkedList subject[]=new LinkedList[sub];

		for(int i=0;i<sub;i++)
		subject[i]=new LinkedList();



		for(int i=0;i<st;i++)
		{

			int temp=students[i].size();

			for(int j=0;j<temp;j++)
			{
				for(int k=j;k<temp;k++)
				{
					if(j==k)continue;

					addEdge(subject,(int)(students[i].get(j)),(int)(students[i].get(k)));

				}

			}

		}


		greedycoloring(sub,subject);

	}

}







