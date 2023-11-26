abstract class Animal{
	abstract public void speak();
	abstract public void eat();
}
class DogAbstract extends Animal{
	public void speak(){
		System.out.println("woof");
	}
	public void eat(){
		System.out.println("num num");
	}
	public static void main(String args[]){
		DogAbstract dog = new DogAbstract();
		dog.eat();
		dog.speak();
	}
}