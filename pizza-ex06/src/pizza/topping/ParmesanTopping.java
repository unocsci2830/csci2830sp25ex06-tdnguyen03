package pizza.topping;
public class ParmesanTopping extends CheeseTopping {
	public String toString() {
		return "Parmesan Topping";
	}

	@Override
	public Double getPrice() {
		return 1.0;
	}
}
