package dataBaseAdding;
import java.sql.*;
import java.sql.DriverManager;
public class InputFromDatabase {
public static void main(String[] args) {
	try {
		Class.forName("com.sql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root", "12July200031Aug2005");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from employeeinfo");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
							}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
}
}