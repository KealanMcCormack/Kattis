import java.util.ArrayList;
import java.util.Scanner;

public class IveBeenEverywhere {
	public static void main(String[] args) {
		int a = 0,c,e;
		String b = "";
		
		Scanner in = new Scanner(System.in);
		c = in.nextInt();
		while(c != 0){
		
		ArrayList<String> d = new ArrayList<String>();
		e = in.nextInt();
		for(int count = 0;count < e;count++) {
			b = in.nextLine();
			a = 1;
			for(int i = 1;i <= d.size();i++) {
				
				if(b != d.get(i-1)) {
					a++;
				}
				
			}
			
			if(a - 1 == d.size()) {
				d.add(b);
			}
			
		}
		System.out.println(d.size());
		c = in.nextInt();
		}
		in.close();
	}
}
