import java.util.Scanner;
class SecondsToHrMinSec{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the seconds");
		int seconds = scan.nextInt();
		int temp = seconds;
		int hr=0,min=0,sec=0;
		
		while(seconds != 0){
			if(seconds/3600 != 0){
			hr = seconds/3600;
			seconds = seconds % 3600;
			}
			else if(seconds/60 != 0){
			min = seconds/60;
			seconds = seconds % 60;
			}
			else{
			sec = seconds;
			seconds = 0;
			}
		}
		System.out.println(temp+" Seconds");
		System.out.println(hr+"Hr:"+min+"Min:"+sec+"Sec");
	}
}