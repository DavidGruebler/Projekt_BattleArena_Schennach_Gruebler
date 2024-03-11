package battleArena;

public class App {

	public static void main(String[] args) {
		
		BattleCharacter d1 = new Dragon("Drache", 100, false);
		BattleCharacter dwarf = new Dwarf("Zwerg",100,false);
		
		BattleArea a1 = new BattleArea(d1,dwarf);
		
		a1.startFight();
	}

}
