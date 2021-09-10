//4! = 4 * 3!
//3! = 3 * 2!
//2! = 2 * 1!
//1! = 1
//0! = 1
public class IterativeFactorial {
	public static void main(String[] args) {
		int result = factorial(2);
		System.out.println("Factorial is: " + result);
	}
	
	public static int factorial(int number) {
		int answer = 1;
		for(; number >= 1; number--) {
			answer = answer * number;
		}
		return answer;
	}
}
