import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Item> array = new ArrayList<Item>();
	private double total;
	private String items;
	
	public void addItem(Item Item) {
		array.add(Item);
	}
	
	public void removeItem() {
		array.remove(array.size() - 1);
	}
	
	public void removeAll() {
		array.clear();
	}
	
	public Item getItem(int i) {
		return array.get(i);
	}

	public double getTotal() {
		total = 0;
		for (int i = 0; i < array.size(); i++) {
			total += array.get(i).price();
		}
		return total;
	}
	
	public int arraySize() {
		return array.size();
	}
	
	public String showItems() {
		items = "";
		for (int i = 0; i < array.size(); i++) {
			items += array.get(i).name() + " " + array.get(i).price() + "                  ";		
		}
		return items;
	}
}
