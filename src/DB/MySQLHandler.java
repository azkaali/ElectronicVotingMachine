package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MySQLHandler {
	
	public void MySQLDB (String str1)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","1234");
			
		     /* Scanner sc=new Scanner(System.in);
		      System.out.println("Enter CNIC");
		      String cnic=sc.nextLine();
		    */
		      
			//insertion
			String sql = "INSERT INTO voter(cnic) VALUES(?)";
			
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, str1);
			//statement.setString(1, str2);
	
			
			int rowInserted = statement.executeUpdate();
			if (rowInserted > 0)
			{
				System.out.println("New account added successfully");
			}
			
			
			//display
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from voter");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
			
			con.close();
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
