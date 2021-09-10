
public class RecursiveFactorial {
	public static void main(String[] args) {
		int result = factorial(4);
		System.out.println("Factorial is:" + result);
	}
	
	//write a recursive version of factorial
	public static int factorial(int number) {
		if(number > 1) {
			return number * factorial(number-1);
		}
		else {
			return 1;
		}
	}
}
