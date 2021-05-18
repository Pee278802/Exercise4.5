
public class Orange extends Fruit{
	protected String colour, type;
	protected double price;
	protected int quantity;
	
	public Orange(String name, String colour, double price, int quantity) {
		super(name);
		this.colour = colour;
		this.price = price;
		this.quantity = quantity;
		
		if (this.quantity < 10) {
			totalPrice();
			System.out.println("Total Price: RM" + totalPrice());
		}
		else if (this.quantity > 10 && this.quantity < 30) {
			double p = 1.50; 
			totalPrice(p);		//overloading with 1 arg
			System.out.println("Total Price: RM" + totalPrice(p));
		}
		else {
			double p = 1.00;
			double d = 0.90; //discount	
			totalPrice(p,d); //overloading with 2 args
			System.out.println("Total Price: RM" + totalPrice(p,d));
		}
	}
	public String colour() {
		return this.colour;
	}
	
	public String[] type() {
		String [] type  = {"Navel", "Mandarin", "Blood Oranges", "Valencia"};
		System.out.println("type of orange: ");
		for (int i = 0; i < type.length; i++) {
			System.out.println(type);
		}
		return type;
	}
	
	public double totalPrice() {
		return this.price * this.quantity;
	}
	public double totalPrice (double p) {
		return p * this.quantity;
	}
	public double totalPrice (double p, double q) {
		return (p * q);
	}
	public String toString() { 		//toString //overriding
		return ("Name = " + super.name + "" + "\n quantity = " + quantity + "\n price :" + price + " each");
	}
}
