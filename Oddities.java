import java.util.Scanner;

public class Oddities {
	public static void main(String[] args) {
		int a,b,c;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		
		
		for(int count = 0;count < a;count++) {
			b = in.nextInt();
			if(b % 2 == 0) {
				System.out.println(b + " is even");
			}else {
				System.out.println(b + " is odd");
			}
		}
		in.close();
	
	}
}
