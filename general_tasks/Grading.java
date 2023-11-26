import java.util.Scanner;

class Grading{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter total subjects");
		int n = scan.nextInt();
		System.out.println("Enter a marks");
		int marks[] = new int[n];
		int total=0;
		for(int i=0;i<n;i++){
			marks[i]=scan.nextInt();
			total += marks[i];
		}
		float perc;
		perc =(total*100)/500;
		System.out.println(perc);
		System.out.println("Total: "+total+" Percentage: "+perc);
		if(perc>=90 && perc <= 100){
			System.out.print("Grade A");
		}
		else if(perc>=70 && perc < 90){
			System.out.print("Grade B");
		}
		else if(perc>=50 && perc < 70){
			System.out.print("Grade C");
		}
		else if(perc>=40 && perc < 50){
			System.out.print("Grade D");
		}
		else{
			System.out.print("Fail");
		}
	}
}