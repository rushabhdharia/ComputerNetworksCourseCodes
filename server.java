import java.util.*;
import java.net.*;
import java.io.*;
class server
{
	public static void main(String args[]) throws IOException
	{
		
		
		Scanner sc = new Scanner(System.in);
		ServerSocket ss = new ServerSocket(6970);
		Socket s2 = ss.accept();
		DataInputStream d2 = new DataInputStream(s2.getInputStream());
		Socket s = new Socket("localhost",6969);
		DataOutputStream d  = new DataOutputStream(s.getOutputStream());
		while(true)
		{
			String str = d2.readUTF();
			System.out.println(str);
			System.out.println("Enter what you want");
			String toSend = sc.next();
			d.writeUTF(toSend);
		}
				
		ss.close();
		d.close();
		s.close();
	}
}