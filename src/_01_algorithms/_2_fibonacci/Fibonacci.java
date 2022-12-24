package _01_algorithms._2_fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1;
		int number2;
		int sum;
		number1 = 0;
		number2 = 1;
		//sum = number1 + number2;
		//System.out.println(sum);\
		System.out.println(number1);
		System.out.println(number2);
		for(int i = 0; i<10; i++) {
			sum = number1 + number2;
			System.out.println(sum);
			number1 = number2;
			number2 = sum;
			
		}
		

	}

}
