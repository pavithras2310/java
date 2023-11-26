import java.util.Scanner;

class PrimeNumOrNot{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		int f=0;
		for(int j=1;j<num;j++){
			if(j==1){
				continue;
			}
			else{
				if(num%j == 0){
					f=1;
					break;
				}
			}
		}
		if(f==0){
			System.out.println("Given number is Prime");
		}
		else{
			System.out.println("Given number is not a Prime");
		}
	}	
}