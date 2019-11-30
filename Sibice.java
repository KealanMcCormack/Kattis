import java.util.Scanner;
import  java.lang.Math;
public class Sibice {
	public static void main(String[] args) {
		
		int a,b,c;
		double x;
		int z;
		
		Scanner scan = new  Scanner(System.in);

			a = scan.nextInt();  
			b = scan.nextInt();  
			c = scan.nextInt();  
			
			x = (b*b + c*c);
			x = Math.sqrt(x);
			for(int count = 0;count < a;count++) {
				
				z = scan.nextInt();
				if(z < x || z == x) {
					System.out.println("DA");
				}
				if(z > x) {
					System.out.println("NE");
				}
			}
			scan.close();
	}
}
