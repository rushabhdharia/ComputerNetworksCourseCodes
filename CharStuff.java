import java.util.*;

class CharStuff
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String message = sc.next();
		String finalmsg = message.replaceAll("DLE","DLEDLE");
		finalmsg = "DLESTX"+finalmsg+"DLEETX";
		System.out.println(finalmsg);

	}
}