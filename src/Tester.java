public class Tester {
	public static void main(String[] args) {		
		OrderBuilder order = new OrderBuilder();
		
		ItemFactory itemFactory = new ItemFactory();
		
		BurgerFacadeMaker burgerMaker = new BurgerFacadeMaker();
		
		order.addItem(itemFactory.getItem("small size pizza"));
		order.addItem(itemFactory.getItem("medium size pizza"));
		order.addItem(itemFactory.getItem("large size pizza"));
		order.addItem(itemFactory.getItem("small size drink"));
		order.addItem(itemFactory.getItem("medium size drink"));
		order.addItem(itemFactory.getItem("large size drink")); 
		order.addItem(itemFactory.getItem("special Pizza"));
		order.addItem(itemFactory.getItem("special drink"));
		order.addItem(burgerMaker.getCheeseBurger());
		order.addItem(burgerMaker.getAngusBurger());
		order.showItems();
	}
}
