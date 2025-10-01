package lvl2_exercise_01;

import lvl2_exercise_01.classes.Initiator;
import lvl2_exercise_01.classes.Restaurant;

import java.util.HashSet;
import java.util.Set;

public class lvl2_ex01_Main {
	public static void main(String[] args) {
		Set<Restaurant> restaurants = new HashSet<Restaurant>();
		Initiator initiate = new Initiator();
		initiate.start(restaurants);
	}
}
