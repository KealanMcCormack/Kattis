import java.util.Scanner;
public class MicrophoneHiss {
	static String b ;
		
		public static void main(String[] args) {
		    Scanner scan = new  Scanner(System.in);
		    b = scan.nextLine();
			if(b.indexOf("ss") != -1) {
				System.out.println("hiss");
			}else {
				System.out.println("no hiss");
			}
		}
}

