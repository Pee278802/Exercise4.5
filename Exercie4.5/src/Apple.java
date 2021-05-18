
public class Apple extends Fruit{
	
	protected int quantity;
	protected double price;
	
	public Apple(String name, int quantity, double price) { 		//constructor with arguments
		super(name);
		this.quantity = quantity;
		this.price = price;
		
		if (this.quantity < 10) {
			totalPrice();
			System.out.println("Total Price: RM" + totalPrice());
		}
		else if (this.quantity > 10 && this.quantity <50) {
			double p = 1.50; 
			totalPrice(p);		//overloading with 1 arg
			System.out.println("Total Price: RM" + totalPrice(p));
		}
		else {
			double p = 1.00;
			double d = 0; //discount	
			if (name =="Apple" || name == "Red apple" || name == "Green Apple") {
				discount dd = new AppleDiscount(); //create new object for Apple discount	
				System.out.println("Discount: "+dd.discountRate()); 
				d = dd.discountRate();
			}
			else if (name == "Orange") {
				discount dd = new OrangeDiscount();
				System.out.println("Discount: " + dd.discountRate());
			}
			else {
				discount dd = new StrawberryDiscount(); //create new object for Durian discount
				System.out.println("DISCOUNT 2 : "+dd.discountRate()); 
			}
			totalPrice(p, d); //overloading with 2 args
			System.out.println("Total Price: RM" + totalPrice(p, d));
		}
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
