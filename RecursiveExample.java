
public class RecursiveExample {
	public static void main(String[] args) {
		countDown(3);
		System.out.println("End of program!");
	}
	
	public static void countDown(int num) {
		if(num > 0) {
			System.out.println(num);
			countDown(num-1); //recursive call (the method calls itself)
		}
		System.out.println("This is countDown version: " + num);
	}
}
