public class PizzaSizeDecorator extends PizzaDecorator {
	
	public PizzaSizeDecorator(Pizza pizzaDecorator, String size) {
		super(pizzaDecorator, size);
	}
	
	@Override
	public String name() {
		setVariables();
		return super.name();
	}
	
	private void setVariables() {
		if (super.size == "small") {
			name = "Small size Pizza";
			price = 10.25;
		}
		else if (super.size == "medium") {
			name = "Medium size Pizza";
			price = 11.50;
		}
		else if (super.size == "large") {
			name = "Large size Pizza";
			price = 12.25;
		}
	}
}
