import java.util.Scanner;

public class Pet {
public static void main(String[] args) {
		
		int a, ans=0;
		
	
		int total = 0,check=0;
		Scanner scan = new  Scanner(System.in);

		for(int i = 1;i < 6;i++) {
			for(int count = 1;count < 5;count++) {
				a = scan.nextInt();  
				total = total + a; 
			}
			if(total > check) {
				check = total;
				ans = i;
			}
			total = 0;
		}
			
			System.out.println(ans + " " + check);
			scan.close();
	}
}
