public class Drink implements Item {
	protected String name;
	protected double price;
	
	@Override
	public String name() {
		return name;
	}
	
	@Override
	public double price() {
		return price;
	}
}
