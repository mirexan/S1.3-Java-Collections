package lvl1_exercise_01;

import java.util.ArrayList;

public class Lvl1_Ex01 {
	public static void main(String[] args) {
		ArrayList<Month> months = new ArrayList<Month>();
		Month agost = new Month("Agost");
		int i = 1;

		months.add(new Month("Gener"));
		months.add(new Month("Febrer"));
		months.add(new Month("Març"));
		months.add(new Month("Abril"));
		months.add(new Month("Maig"));
		months.add(new Month("Juny"));
		months.add(new Month("Juliol"));
		months.add(new Month("Septembre"));
		months.add(new Month("Octubre"));
		months.add(new Month("Novembre"));
		months.add(new Month("Desembre"));
		System.out.println("\nLlista abans d'incercio d'agost :");
		for (Month month:months){
			System.out.println(i + ". " + month.getName());
			i++;
		}
		months.add(7,agost);
		System.out.println("\nLlista després d'incercio d'agost :");
		i = 1;
		for (Month month:months){
			System.out.println(i + ". " + month.getName());
			i++;
		}
	}
}
