import java.util.Scanner;

class Palindrome{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		int sum = 0,rem,temp;
		temp = num;
		while(num!=0){
			rem = num%10;
			sum = (sum*10) + rem;
			num /= 10;
		}
		if(temp == sum){
			System.out.println("Given number is Palindrome");
		}
		else{
			System.out.println("Given number is not a Palindrome");
		}
	}
}