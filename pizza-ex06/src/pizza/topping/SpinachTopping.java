package pizza.topping;
public class SpinachTopping extends VeggieTopping {
	public String toString() {
		return "Spinach Topping";
	}

	@Override
	public Double getPrice() {
		return 1.0;
	}
}