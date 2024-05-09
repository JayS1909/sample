import java.rmi.*;
import java.util.Scanner;
public class AddClient {
public static void main(String args[]) { 
Scanner sc = new Scanner(System.in);
try {
// Get reference to the remote object
String addServerURL = "rmi://localhost/AddServer"; 
AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(addServerURL);
System.out.println("The first number is: "); 
double d1 = sc.nextDouble();
System.out.println("The second number is: ");
double d2 = sc.nextDouble();
// Invoke remote method to add numbers
System.out.println("The sum is: " + addServerIntf.add(d1, d2));
System.out.println("Division is :" +addServerIntf.division(d1, d2));

} 
catch (Exception e) { System.out.println("Exception: "+ e);
}}}
