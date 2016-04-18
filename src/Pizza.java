public class Pizza implements Item{
	protected String name;
	protected double price;
	
	@Override
	public String name() {
		return name;
	}
	
	public double price() {
		return price;
	}
}
