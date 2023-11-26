import java.util.Scanner;
class TransposeMatrix{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a row and column size");
		int r = scan.nextInt();
		int c = scan.nextInt();
		int arr[][] = new int[r][c];
		System.out.println("Enter values");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j] = scan.nextInt();
			}
			System.out.println();
		}
		System.out.println("TransposeMatrix");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
			if(i==j)
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}