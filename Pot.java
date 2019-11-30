import java.util.Scanner;
import java.lang.Math;
public class Pot {
public static void main(String[] args) {
		
		int a,c;
		int z;
		double b=0;
		int total = 0;
		Scanner scan = new  Scanner(System.in);

			a = scan.nextInt();  
			for(int count = 0;count < a;count++) {
				
				z = scan.nextInt();
				c = z % 10;
				z = (z - c) / 10;
				b = b + Math.pow(z, c);
				total = (int) b;
			}
			System.out.println(total);
			scan.close();
	}
}
