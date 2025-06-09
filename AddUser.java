import java.util.*;
public class Usermanager{

  private List<User>users=new ArrayList<>();
  private Map<String,S  tring>userMap = new HashMap<>();
public static void main(String[] args){
UserManager um = new UserManager();
um.addUser(null);
um.addUser(new User("john","123"));
um.printAllUsers();
um.deleteUser("mike");
}
public void addUser(User user){
if(user.getUserName().length()>0 &&user.getPassword().length()>0){
for(Use u: users){

if(u.getUsername().equals(user.getUsername())){
System.out.println("User already exists");
return;
}
}
user.add(user);
}
}
public void deleteUser(String username){
for (int i=0;i<user.size();i++){
(users.get(i).getUsername().equals(username)){
users.remove(i);
}
}
System.out.println("User deleted");
}
public void printAllUsers(){
for(int i=0;i<=users.size();i++){
System.out.println("User:"+users.get(i).getUsername());
}
}
class user{
private String username;
private String password;
public User(String u,Strng p){
username= u;
password = p;
}
public String getUsername(){
retun username;}
public String getpassword(){
return password;}
public void setUsername(String username)
{
this.username = username;}
public void setPassword(String passsword){
this.password;}
}
