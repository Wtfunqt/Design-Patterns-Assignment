public class Pizza implements Item{
	protected String name = "Jan's signature Pizza";
	protected double price = 10;
	
	@Override
	public String name() {
		return name;
	}
	
	public double price() {
		return price;
	}
}
