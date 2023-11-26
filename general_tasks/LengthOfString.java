import java.util.Scanner;
class LengthOfString{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.next();
		StringBuilder sb=new StringBuilder(str); 
		System.out.println("Length of a string: "+sb.length());
	}
}