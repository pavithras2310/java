class ArmstrongNum{
	public static void main(String args[]){
		int sum,rem,temp,t;
		for(int i=1;i<=600;i++){
			temp=t=i;sum=0;
			while(t!=0){
				rem = t%10;
				sum = sum + (rem*rem*rem);
				t /= 10;
			}
			if(temp==sum){
				System.out.println(temp);
			}
		}
	}
}