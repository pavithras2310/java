import java.util.Scanner;

class IsVowelCons{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter alphabet");
		String c = scan.next();
		String s = c.toUpperCase();
		System.out.println(s);
		
		if(s.equals("A") ||s.equals("E")||s.equals("I") ||s.equals("O") ||s.equals("U")){
			System.out.print("Given Alphabet is Vowel");
		}
		else{
			System.out.print("Given Alphabet is Consonent");
		}
		
	}
}