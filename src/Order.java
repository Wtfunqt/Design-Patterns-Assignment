import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Item> array = new ArrayList<Item>();
	private double total = 0;
	
	public void addItem(Item Item) {
		array.add(Item);
	}
	
	public void removeItem(int a) {
		array.remove(a - 1);
	}
	
	public void removeAll() {
		array.clear();
	}

	public void showItems() {
		for (int i = 0; i < array.size(); i++) {
			System.out.println(i+1 + " " + array.get(i).name() + " " + array.get(i).price());
			total += array.get(i).price();
		}
		System.out.println("\nWith total price of: " + total + "\n");
	}
}
