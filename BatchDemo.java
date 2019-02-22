import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class BatchDemo 
{
	Connection con;
	Statement cstmt;
	ResultSet rs;
	BatchDemo()
	{}
	void createConnection()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","root");
		}catch(Exception e)
		{
			System.out.println(e);
		}
    }
void createBatch()
{
	try 
	{
	cstmt=con.createStatement();
	cstmt.addBatch("insert into skills(name) values('spring')");
	cstmt.addBatch("update skills set name='web appp' where id=4");
	//cstmt.addBatch("delete from skills where id=6");
	con.setAutoCommit(false);
		int i[]=cstmt.executeBatch();
		con.commit();
		System.out.println("batch is successfully executed");
	 }
catch(Exception e)
	{
	}
}
public static void main(String [] args)
{
	BatchDemo obj=new BatchDemo();
		obj.createConnection();
		obj.createBatch();
}
}