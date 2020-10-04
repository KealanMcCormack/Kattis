import java.util.Scanner;

public class ToAdvertise {
	public static void main(String[] args) {
		int a,b,c,d,total;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		for(int count = 0;count < a;count++) {
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			
			if(b < c - d ) {
				System.out.println("advertise");
			}
			if(b == (c - d) ) {
				System.out.println("does not matter");
			}
			if(b > (c - d) ) {
				System.out.println("do not advertise");
			}
		
		}
	}
}
