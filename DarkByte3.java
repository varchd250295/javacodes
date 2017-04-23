import java.io.*;

class DarkByte3

{

	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		int k=Integer.parseInt(xx.readLine());
		double d1,d2,f1,f2,f3,dd,dt;
		int turns;
		String output="";

		for(int K=1;K<=k;K++)
		{
			d1=Double.parseDouble(xx.readLine());
			d2=Double.parseDouble(xx.readLine());
			f1=Double.parseDouble(xx.readLine());
			f2=Double.parseDouble(xx.readLine());
			f3=Double.parseDouble(xx.readLine());

			dd=dt=d1/2;

			turns=(int)Math.ceil(d2/f3);

			for(int i=1;i<=turns;i++)
			{
				dd=dd-f1;
				dt=dd-f2;
				if(dd<=0||dt<=0)
				{
					output=output+"UNSAFE"+"\n";
					break;
				}
			}
			if(dd>0 && dt>0)
			output=output+"SAFE"+"\n";

		}

		System.out.println(output);
	}

}



