package lvl2_exercise_02.classes;

import java.util.Comparator;

public class RestaurantByName  implements Comparator<Restaurant2>{

		@Override
		public int compare(Restaurant2 r1, Restaurant2 r2) {
			return r1.getName().compareToIgnoreCase(r2.getName());
		}
}
