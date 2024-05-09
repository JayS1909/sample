import java.rmi.*;
import java.rmi.server.*;
//class that implements the remote interface
public class AddServerImpl extends UnicastRemoteObject 
implements AddServerIntf {
//constructor
public AddServerImpl() throws RemoteException {
}
//implement method declared in the interface
public double add(double d1, double d2) throws RemoteException {
 return d1 + d2; 
}
public double division(double d1, double d2) throws RemoteException{
    if(d2 != 0){
        return d1 / d2;
    }
    else{
        System.out.println("number cannot be divided by 0");
    }
    return d1 / d2;
}
}
