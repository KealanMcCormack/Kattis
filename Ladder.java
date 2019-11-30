import java.util.Scanner;
import java.lang.Math;
public class Ladder {
public static void main(String[] args) {
		
		int c;
		int a,d;
		double PI = 3.14159265359, b;
	
		 Scanner scan = new  Scanner(System.in);
		 a = scan.nextInt();
		 b = scan.nextInt();
		 b = b * PI / 180;
	
			
	
		d = (int) (a / (Math.sin(b)));
       d++;
         System.out.println(d);
         scan.close();
	}
}
