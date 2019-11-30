import java.util.Scanner;

public class Trik {
public static void main(String[] args) {
		
		String a;
		int temp = 0;
		int arr[] = new int[3];
		arr[0] = 1;
		 Scanner scan = new  Scanner(System.in);
		    a = scan.nextLine();
		    for(int count = 0;count < a.length();count++) {
		    	
		    	switch(a.charAt(count)) {
		    	case 'A':
		    		temp = arr[0];
		    		arr[0] = arr[1];
		    		arr[1] = temp;
		    		break;
		    	case 'B':	
		    		temp = arr[1];
		    		arr[1] = arr[2];
		    		arr[2] = temp;
		    		break;
		    	case 'C':
		    		temp = arr[0];
		    		arr[0] = arr[2];
		    		arr[2] = temp;
		    		break;
		    	}
		    }
		    if(arr[0] == 1) {
		    	System.out.println(1);
		    }else if(arr[1] == 1) {
		    	System.out.println(2);
		    }else {
		    	System.out.println(3);
		    }



}
}
