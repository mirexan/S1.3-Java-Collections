package lvl1_exercise_03.classes;

import java.io.*;
import java.util.*;

public class Iniciate_Ex03 {
	static HashMap<String, String> countries = new HashMap<> ();
	public void start(){
		Scanner sc = new Scanner(System.in);
		String name = "";
		int score = 0;
		readFile();
		name = askName(sc);
		score = playCountriesGame(sc);
		writeAnswer(name,score);
		sc.close();
	}

	public void writeAnswer(String name, int score){
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("classification.txt", true));
			bw.newLine();
			bw.write("User : " + name + " || Score : " + score);
			bw.newLine();
			bw.close();
		}
		catch (IOException e){
			System.out.println("Error : " + e.getMessage());
		}

	}

	public int playCountriesGame(Scanner sc){
		int score = 0;
		String answer = "";
		ArrayList<String> country = new ArrayList<>(countries.keySet());
		Collections.shuffle(country);
		for (int i = 1; i < 11; i++){
			System.out.println("Guess the capital of : " + country.get(i) + "\n( if there are spaces, please write them with a lower case _)");
			answer = sc.next();
			score += answer.equalsIgnoreCase(countries.get(country.get(i)))?1:0;
		}
		return score;
	}

	public String askName(Scanner sc){

		System.out.println("Please insert a name");
		String name = sc.nextLine();
		return name;
	}

	public void readFile(){

		try {
			System.out.println("Current working dir: " + System.getProperty("user.dir"));
			BufferedReader buffer = new BufferedReader(new FileReader("C:/Users/formacio/IdeaProjects/S1.3-Java-Collections/Level_01/src/" +
					"lvl1_exercise_03/classes/countries.txt"));
			String linea = "";
			while ( (linea = buffer.readLine()) != null){
				String[] country = linea.split(" ", 2);
				if (country.length == 2)
					countries.put(country[0],country[1]);
			}
			buffer.close();
		}
		catch (IOException e){
			System.out.println("Error : " + e.getMessage());
		}
	}
}

