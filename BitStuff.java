import java.util.*;
class BitStuff{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String flag="01111110";
		System.out.println("Enter the string");
		String data = sc.next();
		String fin = data.replaceAll("11111","111110");
		fin = flag+fin+flag;
		System.out.println(fin);

	}
}