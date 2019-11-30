import java.util.Scanner;

public class StuckInATimeLoop {
	public static void main(String[] args) {
		int a;
		Scanner scan = new  Scanner(System.in);
		a = scan.nextInt();
		for(int count = 1;count < a + 1;count++) {
			System.out.println("" + count + " Abracadabra");
		}
	}
}
