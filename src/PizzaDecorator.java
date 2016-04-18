public class PizzaDecorator extends Pizza {
	
	Pizza pizzaDecorator;
	String size;
	
	protected PizzaDecorator (Pizza pizzaDecorator, String size) {
		this.pizzaDecorator = pizzaDecorator;
		this.size = size;
	}
	
	@Override
	public String name() {
		pizzaDecorator.name = name;
		return pizzaDecorator.name();
	}
	
	@Override
	public double price() {
		pizzaDecorator.price = price;
		return pizzaDecorator.price();
	}
}
