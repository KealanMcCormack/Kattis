import java.util.ArrayList;
import java.util.Scanner;

public class CDs {
public static void main(String[] args) {
		
		int a,b,total=0;
		int c=0,d;
	
		 Scanner scan = new  Scanner(System.in);
		 a = scan.nextInt();
		 
		 b = scan.nextInt();
		 if(a != 0 && b!=0) {
		 ArrayList<Integer> first = new ArrayList<Integer>();
		 
		 for(int count = 0;count < a;count++) {
			 c = scan.nextInt();
			
			 first.add(count, c);
			 
		 }
		
		
			 
         for(int i = 0;i < b;i++) {
        	 d = scan.nextInt();
        	 if(first.indexOf(d) != -1) {
        		 
				 total++;
			 }
        	
         }
		 }
         System.out.println(total);
         scan.close();
	}
}
