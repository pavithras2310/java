class BTS{
	String name;
	int age;
	BTS(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println(name+" "+age);
	}
}
class Hype extends BTS{
	String degree;
	Hype(String name,int age,String degree){
		super(name,age);
		this.degree = degree;
		System.out.println(name+" "+age+" "+degree);
	}
	public static void main(String args[]){
		Hype t1 = new Hype("Kim TaeHyung",23,"BE");
		Hype t2 = new Hype("Kim Namjoon",23,"BE");
		Hype t3 = new Hype("Kim jin",23,"BE");
		Hype t4 = new Hype("Hope",23,"BE");
		Hype t5 = new Hype("Suga",23,"BE");
	}
}