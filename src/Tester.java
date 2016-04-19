public class Tester {
	public static void main(String[] args) {		
		OrderBuilder order = new OrderBuilder();
		
		ItemFactory itemFactory = new ItemFactory();
		
		order.addItem(itemFactory.getItem("large size pizza"));
		order.addItem(new DrinkSizeDecorator(new Drink(), "medium"));
		order.addItem(new PizzaSizeDecorator(new Pizza(), "medium"));
		order.showItems();
	}
}
