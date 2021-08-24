package javaprograms;

public class Factorialnumber {

	public static void main(String[] args) {
		System.out.println(factorialNumber(4));
		System.out.println(factorial(5));
}
	public static int factorialNumber(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		
		return fact;
		
		}
	public static int factorial(int num) {
		if(num==0) {
			return 1;
		}else {
			return(num *factorial(num-1));
		}
		
	}
}
