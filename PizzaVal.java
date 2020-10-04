import java.io.FileNotFoundException;

public class PizzaVal {
	public static void main(String[] args) throws FileNotFoundException {
		PizzaIO p = new PizzaIO();
		int sum = 0;
		boolean NotFound = true;
		int[] arr = p.Intialise();
		int a = p.maximum;
		int i = p.diffTypes-1;
		while(NotFound) {
			if(arr[i] < a) {
				NotFound = false;
			}
			
			while(i > 0) {
			sum = sum + arr[i];	
			NotFound = true;
			while(NotFound && i > 0) {
				if(sum + arr[i--] < a) {
					NotFound = false;
				}
			}
			}
			
		}
		System.out.println(sum);
		
		
		
		
	}
}
