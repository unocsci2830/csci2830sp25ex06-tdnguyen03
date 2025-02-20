package pizza.topping;
public class SalamiTopping extends MeatTopping {
	public String toString() {
		return "Salami Topping";
	}

	@Override
	public Double getPrice() {
		return 2.0;
	}
}
