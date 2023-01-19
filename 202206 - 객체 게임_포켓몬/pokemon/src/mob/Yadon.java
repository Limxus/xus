package mob;

public class Yadon extends Pokemon {

	Condition c = new Condition();

	public Yadon(String name) {
		this.name = name;
		property = "물";
		
		setStats();
		
		skillName1 = "잠자기";
		sk01usedMp = 5;
		skillName2 = "파도타기";
		sk02usedMp = 4;

	}

	public void setStats() {
		health = health+((lev-1)*10);
		ether = ether+((lev-1)*1)+3;
		atk = atk+((lev-1)*2.5);
		def = def+((lev-1)*0.2)+1;
		hp = health;
		mp = ether;
		setBattleAtk();
		setBattleDef();
	}

	public void skill01(Pokemon p) {
		System.out.println("===========================================================================================");
		System.out.println("   " + name + "(가) " + skillName1 + "을 사용했다!");
		System.out.println("   " + name + "의 체력이 회복되었다!");
		System.out.println("===========================================================================================");
		c.heal(this, 40+(lev-1)*5);
		c.clearDeburf(this);
		setBattleAtk();
		setBattleDef();
		dmg = 0;
		shield = battleDef - 1;
		mp -= sk01usedMp;
	}

	public void skill02(Pokemon p) {
		System.out.println("===========================================================================================");
		System.out.println("   " + name + "(가) " + skillName2 + "을 사용했다!");
		System.out.println("===========================================================================================");
		setBattleAtk();
		setBattleDef();
		dmg = battleAtk*1.7;
		shield = battleDef - 1;
		mp -= sk02usedMp;
	}
	
	public void img() {
		System.out.println();
		System.out.println("                      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠔⠒⠉⠉⠉⠀⠀⠀⠀⠀⠈⠉⠉⠙⠒⠶⠤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡖⠁⣀⣀⣀⣠⣤⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠒⠊⠉⠀⠀⠀⠀⠀⠀⠀⠉⠙⠒⠦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠈⠓⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢆⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                 ⠀⠀⠀⠀     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠣⡀⠀⠀⠀⠀⠀⠀⠀⠈⢳⡀⠀⠀⠀⠀⠀");
		System.out.println("                 ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢧⠀⠀⠀⠀⠀⠀⠀⠀⢱⡀⠀⠀⠀⠀");
		System.out.println("                 ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢧⠀⠀⠀⠀⠀⠀⠀⠀⣧⠀⠀⠀⠀");
		System.out.println("                      ⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⢀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡆⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀");
		System.out.println("                      ⠀⠀⠀⠀⢠⠞⠁⠀⠀⠀⢙⣦⠤⠶⠒⠒⠒⠲⠤⢤⣀⡞⠁⠀⠀⠀⠙⢦⣀⣠⡤⠤⠤⠤⠤⠤⢤⣄⣀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀");
		System.out.println("                      ⠀⠀⠀⠀⡏⠀⠀⠀⠀⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⢠⠞⠓⠄⠀⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠲⢤⣄⡏⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀");
		System.out.println("                 ⠀⠀     ⠀⠀⠹⣄⡴⢧⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⠤⢄⣀⠀⠀⢻⡀⠀⠀⢀⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⢦⣀⠀⠀⠀⠀⠀⢠⡇⠀⠀⠀");
		System.out.println("                      ⠀⠀⠀⠀⢀⡏⠄⠸⠀⠀⠀⠀⠀⠀⠀⢰⠋⠀⠀⠀⠈⠳⡀⠀⠉⠓⠲⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⡄⠀⠀⠀⢸⠃⠀⠀⠀");
		System.out.println("                      ⠀⠀⠀⠀⡞⢀⡀⠞⠒⠒⠒⠒⠒⠦⣄⣎⠀⠀⠈⠀⠀⠀⡧⠀⠀⠀⠀⠹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢧⠀⠀⡿⠀⠀⠀⠀");
		System.out.println("                      ⠀⠀⠀⣠⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠓⠢⢄⠀⠀⡰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣧⣸⠃⠀⠀⠀⠀");
		System.out.println("                      ⠀⠀⡸⠁⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠳⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡇⠀⠀⠀⠀⠀");
		System.out.println("                      ⠀⠀⠸⣄⣀⣀⣤⣤⣈⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⢳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⠀⠀⠀⠀⠀");
		System.out.println("                      ⠀⢀⡤⠊⠉⠛⣼⣿⣿⠉⠉⠛⠛⠲⣖⡶⠶⠶⠚⠛⡿⠀⠀⡼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡄⠀⠀⠀⠀");
		System.out.println("                      ⣰⠋⠀⠀⠀⠀⣇⢿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⠁⢀⣜⣥⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡁⠀⠀⠀⠀");
		System.out.println("                      ⡇⠀⠀⠀⠀⠀⠘⣎⡙⠷⣤⣀⣀⣀⣀⣀⠴⣊⠥⠒⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡼⠉⠓⢤⡀⠀");
		System.out.println("                      ⢳⠀⠀⠀⠀⠀⠀⠀⠉⠓⠒⣦⠤⠀⢀⡤⠚⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣦");
		System.out.println("                      ⠀⠙⢦⣀⠀⠀⠀⡴⠒⠛⠓⡿⠀⢀⡾⠤⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⢀⣤⠞⠚");
		System.out.println("                      ⠀⠀⠀⠈⠉⠓⠒⠛⠒⠒⠚⠁⠰⣇⣀⣤⣼⣀⡀⠀⠀⠀⠀⠀⢀⣀⣀⣀⣤⡤⠴⠶⠖⠒⠒⠲⠶⠤⠤⠤⠤⠤⠤⠶⠖⠛⠉⠉⠙⠛⠛⠛⠉⠀⠀⠀");
		System.out.println("                 ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠋⠛⠋⠋⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("");
		System.out.println("");
		}
	
	
	public void info() {
		System.out.println("===========================================================================================");
		System.out.println();
		System.out.println();
		System.out.println("    ▶ 야돈");
		System.out.println("    물 속성 포켓몬");
		System.out.println();
		System.out.println("    항상 멍하니 있으므로 무슨 생각을 하고 있는지 알 수 없다.\n"
				+ "    꼬리로 먹이를 낚는것이 특기다.\n"
				+ "    너무 둔해서 꼬리에 먹잇감이 물려도 알아차리지 못한다. ");
		System.out.println();
		System.out.println("    ▶ SKILL");
		System.out.println();
		System.out.println("    "+skillName1+" : 게으름 피우며 잠든다. 자신의 HP를 회복한다.");
		System.out.println();
		System.out.println("    "+skillName2+" : 큰 파도로 적을 공격한다.");
		System.out.println();
		System.out.println();
//		printN(16);
		System.out.println("===========================================================================================");
	}

}
