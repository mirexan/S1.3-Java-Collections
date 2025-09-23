package lvl1_exercise_02.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iniciate {
	static List<Integer> firstList = new ArrayList<Integer>();
	public void startProgram(){
		addToFirst();
		System.out.println("Printing first filled List<Integer> : \n" + firstList);
		List<Integer> secondList = new ArrayList<Integer>();
		secondList = addToSecond(secondList);
		System.out.println("Printing second filled List<Integer> with " +
				"the reversed order of the first : \n" + secondList);
	}
	public void addToFirst()
	{
		for (int i = 0; i < 5; i++){
			firstList.add(i);
		}
	}
	public List<Integer> addToSecond(List<Integer> secondList){
		ListIterator<Integer> secondIt = secondList.listIterator();
		ListIterator<Integer> firstIt = firstList.listIterator(firstList.size());
		while (firstIt.hasPrevious()){
			secondList.add(firstIt.previous());
		}
		return secondList;
	}
}
