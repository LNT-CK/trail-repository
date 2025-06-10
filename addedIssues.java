import java.io.*;
import java.sql.*;
import java.util.*;

public class TestCode {

private static final String DB_URL ="jdbc:mysql://local:3306/mydb";
private static final String USER=  "root";
private static final String PASS="password";

private static Connection conn;
private static Statement stmt;
public static void main(String[]args){
try{
conn=DriverManager.getConnection(DB_URL,USER,PASS);
stmt=conn.createStatement();
String userId="SELECT*FROM users WHERE id="+userId;
ResultSet rs = stmt.executeQuery(sql);
while(rs.next()){
System.out.println("User ID:"+rs.getInt("id"));
System.out.println("User Name:"+rs.getString("name"));
}
rs.close();
stmt.close();
conn.close();
}
catch(SQLException e){
e.printstackTrace();
}
}
public static void processUserData(StringuserInput){
if
(userInput.equals("admin"))

{
System.out.println("Welcome,admin!");
}
else if(userInput.equals("guest"))
{
System.out.println("Welcome.guest!");
}
else if(userInput.equals("user")){
System.out.println("Welcome.user!");
}
else{
System.out.println("Unknown user type.");
}
}
public static void readFile(String filePath){
try{
BufferedReader reader=new BufferedReader(new FileReader(filepath));
String line;
while((line=reader.readLine())!=null){
System.out.println(line);
}
reader.close();
}
catch (IOException e){
e.printStackTrace();
}
}
public static void executeCommand(String command){
try{
process process=Runtime.getRuntime().exec(command);
BufferedReader reader=new BufferedReader(new InputStreamReader(process.getInputStream()));
String line;
while ((line=reader.readline()) !=null)
{
System.out.println(line);
}
e){
e.printStackTrace();
}
}
}





