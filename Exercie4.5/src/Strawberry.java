
public class Strawberry extends Fruit{
	protected String colour, type;
	protected double price;
	protected int pack;
	
	public Strawberry(String name, String colour, double price, int pack) {
		super(name);
		this.colour = colour;
		this.price = price;
		this.pack = pack;
		
		if (this.pack < 10) {
			totalPrice();
			System.out.println("Total Price: RM" + totalPrice());
		}
		else if (this.pack > 10 && this.pack < 30) {
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
		String [] type  = {"Pineberry", "Strasberry", "Alexandria", "Sonata"};
		System.out.println("type of strawberry: ");
		for (int i = 0; i < type.length; i++) {
			System.out.println(type);
		}
		return type;
	}
	
	public double totalPrice() {
		return this.price * this.pack;
	}
	public double totalPrice (double p) {
		return p * this.pack;
	}
	public double totalPrice (double p, double q) {
		return (p * q);
	}
	public String toString() { 		//toString //overriding
		return ("Name = " + super.name + "" + "\n pack = " + pack + "\n price :" + price + " each");
	}
	
}
