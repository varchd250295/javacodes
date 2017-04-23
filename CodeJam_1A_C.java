import java.io.*;
import java.util.*;

class CodeJam_1A_C
{
	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		FileReader f;

		int i=0,j=0,z,hd,ad,hk,ak,b,d,health_d,attack_d,count,cure=0,h=0;

		BufferedReader fin=new BufferedReader(f=new FileReader("C:\\Users\\Asus\\Desktop\\input.txt"));

		int T=Integer.parseInt(fin.readLine());

		FileWriter fw=new FileWriter("C:\\Users\\Asus\\Desktop\\output.txt");

		for(z=1;z<=T;z++)
		{

			StringTokenizer st=new StringTokenizer(fin.readLine());

			hd=Integer.parseInt(st.nextToken());
			ad=Integer.parseInt(st.nextToken());
			hk=Integer.parseInt(st.nextToken());
			ak=Integer.parseInt(st.nextToken());
			b=Integer.parseInt(st.nextToken());
			d=Integer.parseInt(st.nextToken());

			health_d=hd;
			attack_d=ad;

			count=0;
			cure=0;
			h=0;


			while(hk>0 && health_d>0 && cure<2)
			{



				if(hk<=attack_d)				// ATTACK
				{
					hk-=attack_d;
					if(cure==1) cure--;

				}

				else

				if(health_d<=ak && hd>ak)		// CURE
				{
					health_d=hd;
					cure++;

				}

				else

				if(d>0 || b>0)
					if((d>=b && (attack_d+b<hk) && ak>0) || (ak>0 && ak-d<=0))					// DEBUFF
					{
						ak-=d;
						if(cure==1) cure--;

					}
					else												// BUFF
					if(((attack_d + b) >= (2*attack_d)) || ((attack_d+b)>=hk))
					{
						attack_d+=b;
						if(cure==1) cure--;

					}

				else							// ATTACK
				{
						hk-=attack_d;
						if(cure==1) cure--;

				}

				h=health_d;
				health_d-=ak;
				count ++;

			}



			if(cure==2 || h<1)
			{
				fw.write("Case #" + z + ": IMPOSSIBLE");
				fw.write("\r\n");
			}

			else
			{
				fw.write("Case #" + z + ": " + count);
				fw.write("\r\n");
			}



		}

		fw.close();
		f.close();

	}

}