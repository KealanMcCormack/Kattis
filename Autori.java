import java.util.Scanner;

public class Autori {
	public static void main(String[] args) {
		String a,b = "";
	    Scanner scan = new  Scanner(System.in);
		
		a = scan.nextLine();
		b = b + a.charAt(0);
		for(int count = 1;count < a.length();count++) {
			if(a.charAt(count - 1) == '-') {
				b = b + a.charAt(count);
			}
		}
		
		System.out.println(b);
		
	}
}
