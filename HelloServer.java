//server program 
import java.rmi.*;
import java.net.*;
public class HelloServer
{
public static void main(String  args[]) {
try{
//String host ="localhost";
HelloImp localobject = new HelloImp();

Naming.rebind("rmi:///HelloWorld",localobject);

}
catch(RemoteException re)
{
re.printStackTrace();
}

catch(MalformedURLException mfe)
{
mfe.printStackTrace();
}
}
}