class Store{
	String name;
	String address;
	
	String getName(){
		return name;
	}
	String getAddress(){
		return address;
	}
	void setter(name,address){
		this.name=name;
		this.address=address;
	}
}
class Saravana extends Store{
	super.setter(name,address);
	super.getName();
	super.getAddress();
}