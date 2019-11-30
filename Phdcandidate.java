import java.util.Scanner;
//Not finished, needs work before it will be accepted
public class Phdcandidate {
public static void main(String[] args) {
		
		int c=0,d=0,e=0;
		String a,b;
		
		 Scanner scan = new  Scanner(System.in);
		    a = scan.nextLine();
		    for(int count = 0;count < a.charAt(0) - 48;count++) {
		    	b = scan.nextLine();
		    	if(b.contains("P=NP")) {
		    		System.out.println("skipped");
		    	}else {
		    		c = 0;
		    		 for(int i = 0;i < 4;i++) {
		    			 if(b.charAt(i) != '+') {
		    				 c = c + (b.charAt(i) - 48);
		    				 e++;
		    			 }else {
		    				 break;
		    			 }
		    		 }
		    		 d = 0;
		    		 for(int i = e + 1;i < 9-(4 - e);i++) {
		    			
		    				 d = d + (b.charAt(i) - 48);
		    			
		    		 }
		    		 e=0;
		    		c = c + d;
		    		System.out.println(c);
		    	}
		    		
		    }
		    scan.close();
}
}
