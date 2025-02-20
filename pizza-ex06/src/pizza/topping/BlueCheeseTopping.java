package pizza.topping;
public class BlueCheeseTopping extends CheeseTopping {
	public String toString() {
		return "Blue Cheese Topping";
	}

	@Override
	public Double getPrice() {
		return 0.75;
	}
}
