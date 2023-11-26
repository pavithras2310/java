import java.util.Scanner;
class Product{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number1");
		int num1 = scan.nextInt();
		System.out.println("Enter the number2");
		int num2 = scan.nextInt();
		System.out.println("Product of the numbers: "+(num1+num2));
	}
}