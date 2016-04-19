public class Drink implements Item {
	protected String name = "drink";
	protected double price = 1;
	
	@Override
	public String name() {
		return name;
	}
	
	@Override
	public double price() {
		return price;
	}
}
