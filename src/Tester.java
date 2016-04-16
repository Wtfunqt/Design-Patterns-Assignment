
public class Tester {

	public static void main(String[] args) {
		OrderBuilder test = new OrderBuilder();
		
		Order order = test.createOrder();
		order.orderDetails();
	}

}
