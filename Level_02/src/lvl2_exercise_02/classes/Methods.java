package lvl2_exercise_02.classes;

import java.util.*;

public class Methods {
	public void start(Set<Restaurant2> restaurants){
		Scanner scan = new Scanner(System.in);
		displayMenu(restaurants, scan);
		scan.close();
	}

	public void displayMenu(Set<Restaurant2> restaurants, Scanner scan){

		int option = -1;
		String answer = "";
		while (option != 0) {
			System.out.println(" **** Welcome to restaurant registration **** \n" +
					"please pick an option writing his number :\n" +
					"1. Add a restaurant\n" +
					"2. Show all the restaurants by name\n" +
					"3. Show all the restaurants by score\n" +
					"0. Exit");
			option = scan.nextInt();
			scan.nextLine();
			switch (option)
			{
				case 1 :
					answer = addRestaurant(restaurants, scan);
					break;
				case 2 :
					answer = listRestaurantByName(restaurants);
					break;
				case 3 :
					answer = listRestaurantByScore(restaurants);
					break;
				case 0 :
					answer = "Leaving the menu";
					break;
				default:
					answer = "invalid option";
					break;
			}
			System.out.println(answer);
		}
	}

	public String listRestaurantByName(Set<Restaurant2> restaurants){
		int i = 1;
		String answer = "";
		if (restaurants.isEmpty()) {
			answer = "Restaurant list is Empty";
		}
		else {
			List<Restaurant2> listByName = new ArrayList<>(restaurants);
			Collections.sort(listByName, Collections.reverseOrder(new RestaurantByName()));
			for (Restaurant2 restaurant : listByName) {
				answer += i + ". " + restaurant.toString() + "\n";
				i++;
			}
		}
		return answer;
	}

	public String listRestaurantByScore(Set<Restaurant2> restaurants){
		int i = 1;
		String answer = "";
		if (restaurants.isEmpty()) {
			answer = "Restaurant list is Empty";
		}
		else {
			List<Restaurant2> listByScore = new ArrayList<>(restaurants);
			Collections.sort(listByScore, Collections.reverseOrder(new RestaurantByScore()));
			for (Restaurant2 restaurant : listByScore) {
				answer += i + ". " + restaurant.toString() + "\n";
				i++;
			}
		}
		return answer;
	}

	public String addRestaurant(Set<Restaurant2> restaurants, Scanner scan){
		boolean nameDup = false;
		boolean correct = false;
		boolean scoreDup = false;
		String newName = "";
		String answer = "";
		int newScore = 0;
		while (!correct){
			try {
				System.out.println("Please introduce a restaurant name :");
				newName = scan.nextLine();
				nameDup = searchName(newName, restaurants);
				System.out.println("Please introduce a score number for the restaurant :");
				newScore = scan.nextInt();
				scan.nextLine();
				scoreDup = searchScore(newScore, restaurants);
				if (!nameDup || !scoreDup){
					restaurants.add(new Restaurant2(newName, newScore));
					correct = true;
					answer = "The restaurant " + newName + "has been introduced to the list";
				}
				else{
					answer = "This restaurant is already in the list.\n" +
							"Please introduce at least one different attribute to add a new restaurant";
				}
			}
			catch (InputMismatchException e){
				System.out.println("Error : " + e.getMessage());
			}
		}
		return answer;
	}

	public boolean searchName(String newName, Set<Restaurant2> restaurants){
		boolean duplicate = false;
		Iterator<Restaurant2> iterator = restaurants.iterator();
		while (iterator.hasNext() && !duplicate){
			if (iterator.next().getName().equalsIgnoreCase(newName))
				duplicate = true;
		}
		return duplicate;
	}

	public boolean searchScore(int newScore, Set<Restaurant2> restaurants){
		boolean duplicate = false;
		Iterator<Restaurant2> iterator = restaurants.iterator();
		while (iterator.hasNext() && !duplicate){
			if (iterator.next().getScore() == newScore)
				duplicate = true;
		}
		return duplicate;
	}
}
