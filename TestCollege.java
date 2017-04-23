import java.io.*;

class College

{	private String a,b;
	College()
	{
		a="";
		b="";
	}

	void assign(String a,String b,boolean f)
	{
		College o=new College();
		o.a=a;
		o.b=b;
		o.output(f);
	}

	void output(boolean f)
	{	if(f)
		{
			System.out.print(a+ " - ");
			System.out.println(b);
		}
		else
		{
			System.out.print(a);
			System.out.print(b);
		}
	}


}

class Course extends College

{
	String x,y;boolean f;
	Course(String x,String y,boolean f)
	{
		this.x=x;
		this.y=y;
		this.f=f;
	}

	void relay()
	{
		assign(x,y,f);
	}

}

class Department extends College

{
	String x,y;boolean f;
		Department(String x,String y,boolean f)
		{
			this.x=x;
			this.y=y;
			this.f=f;
		}

	void relay()
	{
		assign(x,y,f);
	}


}

class Student extends College

{
	String x,y;boolean f;
		Student(String x,String y,boolean f)
		{
			this.x=x;
			this.y=y;
			this.f=f;
		}

	void relay()
	{
		assign(x,y,f);
	}

}

class TestCollege
{

	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the College, Department name, code, Course Name,code and Student name and roll no., separating each entry with '|'");

		String s[]=xx.readLine().split("\\|");

		Student o1=new Student(s[5],s[6],true);
		o1.relay();
		Course o2=new Course(s[3],s[4],true);
		o2.relay();
		Department o3=new Department(s[1],s[2],true);
		o3.relay();
		o3.assign(s[0],".",false);

	}

}


