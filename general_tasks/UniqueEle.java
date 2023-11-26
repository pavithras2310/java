import java.util.Scanner;
import java.util.Arrays;
class UniqueEle{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = scan.nextInt();
		System.out.println("Enter a array values");
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		int f;
		for(int i=0;i<n;i++){
			f=0;
			for(int j=i+1;j<n;j++){
				if(arr[i]==arr[j]){
					f=1;
					break;
				}
			}
			if(f==0)
			System.out.print(arr[i]+" ");
		}
	}
}