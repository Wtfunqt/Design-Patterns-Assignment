public class DrinkDecorator extends Drink {
	private Drink drinkDecorator;
	protected String size;
	
	protected DrinkDecorator(Drink drinkDecorator, String size) {
		this.drinkDecorator = drinkDecorator;
		this.size = size;
	}
	
	public String name() {
		drinkDecorator.name = name;
		return drinkDecorator.name();
	}
	
	public double price() {
		drinkDecorator.price = price;
		return drinkDecorator.price();
	}
}
