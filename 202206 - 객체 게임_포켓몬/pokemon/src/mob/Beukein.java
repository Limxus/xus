 package mob;

public class Beukein extends Pokemon {

	Condition c = new Condition();
	
	public Beukein(String name) {
		this.name = name;
		property = "불꽃";

		setStats();
		
		skillName1 = "불꽃세례";
		sk01usedMp = 3;
		skillName2 = "불꽃 자동차";
		sk02usedMp = 3;
	}

	public void setStats() {
		health = health+((lev-1)*10);
		ether = ether+((lev-1)*1);
		atk = atk+((lev-1)*3)+4;
		def = def+((lev-1)*0.1);
		hp = health;
		mp = ether;
		setBattleAtk();
		setBattleDef();
	}

	public void skill01(Pokemon p) {
		System.out
				.println("===========================================================================================");
		System.out.println("   " + name + "(가) " + skillName1 + "을 사용했다!");
		System.out
				.println("===========================================================================================");
		setBattleAtk();
		setBattleDef();
		dmg = battleAtk * 1.8;
		shield = battleDef - 1;
		mp -= sk01usedMp;
	}

	public void skill02(Pokemon p) {
		System.out
				.println("===========================================================================================");
		System.out.println("   " + name + "(가) " + skillName2 + "을 사용했다!");
		System.out.println("   " + name + "의 공격력이 증가했다!");
		System.out
				.println("===========================================================================================");
		c.upAtk(this, 6+(lev-1)*1, 2);
		setBattleAtk();
		setBattleDef();
		dmg = battleAtk;
		shield = battleDef;
		mp -= sk02usedMp;
	}

	public void img() {
		System.out.println();
		System.out.println();
		System.out.println("                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣆⠀⠀⢀⡀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣦⡀⢸⣿⣿⣿⣆⠀⣼⣿⠀⣠⣴⣾⣿⣿⣿⣿⣿⣿⣿⣷⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣼⣿⣿⣿⣿⣦⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣤⡀⠀⠀⢀⡀⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠛⠉⠙⠛⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                ⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣦⡀⣀⣿⣿⣿⣿⣿⡏⢹⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                ⠈⠻⢿⣿⣷⣶⣤⣄⣀⠀⠀⠀⠀⢀⡀⠀⢷⣾⣿⣿⣿⣾⣿⣿⣿⣿⡿⠃⠸⣿⡟⠀⠀⠀⠀⠀⣀⣤⣀⡀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                ⠀⠀⠀⠙⠻⣿⣿⣿⣿⣿⣿⣶⣦⣬⣿⣿⣶⣿⣿⣿⣿⣿⣿⣿⣿⠛⠁⠀⠀⠙⡇⠀⠀⠀⠀⡼⠁⠀⠀⠙⢦⡀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣤⡀⠀⠀⠀⠀⠀⠀");
		System.out.println("                ⠀⠀⠀⠀⠀⠈⠙⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡎⠛⢿⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⢻⡄⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀");
		System.out.println("                ⠀⠀⠀⠀⠀⠀⢴⣤⣬⣿⣿⣿⣿⣿⣿⣿⡛⠿⠧⠉⠙⠛⠂⠀⠀⠀⠀⢀⣆⣠⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⠀⠀⠙⠻⠿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣆⠀⠀");
		System.out.println("                ⠀⠀⠀⠀⠀⠀⠀⠈⠛⢿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⢀⣴⣾⣿⣿⣿⣿⣧⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⢿⣿⣿⣷⡄");
		System.out.println("                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣬⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⠟⠋⢻⣷⣦⣤⣀⣀⣀⣀⣀⣠⣤⣤⣴⠶⠶⠶⠶⠦⢤⣄⣀⡀⠀⠈⠛⡟⢳");
		System.out.println("                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣉⣿⣿⣿⣿⣿⣿⠄⠀⣚⢲⣤⣾⣿⣿⣿⣿⣿⠏⠀⠀⠤⣄⠙⠻⠿⢿⣿⡿⠻⠏⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠑⠒⠤⠭⠜");
		System.out.println("                ⠀⠀⠀⠀⢀⣠⣤⣶⣶⣿⣿⣿⣿⣿⣿⣿⣯⣄⣀⣤⣙⣿⣿⣿⣿⣿⣿⣿⢏⡀⠀⠀⠀⠈⢳⠀⠀⠀⠀⡄⠀⠘⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                ⠀⠀⠀⠛⠛⠻⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⣿⣿⣿⣿⣿⣿⣿⠿⠃⠀⢳⡄⠀⠀⠀⠀⢷⠀⠀⢸⡇⠀⠀⡅⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⠟⠋⠉⠉⠉⠐⢤⡀⠀⠀⠙⠶⣤⣤⣴⡿⠀⠀⠘⣧⣤⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣶⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠱⠀⠀⠀⠀⠀⠉⠉⠀⠀⠀⠀⢹⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠁⠀⠀⠀⠀⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣶⣤⣀⡀⠀⠀⠀⠀⠀⣸⡄⠀⢀⣀⣤⣤⣶⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣶⣶⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⠿⠿⠟⠛⠛⠛⠉⢿⣿⣿⣿⣿⣿⣏⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⢿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⠿⠿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠓⠛⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("");
		System.out.println("");
	}

	public void info() {
		System.out
				.println("===========================================================================================");
		System.out.println();
		System.out.println();
		System.out.println("    ▶ 브케인");
		System.out.println("    불 속성 포켓몬");
		System.out.println("	\r\n"
				+ "    겁이 많아서 늘 몸을 웅크리고 있다.\r\n"
				+ "    습격당하면 등의 불꽃을 타오르게 해서 몸을 보호한다.");
		System.out.println();
		System.out.println("    ▶ SKILL");
		System.out.println();
		System.out.println("    " + skillName1 + " : 작은 불꽃을 상대에게 발사하여 공격한다.");
		System.out.println();
		System.out.println("    " + skillName2 + " : 불꽃을 둘러 상대에게 돌진한다. 자신의 공격력을 잠시동안 증가시킨다.");
		System.out.println();
		System.out.println();
		System.out.println();
//printN(16);
		System.out
				.println("===========================================================================================");
	}

}
