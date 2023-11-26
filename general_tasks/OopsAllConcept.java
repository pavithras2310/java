//abstraction
interface Animal{
	public void AnimalName();
}
class Dog implements Animal{
	public void AnimalName(){
		System.out.println("Animal");
	}
}
abstract class Student{
	public void printName(String name){
		System.out.println(name+" ");
	}
	abstract public void printId(int id);
}
class Person extends Student{
	public void printId(int id){
		System.out.println(id+" ");
	}
}

//polymorphism
class Fruit{
	void taste(){
		System.out.println("tastes sweety");
	}
	void taste(String fruit){
		System.out.println(fruit+" tastes sweety");
	}
}
class Orange extends Fruit{
	void taste(){
		System.out.println("tastes sweety");
	}
	void taste(String fruitName){
		System.out.println(fruitName+" tastes sour");
	}
}

//inheritance
class Candy{
	void tastee(){
		System.out.println("tastes sweet!");
	}
}
class Chocolate extends Candy{
	void tastee(){
		System.out.println("tastes chocolately!");
	}
}

class OopsAllConcept{
	public static void main(String args[]){
		//encapsulatoin
		int a=10;
		Integer i = Integer.valueOf(a);
		Integer j = a;
		System.out.println(a+" "+i+" "+j);
		//inheritance
		Chocolate c = new Chocolate();
		c.tastee();
		//polymorphism
		Orange o = new Orange();
		o.taste("orange");
		//abstraction
		Dog d = new Dog();
		d.AnimalName();
	}
}