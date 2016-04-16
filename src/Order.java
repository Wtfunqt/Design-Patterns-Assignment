import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void removeItem() {
		if (!items.isEmpty() && items != null) 
			items.remove(items.size() - 1);
	}
	
	public double getTotalPrice() {
		double totalPrice = 0;
		for (Item i : items) {
			totalPrice += i.price();
		}
		return totalPrice;
	}
	
	public void orderDetails() {
		for (Item i : items) {
			System.out.println(i.size() + " size " + i.name() + ": " + i.price());
		}
		System.out.println("Total price: " + getTotalPrice());
	}
}