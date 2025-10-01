package lvl2_exercise_02.classes;


public class Restaurant2 {
	private String name;
	private int score;

	public Restaurant2(String name, int score){
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
		return "Restaurant's name : " + this.name + ", score : " + this.score;
	}

}
