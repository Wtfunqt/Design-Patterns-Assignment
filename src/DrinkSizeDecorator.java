public class DrinkSizeDecorator extends DrinkDecorator {
	DrinkSizeDecorator(Drink drink, String size) {
		super(drink, size);
	}
	
	@Override
	public String name() {
		setValues();
		return super.name();
	}
	
	public void setValues() {
		if (super.size == "small") {
			name = "Small size Drink";
			price = 1.25;
		}
		else if (super.size == "medium") {
			name = "Medium size Drink";
			price = 1.75;
		}
		else if (super.size == "large") {
			name = "Large size Drink";
			price = 2.25;
		}
	}
}
