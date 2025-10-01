package lvl2_exercise_01.classes;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Initiator {
	public void start(Set<Restaurant> restaurants){
		Scanner scan = new Scanner(System.in);
		displayMenu(restaurants, scan);
		scan.close();

	}
	public void displayMenu(Set<Restaurant> restaurants, Scanner scan){

		int option = -1;
		String answer = "";
		while (option != 0) {
			System.out.println(" **** Welcome to restaurant registration **** \n" +
					"please pick an option writing his number :\n" +
					"1. Add a restaurant\n" +
					"2. Show all the restaurants\n" +
					"0. Exit");
			option = scan.nextInt();
			scan.nextLine();
			switch (option)
			{
				case 1 :
					answer = addRestaurant(restaurants, scan);
					break;
				case 2 :
					answer = listRestaurant(restaurants);
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

	public String listRestaurant(Set<Restaurant> restaurants){
		int i = 1;
		String answer = "";
		for (Restaurant restaurant :restaurants)
		{
			answer += i + ". " + restaurant.toString() + "\n";
			i++;
		}
		return answer;
	}

	public String addRestaurant(Set<Restaurant> restaurants, Scanner scan){
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
					restaurants.add(new Restaurant(newName, newScore));
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
	public boolean searchName(String newName, Set<Restaurant> restaurants){
		boolean duplicate = false;
		Iterator<Restaurant> iterator = restaurants.iterator();
		while (iterator.hasNext() && !duplicate){
			if (iterator.next().getName().equalsIgnoreCase(newName))
				duplicate = true;
		}
		return duplicate;
	}
	public boolean searchScore(int newScore, Set<Restaurant> restaurants){
		boolean duplicate = false;
		Iterator<Restaurant> iterator = restaurants.iterator();
		while (iterator.hasNext() && !duplicate){
			if (iterator.next().getScore() == newScore)
				duplicate = true;
		}
		return duplicate;
	}
}
