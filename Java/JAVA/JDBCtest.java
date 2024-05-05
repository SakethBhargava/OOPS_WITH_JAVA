import java.sql.*;
public class JDBCtest
{ 
public static void main(String args[])
{ 
 try
 { 
 Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", 
"test", "tiger");
Statement st = con.createStatement();
String sql = ("SELECT * FROM student ORDER BY Srno ASC;");
ResultSet rs = st.executeQuery(sql);
 while(rs.next()) 
 { 
 int id = rs.getInt("Srno"); 
 String str1 = rs.getString("Sname");
 System.out.println(id+" "+str1);
 }
 con.close();
 }
 catch(Exception e)
 { 
 System.out.println(e);
 } 
 }
}