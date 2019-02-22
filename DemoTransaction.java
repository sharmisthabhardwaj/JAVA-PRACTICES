import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class DemoTransaction 
{ 
public static void main(String [] args) throws Exception
{
	Class.forName("com.mysql.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","root");
	 System.out.println("driver is loaded");
	 Statement stmt=con.createStatement();
	 con.setAutoCommit(false);
	 try
	 {
		 int i1=stmt.executeUpdate("insert into candidate_skills values(101,4)");
		 int i2=stmt.executeUpdate("update skills set name='ruby' where id=6");
		 int i3=stmt.executeUpdate("delete from candidates where id=120");
		 con.commit();
		 System.out.println("transaction is success");
	 }
	 catch(Exception e)
	 {
		 try
		 {
			 con.rollback();
			 System.out.println("transaction is failed");
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex);
		 }
	 } 
	 stmt.close();
}
}