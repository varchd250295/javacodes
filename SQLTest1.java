import java.io.*;

import java.sql.*;

class SQLTest1

{
	public static void main(String args[])throws IOException, SQLException

	{
		String query= "select char_name,char_level from characters where char_name like \"s%\"";

		try
		{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Driver/Class not found");
		}

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mmorpg2","root","maverick");

		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);


		while(rs.next())
		{

			String char_name= rs.getString("char_name");

			System.out.println(char_name);
			System.out.println(rs.getString("char_level"));

		}

		con.close();
		rs.close();
		st.close();

		}
		catch(SQLException e)
		{
			System.out.println("Fuck You");

		}

	}

}


