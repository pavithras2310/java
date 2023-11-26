import java.util.Scanner;

class Fibonacci{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		int x=-1,y=1,next;
		for(int i=0;i<num;i++){
			next = x+y;
			System.out.println(next);
			x=y;
			y=next;
		}
	}
}