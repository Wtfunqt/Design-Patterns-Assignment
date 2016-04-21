public class MealBuilder {
	Order order = new Order();
	
	//Angus Cheeseburger + Drink 
	public void angusMeal() {
		order.addItem(new AngusBurger());
		order.addItem(new Drink());
	}
	
	//Cheeseburger + Drink
	public void cheeseMeal() {
		order.addItem(new CheeseBurger());
		order.addItem(new Drink());
	}
	
	//Signature pizza + Drink
	public void signatureMeal() {
		order.addItem(new Pizza());
		order.addItem(new Drink());
	}
	
	public void total() {
		order.showItems();
	}
}
