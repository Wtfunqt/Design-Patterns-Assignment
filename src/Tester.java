	import static org.junit.Assert.*;

import org.junit.Test;

public class Tester {

	//1 case
	@Test
	public void testSize() {
		Order order = new Order();
		order.addItem(new PizzaSizeDecorator(new Pizza(), "small"));
		String expected = "Small size Pizza";
		String actual = order.getItem(0).name();
		assertEquals(expected, actual);
	}
	
	//2 case
	@Test
	public void testItems() {
		Order order = new Order();
		order.addItem(new Pizza());
		Item expected = new Pizza();
		Item actual = order.getItem(0);
		assertEquals(expected, actual);
	}
	
	//3 case
	@Test
	public void testTotal() {
		Order order = new Order();
		order.addItem(new Pizza());
		order.addItem(new Drink());
		double expected = 15.00;
		double actual = order.getTotal();
		double precision = 0.0000000001;
		assertEquals(expected, actual, precision);
	}
	
	//4 case
	@Test
	public void removeTester() {
		Order order = new Order();
		order.addItem(new Pizza());
		order.addItem(new Drink());
		order.addItem(new PizzaSizeDecorator(new Pizza(), "large"));
		order.addItem(new DrinkSizeDecorator(new Drink(), "small"));
		order.removeItem(1);
		int expected = 3;
		int actual = order.arraySize();
		assertEquals(expected, actual);
	}
	
	//5 case
	@Test
	public void removeAllTester() {
		Order order = new Order();
		order.addItem(new Pizza());
		order.addItem(new Drink());
		order.removeAll();
		int expected = 0;
		int actual = order.arraySize();
		assertEquals(expected, actual);
	}
	
	//6 case
	@Test
	public void mealBuilderTest() {
		MealBuilder mealBuilder = new MealBuilder();
		mealBuilder.angusMeal();
		int expected = 2;
		int actual = mealBuilder.order.arraySize();
		assertEquals(expected, actual);
	}
		
	//7 case
	@Test	
	public void preFixCheck() {
		CreditCardTemplate card1 = new VisaCredit("Ademir Gotov", "4234567890123", "1218", "578", 100);
		boolean expected1 = true;
		boolean actual1 = card1.cardNumPrefixCheck();
		assertEquals(expected1, actual1);
		
		CreditCardTemplate card2 = new VisaCredit("Ademir Gotov", "6123456789012345", "1218", "578", 100);
		boolean expected2 = false;
		boolean actual2 = card2.cardNumPrefixCheck();
		assertEquals(expected2, actual2);
	}
	
	//8 case
	@Test
	public void entriesCheck() {
		CreditCardTemplate card1 = new VisaCredit("123", "4123456789012345", "1218", "578", 100);
		boolean expected1 = false;
		boolean actual1 = card1.validation();
		assertEquals(expected1, actual1);
		
		CreditCardTemplate card2 = new VisaCredit("Ademir Gotov", "11234567890123456", "1218", "578", 100);
		boolean expected2 = false;
		boolean actual2 = card2.validation();
		assertEquals(expected2, actual2);
		
		CreditCardTemplate card3 = new VisaCredit("Ademir Gotov", "4123456789012345", "1218", "5783", 100);
		boolean expected3 = false;
		boolean actual3 = card3.validation();
		assertEquals(expected3, actual3);
		
		CreditCardTemplate card4 = new VisaCredit("Ademir Gotov", "4123456789012345", "1218", "573", 100);
		boolean expected4 = true;
		boolean actual4 = card4.validation();
		assertEquals(expected4, actual4);
	}
	
	//9 case
	@Test
	public void expirationDateCheck() {
		CreditCardTemplate card1 = new VisaCredit("Ademir Gotov", "4123456789012345", "1210", "578", 100);
		boolean expected1 = false;
		boolean actual1 = card1.isExpValid(card1.getExpiration());
		assertEquals(expected1, actual1);
		
		CreditCardTemplate card2 = new VisaCredit("Ademir Gotov", "11234567890123456", "1218", "578", 100);
		boolean expected2 = true;
		boolean actual2 = card2.isExpValid(card2.getExpiration());
		assertEquals(expected2, actual2);
	}
	
	//10 case
	@Test
	public void balanceLimit() {
		Order order = new Order();
		order.addItem(new Pizza());
		order.addItem(new Drink());
		order.addItem(new Drink());
		CreditCardTemplate card = new VisaCredit("Ademir Gotov", "4123456789012345", "1218", "573", 30);
		boolean expected1 = true;
		boolean actual1 = card.pay(order.getTotal());
		assertEquals(expected1, actual1);
		boolean expected2 = false;
		boolean actual2 = card.pay(order.getTotal());
		assertEquals(expected2, actual2);
	}

}
