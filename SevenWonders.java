import java.util.Scanner;

public class SevenWonders {
public static void main(String[] args) {
		
		String a;
		int t=0,c=0,g=0,total;
		 Scanner scan = new  Scanner(System.in);
		 a = scan.nextLine();
		 for(int count = 0;count < a.length();count++) {
		    	switch(a.charAt(count)) {
		    	case 'T':
		    		t++;
		    		break;
		    	case 'C':
		    		c++;
		    		break;
		    	case 'G':
		    		g++;
		    		break;
		    	}
		    
		    }
		total = t*t + c*c + g*g;
		if(t < g) {
			if(t < c) {
				total = total + 7 * t;
			}else {
				total = total + 7 * c;
			}
		}else if(c < g){
			total = total + 7 * c;
		}else {
			total = total + 7 * g;
		}
		System.out.println(total);
		    scan.close();
}
}
