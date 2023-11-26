import java.util.Scanner;
class AreaOfRhombus{
	public static void main(String args[]){
		int base,height;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base value");
		base = scan.nextInt();
		System.out.println("Enter height value");
		height = scan.nextInt();
		System.out.println("Area Of Rhombus is : "+(base*height));
	}
}