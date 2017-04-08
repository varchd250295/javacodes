import java.io.*;
import java.util.*;

class CodeJam_C
{
	public static void main(String args[])throws IOException
		{
			BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

			FileReader f;

			BufferedReader fin=new BufferedReader(f=new FileReader("input.txt"));

			int T=Integer.parseInt(fin.readLine());

			FileWriter fw=new FileWriter("C:\\USers\\Asus\\Desktop\\output.txt");
			int count=1;

			while((T--)>0)
			{
				StringTokenizer st=new StringTokenizer(fin.readLine());

				long n=Long.parseLong(st.nextToken());
				long k=Long.parseLong(st.nextToken());

				long kk=k;

				long l=-1;

				while(kk>0)
				{
					l++;
					kk=kk>>1;
				}
				//System.out.println(l);
				// 'l' now has the floor of log of k to the base 2 which is its level no. in the binary tree

				long num=1l;

				for(long i=0;i<l;i++)
				num=num<<1;
				//num now has the number of nodes in level 'l' which is numerically one more than the total number of nodes till level 'l'(exclusive, ofc).



				long a,b;

				if((n&1)!=0) //odd case
				a=(n>>1);
				else
				a=(n-1l)>>1;

				b=n>>1;


				long na,nb;
				na=nb=1;


				for(long i=1;i<l;i++)
				{

					if(((a&1)!=0) && ((b&1)==0)) //a= odd and b=even
					na=(na<<1)+nb;
					else if (((a&1)==0)&& ((b&1)!=0))
					nb=(nb<<1)+na;
					else
					{
						na=na<<1;
						nb=nb<<1;
					}

					a=(a-1)>>1;
					b=b>>1;


				}

				//System.out.println(a+"\t"+b+"\t"+na+"\t"+nb);

				if(k==1)
				{
					fw.write("Case #"+(count++)+": ");
					fw.write(String.valueOf(b));
					fw.write(" ");
					fw.write(String.valueOf(a));
					fw.write("\r\n");
					continue;
				}


				if(k<(num+nb))
				{
					fw.write("Case #"+(count++)+": ");
					fw.write(String.valueOf(b/2l));
					fw.write(" ");
					fw.write(String.valueOf((b-1l)/2));
					fw.write("\r\n");

				}
				else
				{
					fw.write("Case #"+(count++)+": ");
					fw.write(String.valueOf(a/2l));
					fw.write(" ");
					fw.write(String.valueOf((a-1l)/2));
					fw.write("\r\n");
				}



			}

			fw.close();
			f.close();


		}

	}
