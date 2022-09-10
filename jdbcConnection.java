package zohoFirst;
import java.io.PrintWriter;
import java.sql.*;
public class jdbcConnection {
	public static void main(String [] args)
	{
		Connection con;
		Statement statement;
		ResultSet result;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","manager");
		statement = con.createStatement();
		result = statement.executeQuery("Select * from userDetails where name='chimi' and password='password'");
		if(result.next()) {
			System.out.println(result.getString("name"));
			System.out.println(result.getString("password"));
		}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
