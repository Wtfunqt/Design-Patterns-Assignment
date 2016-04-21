public class BurgerFacadeMaker {
	private Item cheeseBurger;
	private Item angusBurger;
	
	public BurgerFacadeMaker() {
		cheeseBurger = new CheeseBurger();
		angusBurger = new AngusBurger();
	}

	public Item getCheeseBurger() {
		return cheeseBurger;
	}
	
	public Item getAngusBurger() {
		return angusBurger;
	}
	
	public String cheeseName() {
		return cheeseBurger.name();
	}
	
	public String angusName() {
		return angusBurger.name();
	}
	
	public double cheesePrice() {
		return cheeseBurger.price();
	}
	
	public double angusPrice() {
		return angusBurger.price();
	}
}
