package mob;

public class Bulkkochsung extends Pokemon {

	Condition c = new Condition();

	public Bulkkochsung(String name) {
		this.name = name;
		property = "불꽃";

		setStats();
		
		skillName1 = "도발";
		sk01usedMp = 3;
		skillName2 = "객기";
		sk02usedMp = 3;

	}

	public void setStats() {
		health = health+((lev-1)*10);
		ether = ether+((lev-1)*1)+5;
		atk = atk+((lev-1)*3);
		def = def+((lev-1)*0.1);
		hp = health;
		mp = ether;
		setBattleAtk();
		setBattleDef();
	}

	public void skill01(Pokemon p) {
		System.out.println("===========================================================================================");
		System.out.println("   " + name + "(가) " + skillName1 + "을 사용했다!");
		System.out.println("   " + p.getName() + "의 공격력이 떨어졌다!");
		System.out.println("===========================================================================================");
		c.downAtk(p, 6+(lev-1)*1, 2);
		setBattleAtk();
		setBattleDef();
		dmg = battleAtk;
		shield = battleDef - 1;
		mp -= sk01usedMp;
	}

	public void skill02(Pokemon p) {
		System.out.println("===========================================================================================");
		System.out.println("   " + name + "(가) " + skillName2 + "을 사용했다!");
		System.out.println("   " + name + "의 방어력이 증가했다!");
		System.out.println("===========================================================================================");
		c.upDef(this, 2, 1);
		setBattleAtk();
		setBattleDef();
		dmg = battleAtk;
		shield = battleDef;
		mp -= sk02usedMp;
	}
	
	public void img() {
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣿⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣴⣾⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣷⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣹⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡔⢒⡞⢿⣿⣿⣿⣿⣿⣿⠟⢡⣿⣿⡿⠛⠿⣿⣿⣿⣿⣿⣿⣿⡧⠤⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢘⣰⡼⠀⠘⠋⢿⣿⣿⠟⠁⠀⠚⠋⠁⠀⠀⠀⠈⠻⣿⣿⣿⡿⠋⢀⣀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣇⣤⡀⢀⠈⠻⠃⠀⠀⠀⢀⠄⢀⣴⣾⣶⣦⠀⠸⣿⡟⢀⣴⣿⣿⣆⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⡌⠀⠀⠀⠀⠀⠀⠈⢠⡿⠛⠻⢿⣿⡇⠀⡟⢀⣾⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⡏⢠⢳⠀⠀⠀⠀⠀⠀⠀⣸⠀⢀⡊⢹⣿⡇⠘⢀⣾⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣇⢸⣶⡆⠀⠀⠀⠀⠀⠀⠃⠀⢸⣿⣿⡿⠁⠀⢸⣿⣿⣿⣿⠟⠀⠀⠀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⡜⣿⡇⠀⠀⠀⠀⠀⠀⢰⠀⠸⣿⣿⠃⠀⡀⢘⣻⣿⠟⠁⠀⠀⡀⣠⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢘⠚⠓⠀⠀⠀⠀⠀⠀⠘⠒⠒⠛⠁⣀⡤⠛⠛⠉⠁⠀⠀⠀⣶⣿⣿⣟⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⠶⢦⡠⠀⠠⠀⠀⠀⣠⣾⣾⣿⣿⣶⣶⣶⣶⣶⣶⣶⣆⣹⣿⣿⠇⣀⡧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠒⠒⠓⢩⣿⣿⣿⣿⣿⣿⡛⠛⠛⣿⣿⣿⣿⡏⠁⣰⣾⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⢻⢛⡯⠙⣿⣿⣦⣸⣿⠏⢹⣿⣷⠉⠛⢻⣿⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⡿⠀⠸⡆⠀⢸⣿⣿⣿⣿⣿⣼⣿⣿⣿⣿⣷⡄⣃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⠇⠀⡆⠈⠒⠋⠙⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⡟⢀⣼⣇⠀⠀⠀⠀⠀⠈⢹⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⢃⣾⣿⣿⣦⣀⡀⠀⢀⣀⣸⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠞⠻⡟⢸⣿⣿⣿⣿⣿⠿⠛⠛⠛⠹⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠈⠀⠀⡈⠃⢛⠿⣿⣿⣧⡀⠀⠀⠀⠀⠹⢿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⢪⠊⡖⢰⢠⡖⡿⠶⣾⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠙⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⣁⡌⢠⠃⡸⠼⠄⠾⣀⣀⠝⠋⠁⠀⠀⠀⠀⡠⢐⠾⠛⣿⠿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠒⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠃⠼⠄⡀⢧⣀⠜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		}
	
	
	public void info() {
		System.out
		.println("===========================================================================================");
		System.out.println();
		System.out.println();
		System.out.println("    ▶ 불꽃숭이");
		System.out.println("    불 속성 포켓몬");
		System.out.println("	\r\n"
				+ "    엉덩이의 불꽃은 배에서 만들어진 가스가 연료이다.\r\n"
				+ "    비에 젖어도 꺼지지 않는다."
				+ "    몸 상태가 나쁘면 불꽃이 약해진다.");
		System.out.println();
		System.out.println("    ▶ SKILL");
		System.out.println();
		System.out.println("    " + skillName1 + " : 상대방을 화나게 한다. 상대의 공격력을 감소시킨다.");
		System.out.println();
		System.out.println("    " + skillName2 + " : 객기를 부린다. 잠시동안 방어력이 증가한다.");
		System.out.println();
		System.out.println();
		//printN(16);
		System.out
		.println("===========================================================================================");
}

}
