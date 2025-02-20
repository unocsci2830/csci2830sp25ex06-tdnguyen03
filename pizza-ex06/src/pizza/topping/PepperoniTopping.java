package pizza.topping;
public class PepperoniTopping extends MeatTopping {
	public String toString() {
		return "Pepperoni Topping";
	}

	@Override
	public Double getPrice() {
		return 1.75;
	}
}
