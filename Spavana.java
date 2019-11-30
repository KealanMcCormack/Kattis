import java.util.Scanner;

public class Spavana {
public static void main(String[] args) {
		
		int a,b;
		 Scanner scan = new  Scanner(System.in);
		 a = scan.nextInt();
		 b = scan.nextInt();
		 if(b < 45) {
			 b = 60 - (45 - b);
			 a -= 1;
			 if(a < 0) {
				 a = 23;
			 }
		 }else {
			 b = b - 45;
		 }
		 System.out.println(a + " " + b);
		    scan.close();
}
}
