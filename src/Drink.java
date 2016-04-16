public abstract class Drink implements Item {
	@Override
	public abstract String name();
	@Override
	public abstract String size();
	@Override
	public abstract double price();
	@Override
	public abstract String description();
}
