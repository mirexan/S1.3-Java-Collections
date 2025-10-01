package lvl2_exercise_01.classes;

public class Restaurant {
	private String name;
	private int score;

	public Restaurant(String name, int score){
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}

	@Override
	public String toString() {
		return "Restaurant's name : " + this.name + "  score : " + this.score;
	}
}
