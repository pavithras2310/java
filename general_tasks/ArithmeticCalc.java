import java.util.Scanner;
class ArithmeticCalc{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number1");
		int num1 = scan.nextInt();
		System.out.println("Enter the number2");
		int num2 = scan.nextInt();
		System.out.println("Sum of the numbers: "+(num1+num2));
		System.out.println("Subtraction of the numbers: "+(num1-num2));
		System.out.println("Multiplication of the numbers: "+(num1*num2));
		System.out.println("Division of the numbers: "+(num1/num2));
		System.out.println("Modulus of the numbers: "+(num1%num2));
	}
}