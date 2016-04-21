public class Drink implements Item {
	protected String name = "Jan's signature Drink";
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
