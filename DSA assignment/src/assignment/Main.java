package assignment;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		RestaurantManager rm = new RestaurantManager();
		Scanner sc = new Scanner(System.in);
		int num = -1;
		
		while(num!=0) {
			System.out.println("\n****Restaurant Manager****");
			System.out.println("1. Add Restaurant");
	        System.out.println("2. Get Restaurant");
	        System.out.println("3. Get List Size");
	        System.out.println("4. Remove Restaurant");
	        System.out.println("5. Show All Restaurants");
	        System.out.println("0. Exit");
	        
	        num = sc.nextInt();
	        sc.nextLine();
	        
	        switch(num) {
	        	case 1:
	        		System.out.println("Enter Restaurant name : ");
	        		String name = sc.nextLine();
	        		System.out.println("Enter Restaurant location : ");
	        		String location = sc.nextLine();
	        		rm.addRestaurant(name, location);
	        		break;
	        		
	        	case 2:
	        		System.out.println("Enter Restaurant index : ");
	        		int index = sc.nextInt();
	        		System.out.println(rm.getRestaurant(index));
	        		break;
	        	
	        	case 3:
	        		System.out.println("Total number of Restaurants : " +rm.size());
	        		break;
	        		
	        	case 4:
	        		System.out.println("Enter restaurant index to remove : ");
	        		int ind = sc.nextInt();
	        		System.out.println("Restaurant at index " +ind+ " is removed");
	        		break;
	        		
	        	case 5:
	        		rm.showAllRestaurants();
	        		break;
	        		
	        	case 0:
	        		System.out.println("Exit");
	        		break;
	        		
	        	default:
	        		System.out.println("Invalid option!!!");
	        }
		}
		sc.close();
	}
}
