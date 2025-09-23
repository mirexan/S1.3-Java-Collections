package lvl1_exercise_01.classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iniciate {

	public void iniciate_exercici(){
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
		System.out.println("\nList before agost insertion :");
		for (Month month : months) {
			System.out.println(i + ". " + month.getName());
			i++;
		}
		months.add(7,agost);
		System.out.println("\nList after agost insertion :");
		i = 1;
		for (Month month:months) {
			System.out.println(i + ". " + month.getName());
			i++;
		}
		Set<Month> monthsSet = new HashSet<Month>();
		monthsSet = conversion_hashSet(months);
		printWithIterator(monthsSet);
		printWithFor(monthsSet);
	}
	public Set<Month> conversion_hashSet(ArrayList<Month> months)
	{
		Set<Month> monthsSet = new HashSet<Month>();
		for (Month month:months) {
			monthsSet.add(month);
		}
		return monthsSet;
	}
	public void printWithIterator(Set<Month> monthSet){
		Iterator<Month> it = monthSet.iterator();
		int i = 1;
		String resposta = "";
		System.out.println("\nPrinting ArrayList converted to hashSet with an iterator :\n");
		while (it.hasNext()){
			resposta = i + ". " + it.next().getName();
			System.out.println(resposta);
			i++;

		}
	}
	public void printWithFor(Set<Month> monthSet)
	{
		int i = 1;
		System.out.println("\nPrinting ArrayList converted to hashSet with a for-each loop :\n");
		for (Month month:monthSet){
			System.out.println(i + ". " + month.getName());
			i++;
		}
	}
}
