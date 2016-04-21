public class AngusBurger implements Item {
	private String name = "Angus Burger";
	private double price = 4.99;
	
	@Override
	public String name() {
		return name;
	}
	
	@Override
	public double price() {
		return price;
	}
}
