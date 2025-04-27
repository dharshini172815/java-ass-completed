package assignment;

public class RestaurantManager {
	private SampleArrayList<Restaurant> restaurantList;
	
	public RestaurantManager() {
		restaurantList = new SampleArrayList<>();
	}
	
	public void addRestaurant(String name, String location) {
		Restaurant restaurant = new Restaurant(name, location);
		restaurantList.add(restaurant);
	}
	
	public void removeRestaurant(int index) {
		restaurantList.remove(index);
	}
	
	public void showAllRestaurants() {
		restaurantList.printList();
	}
	
	public Restaurant getRestaurant(int index) {
		return restaurantList.get(index);
	}
	
	public int size() {
		return restaurantList.size();
	}
}
