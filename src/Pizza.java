public abstract class Pizza implements Item{
	protected String size;
	protected double price;
	
	Pizza(String size) {
		if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large"))
			{
				this.size = size;
				setPrice();
			}
			else System.out.println("size error message");
	}
	
	public void setPrice() {
		if (size.equalsIgnoreCase("small")) price = 8.25;
		else if (size.equalsIgnoreCase("medium")) price = 9.25;
		else if (size.equalsIgnoreCase("large")) price = 10.25;
		else price = 0;
	}
	
	@Override
	public abstract String size();
}
