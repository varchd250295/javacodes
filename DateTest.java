import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

class DateTest
{
	public static void main(String args[])
	{

		SimpleDateFormat d=new SimpleDateFormat("YYYYMMdd");

		String date=d.format(new Date());

		System.out.println(date);

	}

}
