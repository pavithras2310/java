class PrimeNum{
	public static void main(String args[]){
		int f,sum=0;
		for(int i=1;i<=100;i++){
			f=0;
			if(i==1){
				continue;
			}
			for(int j=1;j<i;j++){
				if(j==1){
					continue;
				}
				else{
					if(i%j == 0){
						f=1;
						break;
					}
				}
			}
			if(f==0){
				sum += i;
			}
		}
		System.out.println(sum);
	}
}