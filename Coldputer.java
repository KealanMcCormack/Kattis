import java.util.Scanner;

public class Coldputer {
public static void main(String[] args) {
		
		int a,b,c=0;
	    Scanner scan = new  Scanner(System.in);
	    a = scan.nextInt();
		for(int count = 0;count < a;count++) {
			b = scan.nextInt();
			if(b < 0) {
				c++;
			}
		}
		
		
		System.out.println(c);
		
	}
}
