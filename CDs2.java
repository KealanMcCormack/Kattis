
import java.util.*;
import java.util.Scanner;

public class CDs2{
public static void main(String[] args) {
		
		int a,b,total=0;
		String c;
		HashSet<String> hs = new HashSet<String>(1000000, 1.0f);
		 Scanner scan = new  Scanner(System.in);
		 a = scan.nextInt();
		 b = scan.nextInt();
		 c = scan.nextLine();
		 while(a != 0 && b!=0) {
			 for(int count = 0;count < a;count++) {
				 c = scan.nextLine();
				
				 hs.add(c);
			 }
			 for(int count = 0;count < b;count++) {
				 c = scan.nextLine();
				 
				 if(hs.contains(c)) {
					 total++;
				 }
			 }
			 a = scan.nextInt();
			 b = scan.nextInt();
			 if(scan.hasNextLine()) {
				 c = scan.nextLine();
			 }
			 System.out.println(total);
			 hs.clear();
		 }
         
         scan.close();
	}
}
