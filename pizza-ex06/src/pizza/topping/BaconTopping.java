package pizza.topping;
public class BaconTopping extends MeatTopping {
	public String toString() {
		return "Bacon Topping";
	}

	@Override
	public Double getPrice() {
		return 2.25;
	}
}
