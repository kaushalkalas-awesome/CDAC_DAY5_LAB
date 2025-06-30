import java.util.Scanner;
import com.app.fruits.*;

public class FruitBasket {
	
	static Scanner sc = new Scanner(System.in);
	static int counter = 0;
	
	public static void main(String[] args) {
		
		System.out.print("Enter your Basket Size: ");
		int n = sc.nextInt();
		Fruit[] basket = new Fruit[n];
		
		while(true) {
			
			System.out.println("------FruitBasket------");
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
			
			switch(ch) {
			
				case 0:System.exit(0);
			
				case 1: if(counter<=n) {
					basket[counter]=new Apple("Red",12.2,"Apple",true);
					counter++;
					break;
				}
				
				case 2:if(counter<=n) {
					basket[counter]=new Mango("Yellow",16.9,"Mango",true);
					counter++;
					
				}
				break;
				
				case 3:if(counter<=n) {
					basket[counter]=new Orange("Orange",12.2,"Orange",true);
					counter++;
				}
				break;
				
				case 4: for(Fruit f: basket) {
					if(f==null)
						break;
					
					int i=1;
					System.out.println(i+". "+f.getName());
					i++;
				}
				break;
				
				case 5: for(Fruit f: basket) {
					if(f==null)
						break;
					
					System.out.println("Fruit: "+f.toString());
					System.out.println("Taste: "+f.taste());
					System.out.println("Fresh: "+f.isFresh());
					break;
				}
				
				
				case 6: System.out.println("Enter index: ");
					int i=sc.nextInt();
					if(i<=n)
						basket[i].setFresh(false);
					else
						System.out.println("Invalid Index");
					break;
					
				case 7: System.out.println("------Stale Fruits------");
				for(Fruit f: basket) {
					if(basket[counter].isFresh())
						System.out.print(counter+". "+basket[counter].toString());
					break;
				}
				
				
				default:
					System.out.println("Invalid");
			}
			
			
		}
		
	}
}
