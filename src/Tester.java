public class Tester {
	public static void main(String[] args) {		
		Order order = new Order();
		order.addItem(new PizzaSizeDecorator(new Pizza(), "large"));
		order.addItem(new DrinkSizeDecorator(new Drink(), "medium"));
		order.addItem(new PizzaSizeDecorator(new Pizza(), "medium"));
		order.removeItem(1);
		order.showItems();
	}
}
