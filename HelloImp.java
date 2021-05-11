//implementing remote interface
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class HelloImp extends UnicastRemoteObject implements HelloWorld
{
public HelloImp() throws RemoteException{}
public String display() throws RemoteException
{
return "Hello world from sever";
}
public int add(int a, int b) throws RemoteException
{

return a+b;
}
}