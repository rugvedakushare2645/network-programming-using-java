import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class GetIpAdd{
	public static void main(String[] args) throws IOException{
		InetAddress add = InetAddress.getByName("www.ocsaly.com");

		//get the InetAddress object for a hostname
		System.out.println("Host Name: "+ add.getHostName());
		System.out.println("IP Address: "+ add.getHostAddress());

		//get the INetAddress object for a localhost
		InetAddress localAdd = InetAddress.getLocalHost();
		System.out.println("Local Host Name: "+localAdd.getHostName());
		System.out.println("Local IP Address: "+ localAdd.getHostAddress());

		//get all IP address associated with the host name
		InetAddress[] allAdd = InetAddress.getAllByName("www.ocsaly.com");
		for(InetAddress addr : allAdd){
			System.out.println("IP Address: "+addr.getHostAddress());
		}
		add.isReachable(10000);
	}
}