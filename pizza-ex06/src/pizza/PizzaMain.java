package pizza;
import java.util.Scanner;

import pizza.crust.ThickCrust;
import pizza.crust.ThinCrust;
import pizza.sauce.AlfredoSauce;
import pizza.sauce.TomatoSauce;
import pizza.topping.AsiagoTopping;
import pizza.topping.BaconTopping;
import pizza.topping.BlueCheeseTopping;
import pizza.topping.MozzarellaTopping;
import pizza.topping.MushroomTopping;
import pizza.topping.ParmesanTopping;
import pizza.topping.PepperTopping;
import pizza.topping.PepperoniTopping;
import pizza.topping.PineappleTopping;
import pizza.topping.SalamiTopping;
import pizza.topping.SausageTopping;
import pizza.topping.SpinachTopping;

public class PizzaMain {
	private Pizza pizza;
	private Scanner input;
	
	public PizzaMain() {
		pizza = new Pizza();
		input = new Scanner(System.in);
	}
	
	private void inputCrustChoice() {
		Boolean validChoice = false;
		Integer choice = 0;
		ThickCrust thickCrust = null;
		System.out.println("What kind of crust would you like:");
		System.out.println("1 - Thin Crust");
		System.out.println("2 - Thick Crust");
		System.out.print("Your choice: ");
		while (!validChoice) {
			choice = input.nextInt();
			switch(choice) {
				case 1: 
					pizza.setCrust(new ThinCrust());
					validChoice = true;
					break;
				case 2: 
					thickCrust = new ThickCrust();
					pizza.setCrust(thickCrust);
					validChoice = true;
					break;
				default:
					System.out.println("Pick between 1-2");
			}
		}
		
		System.out.println("Select crust ingredient:");
		System.out.println("1 - Flour");
		System.out.println("2 - Cauliflower");
		System.out.print("Your choice: ");
		validChoice = false;
		while (!validChoice) {
			Integer ingChoice = input.nextInt();
			switch(ingChoice) {
				case 1: 
					pizza.getCrust().setIngredient("Flour");
					validChoice = true;
					break;
				case 2: 
					pizza.getCrust().setIngredient("Cauliflower");
					validChoice = true;
					break;
				default:
					System.out.println("Pick between 1-2");
			}
		}
		
		// ask about deep dish option if ThickCrust 
		if (choice == 2) {
			System.out.print("Deep Dish? (Y/N)");
			validChoice = false;
			while (!validChoice) {
				String deepDishChoice = input.next();
				switch(deepDishChoice) {
					case "Y": 
					case "y":
						thickCrust.setIsDeepDish(true);
						validChoice = true;
						break;
					case "N": 
					case "n":
						thickCrust.setIsDeepDish(false);
						validChoice = true;
						break;
					default:
						System.out.println("Pick between Y or N");
				}
			}
			
		}
			

	}

	private void inputSauceChoice() {
		Boolean validChoice = false;
		System.out.println("What kind of sauce would you like:");
		System.out.println("1 - Tomato Sauce");
		System.out.println("2 - Alfredo Sauce");
		System.out.print("Your choice: ");
		while (!validChoice) {
			Integer choice = input.nextInt();
			switch(choice) {
				case 1: 
					pizza.setSauce(new TomatoSauce());
					validChoice = true;
					break;
				case 2: 
					pizza.setSauce(new AlfredoSauce());
					validChoice = true;
					break;
				default:
					System.out.println("Pick between 1-2");
			}
		}
	}

	private void inputToppingChoices() {
		System.out.print("How many toppings? ");
		Integer numToppings = input.nextInt();
		for (Integer i = 0; i < numToppings; i++) {
			Boolean validChoice = false;
			System.out.println("1 - Pepperoni");
			System.out.println("2 - Sausage");
			System.out.println("3 - Salami");
			System.out.println("4 - Bacon");
			System.out.println("5 - Pepper");
			System.out.println("6 - Mushroom");
			System.out.println("7 - Pineapple");
			System.out.println("8 - Spinach");
			System.out.println("9 - Mozzarella");
			System.out.println("10 - Asiago");
			System.out.println("11 - Parmesan");
			System.out.println("12 - Blue Cheese");
			System.out.print("Your choice: ");
			while (!validChoice) {
				Integer choice = input.nextInt();
				switch(choice) {
					case 1: 
						pizza.addTopping(new PepperoniTopping());
						validChoice = true;
						break;
					case 2: 
						pizza.addTopping(new SausageTopping());
						validChoice = true;
						break;
					case 3: 
						pizza.addTopping(new SalamiTopping());
						validChoice = true;
						break;
					case 4: 
						pizza.addTopping(new BaconTopping());
						validChoice = true;
						break;
					case 5: 
						pizza.addTopping(new PepperTopping());
						validChoice = true;
						break;
					case 6: 
						pizza.addTopping(new MushroomTopping());
						validChoice = true;
						break;
					case 7: 
						pizza.addTopping(new PineappleTopping());
						validChoice = true;
						break;
					case 8: 
						pizza.addTopping(new SpinachTopping());
						validChoice = true;
						break;
					case 9: 
						pizza.addTopping(new MozzarellaTopping());
						validChoice = true;
						break;
					case 10: 
						pizza.addTopping(new AsiagoTopping());
						validChoice = true;
						break;
					case 11: 
						pizza.addTopping(new ParmesanTopping());
						validChoice = true;
						break;
					case 12: 
						pizza.addTopping(new BlueCheeseTopping());
						validChoice = true;
						break;
					default:
						System.out.println("Pick between 1-6");
				}
			}
		}
	}
	
	private void showPizza() {
		pizza.display();
		System.out.println(pizza.getCrust().checkIntegrity());
	}
	
	public void runMenu() {
		inputCrustChoice();
		inputSauceChoice();
		inputToppingChoices();
		showPizza();
	}
	
	public static void main(String[] args) {
		PizzaMain pm = new PizzaMain();
		pm.runMenu();

	}
}
