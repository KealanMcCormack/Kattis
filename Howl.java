import java.util.Scanner;

public class Howl {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String c,d;
		c = in.nextLine();
		switch(c.charAt(c.length()-1)) {
		case 'A':
			c = c + 'O';
			System.out.println(c);
			break;
		case 'W':
			c = c + 'H';
			System.out.println(c);
			break;
		case 'H':
			c = c + 'O';
			System.out.println(c);
			break;
		case 'O':
			c = c + 'O';
			System.out.println(c);
			break;
		}
		in.close();
			
	}
}
