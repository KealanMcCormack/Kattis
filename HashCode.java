import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class HashCode {
	
	public static void main(String[] args) throws FileNotFoundException {
	int a = 0;
	int b = 0;
	String c = " ";
	File f = new File("C:/Users/Kealan/Downloads/e_also_big.in");
	Scanner in = new Scanner(f);
	
		
		if(in.hasNextInt()) {
			a = in.nextInt();
		}
		
		if(in.hasNextInt()) {
			
			b = in.nextInt();
			System.out.println(b);
		}
		
	int arr[] = new int[b];
	
	for(int count = 0;count < b;count++) {
		arr[count] = in.nextInt();
		System.out.println(arr[count]);
	}
	in.close();
 }
}
