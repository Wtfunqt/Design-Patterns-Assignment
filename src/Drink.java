public class Drink implements Item {
	protected String name = "Drink in a bottle";
	protected double price = 5;
	
	@Override
	public String name() {
		return name;
	}
	
	@Override
	public double price() {
		return price;
	}
}
