import java.util.Scanner;
class ReverseString{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.next();
		StringBuilder sb=new StringBuilder(str);  
    	sb.reverse();  
		System.out.println("Before reverse: "+str);
		System.out.println("After reverse: "+sb);
	}
}