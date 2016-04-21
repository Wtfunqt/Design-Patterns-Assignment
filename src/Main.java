import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException, NullPointerException {		
		Order order = new Order();
		
		MealBuilder mealBuilder = new MealBuilder();
		
		ItemFactory itemFactory = new ItemFactory();
		
		BurgerMakerFacade burgerMaker = new BurgerMakerFacade();
		
		mealBuilder.angusMeal();
		mealBuilder.cheeseMeal();
		mealBuilder.signatureMeal();
		mealBuilder.total();
		
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
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter card number");
		String number = reader.readLine();
		System.out.println("Enter card name");
		String name = reader.readLine();
		System.out.println("Enter card expiration date");
		String date = reader.readLine();
		System.out.println("Enter card security code");
		String code = reader.readLine();
		CreditCardTemplate card = new VisaCredit(name, number, date, code);
		card.validation();
		System.out.println(card.toString());
	}
}
