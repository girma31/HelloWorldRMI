//defining remote interface
import java.rmi.*;
public interface HelloWorld extends Remote{
public String display() throws RemoteException;
public int add(int x, int y) throws RemoteException;
}