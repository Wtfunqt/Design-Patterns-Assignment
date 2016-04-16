public class DrinkNestea extends Drink {

	@Override
	public String name() {
		return "Nestea";
	}
	
	@Override
	public double price() {
		return 1.25;
	}
	
	@Override
	public String size() {
		return "Small";
	}
	
	@Override
	public String description() {
		return "Cool drink to your pizza";
	}
}
