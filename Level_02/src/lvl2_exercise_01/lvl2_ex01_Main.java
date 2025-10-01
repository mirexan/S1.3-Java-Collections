package lvl2_exercise_01;

import lvl2_exercise_01.classes.Iniciator;
import lvl2_exercise_01.classes.Restaurant;

import java.util.HashSet;
import java.util.Set;

/*Crea una classe anomenada Restaurant amb dos atributs: nom(String) i puntuació(int).
Implementa els mètodes necessaris perquè no es puguin introduir objectes Restaurant amb
el mateix nom i la mateixa puntuació en un HashSet creat en el main() de l’aplicació.

Important
    Pot haver-hi restaurants amb el mateix nom amb diferent puntuació, però no pot haver-hi
    restaurants amb el mateix nom i la mateixa puntuació.*/
public class lvl2_ex01_Main {
	public static void main(String[] args) {
		Set<Restaurant> restaurants = new HashSet<Restaurant>();
		Iniciator iniciate = new Iniciator();
		iniciate.start(restaurants);
	}
}
