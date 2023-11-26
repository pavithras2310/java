class Pet{
	void Brag(){
		System.out.println("I have the best Pet!");
	}
}
class Dog extends Pet{
	void Brag(){
		super.Brag();
		System.out.println("I have the best Dog!");
	}
	public static void main(String args[]){
		Dog d = new Dog();
		d.Brag();
	}
}