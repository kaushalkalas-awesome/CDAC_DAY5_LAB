import java.util.Scanner;
import com.app.fruits.*;

public class FruitBasket {

	static Scanner sc = new Scanner(System.in);

	static Fruit setData(String val) {

		String setcolor = null;
		double weight = 0.0;
		boolean fresh = true;
		
		sc.nextLine();
		System.out.print("Enter Color: ");
		if (sc.hasNextLine()) {
			setcolor = sc.nextLine();
		} else {
			System.out.println("Invalid I/P");
			return(null);
		}

		System.out.print("Enter Weight: ");
		if (sc.hasNextDouble()) {
			weight = sc.nextDouble();
		} else {
			System.out.println("Invalid I/P");
			sc.nextLine();
			return(null);
		}

		if (val.equals("apple")) {
			return new Apple(setcolor, weight, "Apple", fresh);
		} else if (val.equals("mango")) {
			return new Mango(setcolor, weight, "Mango", fresh);
		} else if (val.equals("orange")) {
			return new Orange(setcolor, weight, "Orange", fresh);
		} else {
			return null;
		}
	}

	public static void main(String[] args) {

		System.out.print("Enter your Basket Size: ");
		int n = sc.nextInt();
		Fruit[] basket = new Fruit[n];
		int counter = 0;

		while (true) {

			System.out.println("\n------FruitBasket------");
			System.out.println("0. Exit");
			System.out.println("1. Add Apple");
			System.out.println("2. Add Mango");
			System.out.println("3. Add Orange");
			System.out.println("4. Display names of fruits in basket");
			System.out.println("5. Display all fruits in basket");
			System.out.println("6. Mark fruit as stale");
			System.out.println("7. Diplay all stale fruits");
			System.out.print("Enter your Choice: ");
			int ch = sc.nextInt();

			switch (ch) {

			case 0:
				System.exit(0);

			case 1:
				if (counter < n) {
					if (!((basket[counter] = setData("apple")) == null)) {
						counter++;
						System.out.println("------Apple Added------");
						System.out.println("Size of basket: "+(n-counter));
						break;
					} else {
						break;
					}

				} else {
					System.out.println("------Basket Size FULL------");
					break;
				}

			case 2:
				if (counter < n) {
					if (!((basket[counter] = setData("mango")) == null)) {
						counter++;
						System.out.println("------Mango Added------");
						System.out.println("Size of basket: "+(n-counter));
						break;
					} else {
						break;
					}
				} else {
					System.out.println("------Basket Size FULL------");
					break;
				}

			case 3:
				if (counter < n) {
					if (!((basket[counter] = setData("orange")) == null)) {
						counter++;
						System.out.println("------Orange Added------");
						System.out.println("Size of basket"
								+ ": "+(n-counter));
						break;
					} else {
						break;
					}
				} else {
					System.out.println("------Basket Size FULL------");
					break;
				}


			case 4:
				System.out.println("------Display Names of Fruits in basket------");
				int i=1;
				for (Fruit f : basket) {
					if (f == null) {
						System.out.println("Basket is EMPTY");
						break;
					}
					System.out.println(i + ". " + f.getName());
					i++;
				}
				break;

			case 5:
				System.out.println("------Display all fruits in basket------");
				int p=1;
				for (Fruit f : basket) {
					if (f == null) {
						System.out.println("No Fruits Available");
						break;
					}

					System.out.println((p++) + ".");
					System.out.println(f.toString());
					System.out.println("Taste: " + f.taste());
					System.out.println("Fresh: " + f.isFresh());
					System.out.println("------------");
				}
				break;

			case 6:
				System.out.println("------Display all fruits in basket------");
				int j=1;
				for (Fruit f : basket) {
					if (f == null) {
						System.out.println("Basket is EMPTY");
						break;
					}

					System.out.println(j + ". " + f.getName());
					j++;
				}
				if (counter <= n & counter > 0) {
					System.out.println("Enter Number of fruit that is stale: ");
					int k = sc.nextInt();
					if (k <= n + 1) {
						basket[--k].setFresh(false);
						System.out.println("Marked as stale");
					}
						
					else
						System.out.println("Invalid Index");
					break;
				} else {
					break;
				}

			case 7:
				int check_stale=0,g=1;
				System.out.println("------Stale Fruits------");
				for (Fruit f : basket) {
					if (f == null) {
						System.out.println("Basket is EMPTY");
						break;
					}
					if (!f.isFresh()) {
						System.out.println((g++) + ". " + "\n" + f.toString());
						System.out.println("------------");
						check_stale++;
					}
					
					if(check_stale==0) {
						System.out.println("No Stale fruit");
					}
					break;
				}
				break;

			default:
				System.out.println("Invalid");
			}

		}

	}
}