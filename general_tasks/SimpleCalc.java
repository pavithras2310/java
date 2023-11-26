import java.util.Scanner;

class SimpleCalc{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a option 1)Add 2)Sub 3)Mul 4)Div 5)Mod");
		int op = scan.nextInt();
		System.out.println("Enter a number1");
		int num1 = scan.nextInt();
		System.out.println("Enter a number2");
		int num2 = scan.nextInt();
		int result=0;
		switch(op){
			case 1:
				result = num1 + num2;
				break;
			case 2:
				result = num1 - num2;
				break;
			case 3:
				result = num1 * num2;
				break;
			case 4:
				result = num1 / num2;
				break;
			case 5:
				result = num1 % num2;
				break;
			default:
				System.out.println("Give a valid option!!");
				break;
		}
		System.out.println("Result: "+result);
	}
}