package pizza.topping;
public class PineappleTopping extends VeggieTopping {
	public String toString() {
		return "Pineapple Topping";
	}

	@Override
	public Double getPrice() {
		return 3.0;
	}
}
