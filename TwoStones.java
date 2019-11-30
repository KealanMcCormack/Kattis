import java.util.Scanner;
public class TwoStones {
	public static void main(String[] args) {
		int a;
		Scanner scan = new  Scanner(System.in);
		a = scan.nextInt();
		a = a % 2;
		
		if(a == 0) {
			System.out.println("Bob");
		}
        
		if(a == 1) {
			System.out.println("Alice");
		}
		
	}
}
