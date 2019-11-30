import java.util.Scanner;

public class QALY {
	public static void main(String[] args) {
		int a;
		double b,c,total = 0;
		Scanner scan = new  Scanner(System.in);
		a = scan.nextInt();
		for(int count = 0;count < a;count++) {
			b = scan.nextDouble();
			c = scan.nextDouble();
			total = total + b * c;
		}
		System.out.println(total);
		scan.close();
	}
}
