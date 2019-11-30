import java.util.Scanner;
import java.lang.Math;

public class Faktor {
	public static void main(String[] args) {
		
		double a,b,c;
	    Scanner scan = new  Scanner(System.in);
	    a = scan.nextInt();
		b = scan.nextInt();
		b = (a * (b - 1 + .01));
		c = Math.ceil(b);
		int d = (int) c;
		System.out.println(d);
		
	}
}
