import java.util.Scanner;
public class FizzBuzz {
		public static void main(String[] args) {
			int a, b, c;
			String d;
			Scanner in = new Scanner(System.in);
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			for(int count = 1;count <= c;count++) {
				d = "";
				if(count % a == 0) {
					System.out.print("Fizz");
				}
				if(count % b == 0) {
					System.out.print("Buzz");
				}
				if(count % a != 0 && count % b != 0) {
					System.out.print(count);
				}
				System.out.println();
			}
			in.close();
		}
}
