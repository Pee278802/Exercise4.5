
public class greenApple extends Apple{
	 protected String colour, type, taste;
	 protected int pack;
	 
	 public greenApple(String name, String colour, int quantity, double price, String type, String taste) {
		 super(name, quantity, price);
		 this.colour = colour;
		 this.type = type;
		 this.taste = taste;
	 }
	 
	 public String colour() {
		 return this.colour;
	 }
	 
	 public String type() {
		 return this.type;
	 }
	 
	 public String taste() {
		 return this.taste;
	 }
	 
	 public double calPrice() {
		 return super.price * super.quantity;
	 }
	 
	 public String toString() { 		//toString //overriding
			return ("Name = " + super.name + "" + "\n quantity = " + quantity + "\n price :" + price + " each");
		}
}
