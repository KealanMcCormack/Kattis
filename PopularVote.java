import java.util.Scanner;

public class PopularVote {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c,d=0,winner=0,check1=0,check2;
		double total;
		a = in.nextInt();
		for(int count = 0;count < a;count++) {
			b = in.nextInt();
			total = 0;
			d = 0;
			check2 = 0;
			for(int i = 0;i < b;i++) {
				c = in.nextInt();
				total = total + c;
				if(c > d) {
					check1 = c;
					winner = i;
					d = c;
				}else if(c == d) {
					check2 = c;
				}
			}
			if(check1 == check2) {
				System.out.println("no winner");
			}else {
				if(total % 2 == 1) {
					total = total - 1;
					total = total / 2;
					total = total + .5;
				}else {
					total = total / 2;
				}
			   winner = winner + 1;
				if(check1 > total) {
					System.out.println("majority winner " + winner );
				}else {
					System.out.println("minority winner " + winner );
				}
			}
		}
		in.close();
			
	}
}
