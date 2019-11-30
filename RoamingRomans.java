import java.util.Scanner;

public class RoamingRomans {
public static void main(String[] args) {
		
		double a,c;
		int b;
		 Scanner scan = new  Scanner(System.in);
		 a = scan.nextDouble();
		 c = 1.08776267;
		
		 a = a * 1000 * c;
		 
		 b = (int) a;
		 a = a - b;
		
		 if(a > .5) {
			 b += 1;
		 }
		 System.out.println(b);
		    scan.close();
}
}
