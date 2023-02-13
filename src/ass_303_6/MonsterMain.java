package ass_303_6;

public class MonsterMain {

	public static void main(String[] args) {
		Monster fireMon = new FireMonster("Dragahn");
		Monster waterMon = new WaterMonster("Levadon");
		Monster earthMon = new StoneMonster ("Wyrm");
		
		System.out.println(fireMon.attack());
		System.out.println(waterMon.attack());
		System.out.println(earthMon.attack());
		
		System.out.println();
		System.out.println(waterMon.getName() + " has perished! \n");
		
		waterMon = new WaterMonster("Kraken");
		System.out.println(waterMon.attack());

		
	}

}
