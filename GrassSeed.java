import java.util.Scanner;
public class GrassSeed {
		public static void main(String[] args) {
			double total = 0;
			double a,b,d;
			int c;
		    Scanner scan = new  Scanner(System.in);
		    a = scan.nextDouble();
			c = scan.nextInt();
		    for(int count = 0;count < c;count++) {
		    	 b = scan.nextDouble();
		    	 d = scan.nextDouble();
		    	 total = total + (b * d * a);
		    }
		    System.out.println(total);
			
			
		}
}
