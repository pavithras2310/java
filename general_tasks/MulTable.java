import java.util.Scanner;

class MulTable{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to display it\'s table");
		int num = scan.nextInt();
		int fact = 1;
		for(int i=1;i<=10;i++){
			System.out.println(i+" X "+num +" = "+(i*num));
		}
		
	}
}