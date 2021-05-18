
class AppleDiscount implements discount{
	public float discountRate() { //method with body
		return 0.2f;
	}
}

class OrangeDiscount implements discount{
	public float discountRate() {
		return 0.05f;
	}
}

class StrawberryDiscount implements discount{
	public float discountRate() {
		return 0.1f;
	}
}