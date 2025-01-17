package tcpIp;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getLocalHost(),Server.SERVER_PORT);
			
			InputStream is = socket.getInputStream();
			int data;
			String message = "";
			while((data = is.read())!=-1) {
				message+=(char)data;
			}
			System.out.println("Received Message:" + message);
			is.close();
			socket.close();
		}catch(Exception e) {
			System.err.println("Exception on client.");
		}
	}
}
