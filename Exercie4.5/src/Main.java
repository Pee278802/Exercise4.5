import java.text.DecimalFormat;

public class Main {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	
	public static void main(String[] args) {

		System.out.println();
		
		Apple a = new Apple("Apple", 1000, 2.50); //new object for sub class
		System.out.println(a);
		System.out.println();
		
		redApple b = new redApple("Red apple", "Red", 500, 2.50, "Cameo Apple", "Sweet");
		System.out.println(b);
		System.out.println();
		
		greenApple c = new greenApple("Green Apple", "Green", 500, 2.50, "Empire Apple", "Sweet");
		System.out.println(c);
		System.out.println();
		
		Orange d = new Orange("Orange", "Orange", 3.00, 1000);
		System.out.println(d);
		System.out.println();
		
		Strawberry e = new Strawberry ("Strawberry", "Pink", 10.50, 1000);
		System.out.println(e);
		System.out.println();
	}
}