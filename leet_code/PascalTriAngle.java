class PascalTriAngle{
	public static void main(String args[]){
        int arr[][] = new int[5][5];
		try{
		
			for(int i=0;i<5;i++){
			
				for(int j=5;j>i;j--){
					System.out.print(" ");
				}
			
            	for(int k=0;k<=i;k++){
                	if(k==0 || i==k){
                   	 	arr[i][k]=1;
                	}
                	else{
                    	arr[i][k] = arr[i-1][k-1]+arr[i-1][k];
               	 	}
					System.out.print(arr[i][k]+" ");
            	}
				System.out.println();
			}
        }catch(Exception e){
			System.out.print(e);
		}
        
	}
}