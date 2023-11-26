import java.util.Scanner;
import java.util.Arrays;
class cyclicallyRotate{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = scan.nextInt();
		System.out.println("Enter a array values");
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println("Before cyclically Rotate by one");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		arr = Arrays.copyOf(arr, arr.length + 1);
		for(int i=arr.length-1;i>0;i--){
			arr[i]=arr[i-1];
		}
		arr[0]=arr[arr.length-1];
		arr = Arrays.copyOf(arr, arr.length - 1);
		System.out.println("\nAfter cyclically Rotate by one");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}