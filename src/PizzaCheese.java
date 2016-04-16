public class PizzaCheese extends Pizza {
	
	PizzaCheese(String size) {
		super(size);
	}
	
	@Override
	public String name() {
		return "Cheese Pizza";
	}
	
	@Override
	public String description() {
		return "Super tasty cheese pizza";
	}
	
	@Override
	public double price() {
		return price;
	}
	
	@Override
	public String size() {
		return size;
	}
}
