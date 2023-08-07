import java.net.*;
public class Network
{
public static void main(String[] args) throws Exception
{
InetAddress localHost=InetAddress.getLocalHost();
System.out.println(localHost.getHostAddress());
}
}