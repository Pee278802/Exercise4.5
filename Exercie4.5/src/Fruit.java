public abstract class Fruit {
	//define super class as abstract class. This is bcoz we dont need to create instance of fruit.
	//Class which declare as abstract cannot create instance object
	
	protected String name;
	
	public Fruit(String name) {
		this.name = name;
		//System.out.println("Fruit constructor is invoked");
	}
	
	//declare method that has no implementation
	//only subclass know how to implement the method
	public abstract double totalPrice(); //define method as abstract, only have heading with no body, use semi colon.
			
	
}