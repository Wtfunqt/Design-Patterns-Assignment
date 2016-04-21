public class Pizza implements Item{
	protected String name = "Jan's special Pizza";
	protected double price = 10;
	
	@Override
	public String name() {
		return name;
	}
	
	public double price() {
		return price;
	}
}
