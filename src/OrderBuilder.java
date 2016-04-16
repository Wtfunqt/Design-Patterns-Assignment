public class OrderBuilder {
	public Order createOrder() {
		Order order = new Order();
		order.addItem(new PizzaPepperoni("medium"));
		order.addItem(new DrinkCoke());
		return order;
	}
}
