package lvl2_exercise_02.classes;

import java.util.Comparator;

public class RestaurantByScore implements Comparator<Restaurant2> {
	@Override

	public int compare(Restaurant2 r1, Restaurant2 r2){
		return Integer.compare(r1.getScore(), r2.getScore());
	}
}
