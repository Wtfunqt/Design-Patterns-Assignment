public class CheeseBurger implements Item {
	private String name = "Cheeseburger";
	private double price = 3.79;
	
	@Override
	public String name() {
		return name;
	}

	@Override
	public double price() {
		return price;
	}

}
