package pizza.topping;
public class VeggieTopping extends PizzaTopping {
	@Override
	public String toString() {
		return "Veggie Topping";
	}

	@Override
	public Double getPrice() {
		return 0.5;
	}
}
