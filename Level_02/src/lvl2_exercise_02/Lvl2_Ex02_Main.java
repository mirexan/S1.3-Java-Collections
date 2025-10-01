package lvl2_exercise_02;

import lvl2_exercise_02.classes.Methods;
import lvl2_exercise_02.classes.Restaurant2;

import java.util.HashSet;
import java.util.Set;

public class Lvl2_Ex02_Main {
	public static void main(String[] args) {
		Set<Restaurant2> restaurants = new HashSet<Restaurant2>();
		Methods initiate = new Methods();
		initiate.start(restaurants);
	}
}
