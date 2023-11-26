import java.util.Scanner;
class Average{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of array: ");
		int n = scan.nextInt();
		int numbers[] = new int[n];
		int avg,sum=0;
		System.out.println("Enter the values of array");
		for(int i=0;i<n;i++){
			numbers[i] = scan.nextInt();
		}
		for(int i=0;i<n;i++){
			sum += numbers[i];
		}
		avg = sum / n;
		System.out.println("Average Of "+n+" numbers is: "+avg);
	}
}