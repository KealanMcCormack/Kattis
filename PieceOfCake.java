import java.util.Scanner;

public class PieceOfCake {
	public static void main(String[] args) {
		int a,b,c;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
        c = in.nextInt();
        if(b <= a/2) {
        	b = a - b; 
        }
        if(c <= a/2) {
        	c = a - c; 
        }
        System.out.println(b * c * 4);
        in.close();
	}
}
