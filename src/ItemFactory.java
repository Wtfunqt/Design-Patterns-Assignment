public class ItemFactory {
	public Item getItem(String ItemType)  {
		if (ItemType.equalsIgnoreCase("small size pizza")) {
			return new PizzaSizeDecorator(new Pizza(), "small");
		}
		else if (ItemType.equalsIgnoreCase("medium size pizza")) {
			return new PizzaSizeDecorator(new Pizza(), "medium");
		}
		else if (ItemType.equalsIgnoreCase("large size pizza")) {
			return new PizzaSizeDecorator(new Pizza(), "large");
		}
		else if (ItemType.equalsIgnoreCase("small size drink")) {
			return new DrinkSizeDecorator(new Drink(), "small");
		}
		else if (ItemType.equalsIgnoreCase("medium size drink")) {
			return new DrinkSizeDecorator(new Drink(), "medium");
		}
		else if (ItemType.equalsIgnoreCase("large size drink")) {
			return new DrinkSizeDecorator(new Drink(), "large");
		}
		else if (ItemType.equalsIgnoreCase("signature pizza")) {
			return new Pizza();
		}
		else if (ItemType.equalsIgnoreCase("signature drink")) {
			return new Drink();
		}
		else return null;
	}
}
