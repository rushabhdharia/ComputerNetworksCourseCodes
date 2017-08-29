import java.util.*;
import java.net.*;
import java.io.*;
class client
{
	public static void main(String args[]) throws IOException
	{
		
		Socket s = new Socket("localhost",6970);
		Scanner sc = new Scanner(System.in);
		DataOutputStream d  = new DataOutputStream(s.getOutputStream());
		ServerSocket ss = new ServerSocket(6969);
		Socket s2 = ss.accept();
		DataInputStream d2 = new DataInputStream(s2.getInputStream());
		while(true)
		{
		System.out.println("Enter what you want");
		String toSend = sc.next();
		d.writeUTF(toSend);
		String str = d2.readUTF();
		System.out.println(str);
		}
		d.close();
		s.close();
		ss.close();

	}
}