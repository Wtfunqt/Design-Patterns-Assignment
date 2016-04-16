public class PizzaCustom extends Pizza {
	private String description;
	private boolean pepperoni = false;
	private boolean cheese = false;
	private boolean chicken = false;
	private boolean mushrooms = false;
	
	PizzaCustom(String size) {
		super(size);
	}
	
	@Override
	public String size() {
		return "small";
	}
	
	@Override
	public String name() {
		return "Custom Pizza";
	}
	
	public void addPepperoni() {
		pepperoni = true;
		price += 1.25;
	}
	
	public void removePepperoni() {
		price -= 1.25;
		pepperoni = false;
	}
	
	public void addMushrooms() {
		mushrooms = true;
		price += 1.50;
	}
	
	public void removeMushrooms() {
		price -= 1.50;
		mushrooms = false;
	}
	
	public void addChicken() {
		chicken = true;
		price += 1.75;
	}
	
	public void removeChicken() {
		price -= 1.75;
		chicken = false;
	}
	
	public void addCheese() {
		cheese = true;
		price += 1;
	}
	
	public void removeCheese() {
		price -= 1;
		cheese = false;
	}
	
	@Override
	public double price() {
		return price;
	}
	
	@Override
	public String description() {
		return "Custom made cheese pizza with option to add mushrooms, pepperoni, chicken or extra cheese";
	}
	
}
