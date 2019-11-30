import java.util.Scanner;

public class OutOnTheTerrace {
public static void main(String[] args) {
		
		int a,c,total = 0;
		int z,skip = 0;
		String x;
		
		Scanner scan = new  Scanner(System.in);

			a = scan.nextInt();  
			c = scan.nextInt();  
			for(int count = 0;count < c;count++) {
				x = scan.next();
				z = scan.nextInt();
				if((a - total) >= z) {
				if(x.indexOf("enter") != -1) {
					total = total + z;
				}else {
					total = total - z;
				}
				}else {
					skip++;
				}
			}
			System.out.println(skip);
			scan.close();
	}
}
