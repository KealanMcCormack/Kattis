import java.util.Scanner;

public class DifferentProblem {
	public static void main(String[] args) {
		 Scanner scan = new  Scanner(System.in);
		 String a, b;
		 long c,d;
		while(scan.hasNext()) {
		
		 a = scan.next();
		 b = scan.next();
		 c = Long.parseLong(a);
		 d = Long.parseLong(b);
		 c = c - d;
		 if(c < 1) {
			 c = c * -1;
			 
		 }
		 System.out.println(c);
		 
		}
		scan.close();
	}
	
	
}
