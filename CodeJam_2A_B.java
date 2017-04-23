import java.io.*;
import java.util.*;

class CodeJam_2A_B
{
	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		FileReader f;

		int n,z,r,o,b,g,y,v,i,num,temp=0;
		boolean flag=true;
		char arr[],t;

		BufferedReader fin=new BufferedReader(f=new FileReader("C:\\Users\\Asus\\Desktop\\input.txt"));

		int T=Integer.parseInt(fin.readLine());

		FileWriter fw=new FileWriter("C:\\Users\\Asus\\Desktop\\output-B.txt");

		for(z=1;z<=T;z++)
		{

			flag=true;

			StringTokenizer st=new StringTokenizer(fin.readLine());

			num=Integer.parseInt(st.nextToken());
			arr=new char[num];

			r=Integer.parseInt(st.nextToken());
			o=Integer.parseInt(st.nextToken());

			y=Integer.parseInt(st.nextToken());
			g=Integer.parseInt(st.nextToken());

			b=Integer.parseInt(st.nextToken());
			v=Integer.parseInt(st.nextToken());

			n=num-1;

			while(n>=0)
			{

				temp=n;

				if((r>0 && (n+1)==num) || (r>0 && arr[n+1]!='R'))
				{
					arr[n--]='R';
					r--;
				}

				if((y>0 && (n+1)==num) || (y>0 && arr[n+1]!='Y'))
				{
						arr[n--]='Y';
						y--;
				}

				if((b>0 && (n+1)==num) || (b>0 && arr[n+1]!='B'))
				{
						arr[n--]='B';
						b--;
				}

				if(temp==n)
				{
					flag=false;
					break;
				}

			}

			fw.write("Case #" + z + ": ");

			if(arr[0]==arr[num-1])
			{
				if(arr[0]!=arr[num-2] && arr[num-1]!=arr[1])
				{
					t=arr[0];
					arr[0]=arr[num-1];
					arr[num-1]=t;
				}

				else flag=false;
			}

			if(flag==false)
				fw.write("IMPOSSIBLE");
			else
			{
				for(i=0;i<num;i++)
					fw.write(arr[i]);
			}

			fw.write("\r\n");

		}

		fw.close();
		f.close();

	}

}