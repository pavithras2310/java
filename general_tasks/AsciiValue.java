import java.util.Scanner;
class AsciiValue{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		char ch = scan.nextChar();
		int asciiValOfCh = ch;
		System.out.println("Ascii Value Of Given Character is: "+asciiValOfCh);
	}
}