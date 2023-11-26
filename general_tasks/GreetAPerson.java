class Greetings{
	void greet(){
		System.out.println("Hello!");
	}
} 
class GreetAPerson extends Greetings{
	void greet(String name){
		System.out.println("Hello "+name);
	}
	public static void main(String args[]){
		GreetAPerson person = new GreetAPerson();
		Greetings greet = new Greetings();
		greet.greet();
		person.greet("Pavithra");
	}
}