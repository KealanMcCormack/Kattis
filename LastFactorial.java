import java.util.Scanner;

public class LastFactorial {
	public static void main(String[] args) {
		int a,b,c;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		for(int count = 0;count < a;count++) {
			b = in.nextInt();
			c = 1;
			for(int i = 2;i <= b;i++) {
				c = c * i;
			}
			System.out.println(c % 10);
		}
		in.close();
	}
}
