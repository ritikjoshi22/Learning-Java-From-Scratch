package tcpIp;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static final int SERVER_PORT = 1;
	
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
			Socket socket = serverSocket.accept();
			
			System.out.println("Connection started.");
			OutputStream os = socket.getOutputStream();
			String message = "Hello client, how are you?";
			os.write(message.getBytes());
			os.flush();
			System.out.println("Message sent.");
			
			os.close();
			socket.close();
			
		}catch(Exception e) {
			System.err.println("Exception encountered on Server. " + e);
		}
	}
}
