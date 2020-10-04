
import java.util.Scanner;

public class Quadrant {
	public static void main(String[] args) {
		int a,b;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		if(a > 0) {
			if(b>0) {
				System.out.println(1);
			}else {
				System.out.println(4);
			}
		}else {
			if(b>0) {
				System.out.println(2);
			}else {
				System.out.println(3);
			}
		}
	}
}