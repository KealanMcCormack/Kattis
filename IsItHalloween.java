import java.util.Scanner;

public class IsItHalloween {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String c,d;
		c = in.next();
		d = in.next();
		if(c.indexOf("OCT") != -1 && d.indexOf("31") != -1) {
			System.out.println("yup");
		}else if(c.indexOf("DEC") != -1 && d.indexOf("25") != -1) {
			System.out.println("yup");
		}else {
			System.out.println("nope");
		}
		in.close();
			
	}
}
