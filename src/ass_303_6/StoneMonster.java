package ass_303_6;

public class StoneMonster extends Monster {
	
	public StoneMonster(String name) {this.name = name;}
	
	@Override
	public String attack() {
		return name + " used: Earthquake";
	}
}
