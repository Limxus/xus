package mob;

public class Ingaking extends Pokemon {

	Condition c = new Condition();

	public Ingaking(String name) {
		this.name = name;
		property = "물";
		
		setStats();

		skillName1 = "몸통박치기";
		sk01usedMp = 3;
		skillName2 = "튀어오르기";
		sk02usedMp = 2;

	}

	public void setStats() {
		health = health+((lev-1)*12)+10;
		ether = ether+((lev-1)*1);
		atk = atk+((lev-1)*2)-3;
		def = def+((lev-1)*0.2)+2;
		hp = health;
		mp = ether;
		setBattleAtk();
		setBattleDef();
	}

	public void skill01(Pokemon p) {
		System.out.println("===========================================================================================");
		System.out.println("   " + name + "(가) " + skillName1 + "을 사용했다!");
		System.out.println("===========================================================================================");
		setBattleAtk();
		setBattleDef();
		dmg = battleAtk * 1.6;
		shield = battleDef - 1;
		mp -= sk01usedMp;
	}

	public void skill02(Pokemon p) {
		System.out.println("===========================================================================================");
		System.out.println("   " + name + "(가) " + skillName2 + "을 사용했다!");
		System.out.println("   " + p.getName() + "의 공격력이 떨어졌다!");
		System.out.println("===========================================================================================");
		c.downAtk(p, 5+(lev-1)*1, 2);
		setBattleAtk();
		setBattleDef();
		dmg = 0;
		shield = battleDef - 1;
		mp -= sk02usedMp;
	}

	public void img() {
		System.out.println("                         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠢⡀⠀⠀⠀⠀⠔⠁⠀⠀⠀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠈⢄⠀⢠⠊⠀⠀⠀⠀⠀⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡆⠀⠀⠲⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⢃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠉⠉⠉⠉⢩⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠒⠚⢤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠔⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠤⠐⠒⠀⠈⠉⠁⠀⠈⢿⠉⠓⠒⢤⣄⡀⣀⣠⣴⠔⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀       ⠀⠀⠀⢀⠀⠂⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣆⣀⣀⡠⠃⠉⠻⢟⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⠀⠀⢀⠔⠁⠀⠀⠀⠀⡀⠄⠒⠂⢄⠀⠀⠀⠀⠀⢿⠈⠙⢦⡀⠀⠀⠀⠈⠢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⠀⣠⠎⠀⠀⠀⠀⢀⠎⠀⠀⣤⠀⠀⠱⡄⠀⠀⠀⢸⡆⠀⠀⢳⠄⠀⠀⠀⠀⠈⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⢆⠀⠉⠲⡀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠘⣇⣀⣰⠇⠀⠀⠀⠀⠀⠀⠘⡗⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠤⣤⣲⡶⡶⠖⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀       ⠘⣷⠀⢱⠀⠀⠈⢦⠀⠀⠀⠀⠀⡰⠁⠀⣀⡤⠴⠿⠿⠽⠶⠶⠶⠶⠖⠒⠒⢒⣷⣼⣆⠀⠀⠀⠀⢀⣤⣶⣿⠿⠚⠉⠁⠀⠀⠃⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⠀⠀⢿⡇⠘⡀⢀⡠⣄⠉⠒⠒⠒⠈⢀⡠⠞⡡⠒⠉⠉⠉⠉⠉⠉⠉⠉⠀⢈⠥⠛⣿⣿⣿⡄⢀⣤⣾⣿⠟⠋⠀⠀⠀⠀⠀⠀⠸⠀⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⠀⢀⣼⡇⠀⡇⠈⠢⣀⠑⢦⠀⠀⣰⢋⣴⠋⡀⠤⠀⠂⠀⠀⠀⠀⠀⣠⠖⠁⣠⣾⣿⣿⣿⣿⣿⣿⠛⠁⢀⠀⠠⠤⠄⠀⠀⠠⠆⠀⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⢀⣾⠫⠃⣰⠃⠀⠀⠈⢧⡈⣇⠀⠛⣿⣃⣁⣀⠀⠀⠀⠀⠀⠀⢀⠜⣁⣴⣾⣿⣿⣿⣿⣿⣿⡿⠓⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⢸⡟⠲⣶⣿⣿⣶⣦⣤⣤⣷⢸⣦⣀⣈⣑⣤⣀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⢀⠔⠁⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⢸⣇⠀⠈⢿⣿⣿⣿⣿⣿⣿⠀⣿⣿⣿⣿⣿⣿⣷⣦⣀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⡀⠀⠀⠀⠀⠀⠀⠠⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⠘⣿⡀⠀⠀⠙⠻⣿⣿⣿⣿⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣈⣿⣿⣿⣿⣿⣿⣿⠟⢿⣿⡇⠐⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⠀⠹⣷⠀⠀⠀⠀⠀⠉⠛⠿⡆⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠉⠀⠀⠸⣿⡇⠀⠀⢀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⠀⠀⠙⣧⠀⠀⠀⠀⠀⠀⠀⡇⢧⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⡀⠀⠀⠀⠀⠀⠀⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⠀⠀⠀⠘⣧⠀⠀⠀⠀⠀⠀⣡⠘⡎⠙⠛⠻⠿⠿⣿⡿⠟⠟⠳⡄⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣷⠀⠀⠀⠀⠑⡔⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⠀⠀⠀⠀⠹⣣⠀⠀⠀⠀⢠⣻⡄⢻⠰⠀⣀⠀⠀⠀⠀⠀⠀⠀⠈⠢⠀⠀⠀⠀⠀⠀⠀⠀⠈⢯⢣⡀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⠀⠀⠀⠀⠀⢏⡄⠀⠀⠀⠉⠀⠸⡄⢣⡜⠁⠱⡀⠀⠀⠠⠤⣀⡀⠀⠑⡀⠀⠀⠀⠀⠀⠀⠀⠀⠳⣱⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⠀⠀⠀⠀⠀⢸⠁⠀⠀⠀⠀⠀⠀⠘⡌⢂⠀⠀⠈⠢⡀⠆⠀⠀⠀⠉⠁⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀       ⠀⠀⠀⠀⡈⠆⠀⠀⠀⠀⠀⠀⠀⠈⢆⠑⢄⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                         ⠀⠀⠀⠀⠀⠀⠀⠠⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⠀⡑⠠⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠒⠠⠑⠂⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		}
	
	
	public void info() {
		System.out.println("===========================================================================================");
		System.out.println();
		System.out.println();
		System.out.println("    ▶ 잉어킹");
		System.out.println("    물 속성 포켓몬");
		System.out.println();
		System.out.println("    튀어 오르기만 하는 한심한 포켓몬이다.\n"
				+ "    왜 튀어 오르는지 조사한 연구자가 있을 정도로 무조건 튀어 오르기만 한다.\n"
				+ "    오래 산 잉어킹은 튀어오르기로 산도 넘을 수 있지만 기술의 위력은 여전히 약하다.");
		System.out.println();
		System.out.println("    ▶ SKILL");
		System.out.println();
		System.out.println("    "+skillName1+" : 상대를 향해서 몸 전체를 부딪쳐가며 공격한다.");
		System.out.println();
		System.out.println("    "+skillName2+" : 공격도 하지않고 팔딱팔딱 튈 뿐이다. 상대방의 공격력을 감소시킨다.");
		System.out.println();
		System.out.println();
		//printN(16);
		System.out.println("===========================================================================================");
	}
}
