import static org.junit.Assert.*;

import org.junit.Test;

public class Tester {

	@Test
	public void testSize() {
		Order order = new Order();
		order.addItem(new PizzaSizeDecorator(new Pizza(), "small"));
		order.showItems();
		String expected = "Small size Pizza";
		String actual = order.getItem(0).name();
		assertEquals(expected, actual);
	}

}
