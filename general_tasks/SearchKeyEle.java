import java.util.Scanner;
import java.util.Arrays;
class SearchKeyEle{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = scan.nextInt();
		System.out.println("Enter a array values");
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter key element");
		int key = scan.nextInt();
		int f=0;
		for(int i=0;i<n;i++){
			if(key==arr[i]){
				f=1;
				System.out.println(key+" element found in "+(i+1)+" position");
				break;
			}
		}
		if(f==0){
			System.out.println("element not found");
		}
	}
}