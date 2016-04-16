public class PizzaPepperoni extends Pizza {
	private double price = super.price + 1.25;
	
	PizzaPepperoni(String size) {
		super(size);
	}
	
	@Override
	public String name() {
		return "Pepperoni Pizza";
	}
	
	@Override 
	public double price() {
		return this.price;
	}
	
	@Override
	public String description() {
		return "Delicious Pepperoni pizza with cheese and pepperoni";
	}
	
	@Override
	public String size() {
		return size;
	}
}
