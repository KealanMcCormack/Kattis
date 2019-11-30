import java.util.Scanner;

public class Tarifa {
	public static void main(String[] args) {
		int a,b,c,total=0;
		
		Scanner scan = new  Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		for(int count = 0;count < b;count++) {
			
			c = scan.nextInt();
			total = total + a - c;
		}
		total += a;
		System.out.println(total);
		scan.close();
	}
}
