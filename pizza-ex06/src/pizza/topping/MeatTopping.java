package pizza.topping;
public class MeatTopping extends PizzaTopping {

	public String toString() {
		return "Meat Topping";
	}

	@Override
	public Double getPrice() {
		return 1.5;
	}
	
}
