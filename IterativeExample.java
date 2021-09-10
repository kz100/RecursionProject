
public class IterativeExample {
	public static void main(String[] args) {
		countDown(3);
		System.out.println("End of program!");
	}
	
	public static void countDown(int num) {
		for(; num > 0; num--) {
			System.out.println(num);
		}
	}
}
