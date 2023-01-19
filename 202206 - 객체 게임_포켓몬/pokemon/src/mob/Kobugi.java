package mob;

public class Kobugi extends Pokemon {

	Condition c = new Condition();

	public Kobugi(String name) {
		this.name = name;
		property = "물";
		
		setStats();

		skillName1 = "물대포";
		sk01usedMp = 3;
		skillName2 = "껍질에 숨기";
		sk02usedMp = 2;

	}

	public void setStats() {
		health = health+((lev-1)*11);
		ether = ether+((lev-1)*1);
		atk = atk+((lev-1)*1.5)-3;
		def = def+((lev-1)*0.2)+1;
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
		dmg = battleAtk * 1.7;
		shield = battleDef;
		mp -= sk01usedMp;
	}

	public void skill02(Pokemon p) {
		System.out.println("===========================================================================================");
		System.out.println(" " + name + "(가) " + skillName2 + "을 사용했다!");
		System.out.println("===========================================================================================");
		setBattleAtk();
		setBattleDef();
		dmg = 0;
		shield = (battleDef + 4+(lev-1)*0.2);
		mp -= sk02usedMp;
	}
	
	public void img() {
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠔⠒⠋⠉⠉⠉⠉⠙⠒⠦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠴⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠑⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡅⠄⠀⠀⠀⠀⠀⠀⠀⠀⠐⢊⡠⢤⣀⠀⠀⠀⠈⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡎⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⡀⢀⣿⡆⠀⠀⠀⠀⠱⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⢳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⡿⠏⣿⡇⠀⠀⠀⠀⠀⢸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠚⠒⠾⠘⠁⠀⠀⠀⠀⠀⢸⠅⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣟⠲⣄⣀⣠⡴⠶⠲⠶⠶⠤⢤⣤⣤⣄⣀⣀⣀⣤⠆⠀⠀⠀⠀⡼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⣹⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⠤⠟⢲⢤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⣥⣀⣿⠀⠛⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⢀⣠⡤⠖⠋⠉⠀⠀⡴⠃⠀⠈⠉⠙⠒⠲⠶⠤⠶⠖⣲⠟⠉⠀⠀⠀⠈⠻⣶⣦⣘⢦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⣠⠔⠋⠁⠀⠀⠀⠀⢀⢮⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡞⠁⠀⠀⠀⠀⠀⠀⠀⠸⡆⠙⠿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⢺⡉⠉⢀⠄⠀⠀⠀⠀⠀⢠⠋⠀⠈⠒⠤⠤⣠⣀⡀⣀⠀⣀⡼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⠀⠀⠙⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⣠⠟⠀⠿⠤⠄⠀⠀⠀⢀⡞⠀⠀⠀⠀⠀⠀⠀⡸⠁⠉⠀⢹⠃⠀⣠⡀⠀⠀⠀⠀⠀⠀⣸⢹⡇⠀⠀⢹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀                    ⠧⠤⣄⣀⣀⣀⣀⣀⣀⣼⣧⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⠀⡿⠠⠊⠀⠷⠀⠀⠀⠀⢀⡴⠃⢸⠇⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠘⡄⠀⠀⠀⠀⠀⠀⡟⠀⢀⣞⡀⠀⠀⠀⠀⠈⠉⣹⣢⣾⠁⠀⣼⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢙⠀⢸⢤⣀⣀⡀⠀⠀⡇⠀⠀⠉⠉⠑⠲⢤⣤⠤⠖⠋⠀⡇⠀⠀⣿⡄⠀⠀⣰⡇⠀⠀⠀⠀⠀⢀⣀⣀⣀⡀⠀⠀⠀⠀");
		System.out.println("⠀                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣄⠏⠀⠀⠈⠉⠉⢺⡗⠒⠒⠖⠒⠒⠒⢾⡀⠀⠀⠀⠀⣷⠀⠀⣿⣿⣆⣴⣿⠀⠀⠀⡠⠒⠋⠉⠉⠀⠉⠉⠙⢦⡀⠀");
		System.out.println("⠀⠀                    ⠀⠀⠀⠀⠀⠀⠀⢀⡞⢻⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠙⣄⣀⡤⠤⠽⢆⡀⢹⣿⣿⣿⠏⠀⡰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⡄⠀");
		System.out.println("⠀⠀                    ⠀⠀⠀⠀⠀⠀⢠⠏⠀⠀⢳⡀⠀⠀⠀⠀⠈⡇⠀⠀⠀⠀⠀⠀⠀⡰⠋⠀⠀⠀⠀⠀⠈⢺⣿⣿⡟⢀⡜⠁⠀⠀⠀⠀⣀⣤⣤⣄⡀⠀⠀⠀⢹⠀");
		System.out.println("⠀                    ⠀⠀⠀⠀⠀⠀⢀⡇⠀⠀⠀⠀⠙⣄⠀⠀⠀⣀⣇⠀⠀⠀⠀⠀⠀⡼⠁⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⡵⠋⠀⠀⠀⠀⢀⡾⠁⠀⠀⠀⠑⠀⠀⠀⢸⠀");
		System.out.println("⠀                    ⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠈⠳⣞⠉⠀⠀⠙⠲⠦⣤⣀⣸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⡾⠀");
		System.out.println("⠀                    ⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠈⣹⠶⠤⣀⣀⣀⠀⣀⣹⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⠀⠀⠀⠀⠀⠀⠈⢷⡀⠀⠀⠀⠀⠀⠀⡼⠁⠀");
		System.out.println("⠀                    ⠀⠀⠀⠀⠀⣠⢞⠀⠀⠀⠀⠀⠀⠀⠀⣸⠁⠀⠀⠀⠀⠉⠉⠙⠓⠛⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣀⣀⠀⠀⠀⠀⠀⠀⠙⠲⢦⣤⣤⠴⠋⠀⠀⠀");
		System.out.println("⠀                    ⠀⠀⠀⠀⠈⢩⣏⣠⣤⠀⠀⣀⡤⠤⠖⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡄⠀⠀⠀⠀⠀⠀⠀⠀⡇⠈⠉⠉⠙⠓⠒⠒⠒⠒⠚⠉⠉⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀                    ⠀⠀⠀⠀⠀⠀⠀⠀⠺⠚⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⠀⠀⠀⠀⠀⠀⢇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠒⠛⠲⢄⣀⡴⠒⠒⠾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		}
	
	
	public void info() {
		System.out.println("===========================================================================================");
		System.out.println();
		System.out.println();
		System.out.println("    ▶ 꼬부기");
		System.out.println("    물 속성 포켓몬");
		System.out.println();
		System.out.println("    등껍질에 틀어박혀 몸을 지킨다.\n"
				+ "    상대의 틈을 놓치지 않고 물을 내뿜어 반격한다.\n"
				+ "    등껍질의 역할은 몸을 지키는 것 뿐 아니라 물의 저항을 줄여서 빠르게 헤엄칠 수 있다.");
		System.out.println();
		System.out.println("    ▶ SKILL");
		System.out.println();
		System.out.println("    "+skillName1+" : 물을 기세좋게 발사하여 공격한다..");
		System.out.println();
		System.out.println("    "+skillName2+" : 껍질에 숨어 몸을 보호하여 자신의 방어를 올린다. 실드량이 증가한다");
		System.out.println();
		System.out.println();
		//printN(16);
		System.out.println("===========================================================================================");
	}

}
