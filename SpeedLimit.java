import java.util.Scanner;

public class SpeedLimit {
public static void main(String[] args) {
		
		int a,b,c,total=0;
		int temp = 0;
		 Scanner scan = new  Scanner(System.in);
		 a = scan.nextInt();
		    while(a != -1) {
		    for(int count = 0;count < a;count++) {
		    	b = scan.nextInt();
		    	c = scan.nextInt();
		        
		        c = c - temp;
		        total = total + (b * c);
		        temp = temp + c;
		    
		    }
		    System.out.println(total + " miles");
		    total = 0;
		    temp = 0;
		    a = scan.nextInt();
		    }
		    scan.close();
}
}
