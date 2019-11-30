import java.util.Scanner;

public class Filip {
	public static void main(String[] args) {
		int a,b;
		String c="",d="";
	    Scanner scan = new  Scanner(System.in);
	    a = scan.nextInt();
		b = scan.nextInt();
		for(int count = 0;count < 3;count++) {
			c = c + (a % 10);
			d = d + (b % 10);
			a = (a - a % 10) / 10;
			b = (b - b % 10) / 10;
		}
		if(c.compareTo(d) > 0) {
			System.out.println(c);
		}else {
	    System.out.println(d);
		}
		
	}
}
