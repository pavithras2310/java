class Candy{
	void taste(){
		System.out.println("tastes sweet!");
	}
}
class Chocolate extends Candy{
	void taste(){
		System.out.println("tastes chocolately!");
	}
	public static void main(String args[]){
		Candy choObj = new Candy();
		Chocolate canObj = new Chocolate();
		choObj.taste();
		canObj.taste();
	}
	
}