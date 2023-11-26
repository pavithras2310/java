import java.util.Scanner;
import java.util.Arrays;
class Ascending{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = scan.nextInt();
		System.out.println("Enter a array values");
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Array values in Ascending");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+ " ");
		}
	}
}