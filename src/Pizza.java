public class Pizza implements Item{
	protected String name = "Slice of Pizza";
	protected double price = 10;
	
	@Override
	public String name() {
		return name;
	}
	
	public double price() {
		return price;
	}
}
