//client program
import java.rmi.*;
import java.net.*;
public class HelloClient
{
public static void main(String  args[]) {
try{
String host ="localhost";
HelloWorld remobject =(HelloWorld)Naming.lookup("rmi://"+host+"/HelloWorld");
System.out.println(remobject.display());

System.out.println(remobject.add(2,3));
}
catch(RemoteException re)
{
re.printStackTrace();
}
catch(NotBoundException nbe)
{
nbe.printStackTrace();
}
catch(MalformedURLException mfe)
{
mfe.printStackTrace();
}
}
}