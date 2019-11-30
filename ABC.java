
import java.util.Scanner;

public class ABC {
public static void main(String[] args) {
		
		int a,b,c,total=0,temp;
		String d,out = "";
	
		 Scanner scan = new  Scanner(System.in);
		 a = scan.nextInt();
		 b = scan.nextInt();
		 c = scan.nextInt();
		 if(a > b) {
			 temp = b;
			 b = a;
			 a = temp;
		 }
		 if(b > c) {
			 temp = c;
			 c = b;
			 b = temp;
			 if(a > b) {
				 temp = b;
				 b = a;
				 a = temp;
			 }
		 }
		 d = scan.next();
		 for(int count = 0;count<3;count++) {
			 switch(d.charAt(count)) {
			 case 'A':
				 out = out + a;
				 break;
			 case 'B':
				 out = out + b;
				 break;
			 case 'C':
				 out = out + c;
				 break;	 
			 }
			 if(count < 2) {
				 out = out + " ";
			 }
		 }
			 System.out.println(out);
			
		
         
         scan.close();
	}
}
