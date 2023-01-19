package mob;

public class Pairi extends Pokemon {

	Condition c = new Condition();

	public Pairi(String name) {
		this.name = name;
		property = "불꽃";
		
		setStats();

		skillName1 = "화염불꽃";
		sk01usedMp = 3;
		skillName2 = "마구할퀴기";
		sk02usedMp = 2;

	}

	public void setStats() {
		health = health+((lev-1)*9)-10;
		ether = ether+((lev-1)*1);
		atk = atk+((lev-1)*4)+4;
		def = def+((lev-1)*0.1);
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
		dmg = battleAtk * 2;
		shield = battleDef - 2;
		mp -= sk01usedMp;
	}

	public void skill02(Pokemon p) {
		System.out.println("===========================================================================================");
		System.out.println("   " + name + "(가) " + skillName2 + "을 사용했다!");
		System.out.println("===========================================================================================");
		setBattleAtk();
		setBattleDef();
		dmg = battleAtk * 1.7;
		shield = battleDef - 2;
		mp -= sk02usedMp;
	}
	
	public void img() {
		System.out.println("                       ⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠖⠒⠉⠉⠉⠉⠓⠲⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠚⠁⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠙⢦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠀⠀⠀⢀⡜⠁⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠈⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠀⠀⠀⣎⠀⢀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⢰⠀⠰⢶⣦⠈⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠀⠀⠀⡿⢧⠐⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⡇⢸⣿⣇⠘⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀      ⠀⠀⠀⠀⠀⢸⣷⣸⡄⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⣿⣾⣿⣿⡄⣣⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⡇⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⣿⡿⣿⣿⠄⢸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠀⠀⡜⠙⠿⠃⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠙⠛⠉⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠀⢰⠁⣄⠀⠀⠀⢀⠀⠀⠀ ⠀⡀⠀⠀⠀⠀⠀⣀⣠⡜⠀⢸⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⢠⢧⡄⠀⠀⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠀⠀⢣⡈⠹⣶⣦⣤⣀⣀⣀⣀⣤⣤⣴⣶⣾⣿⣧⡟⠀⢀⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⢸⠀⢻⡀⠀⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠀⠀⠀⠈⠢⣄⠙⠻⣿⣿⣿⠟⠛⠉⠉⠉⢉⡿⠋⠀⠀⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣄⢱⡇⠀⢸⡇⠀⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠒⠤⣭⣓⠶⢤⡤⠤⠖⠋⠀⠀⠀⢸⣅⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢨⠁⠀⠁⠀⠀⢧⡀⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠖⠋⠉⠀⢈⡽⠿⣄⠀⠀⠀⠀⠀⠀⠈⠙⠒⠤⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⢀⡀⠀⠙⡆⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⢀⣀⣀⣠⠤⠖⠋⠀⠀⠀⢸⢇⠔⠁⠀⠀⠀⠙⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠲⠤⠐⣲⡂⠀⠀⠀⠀⢀⠌⠀⠀⠀⠾⠇⠀⡰⡁⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⢴⡚⠋⠀⠀⠀⠀⠀⠀⠀⠀⣿⡏⠀⠀⠀⠀⠀⠀⠈⠳⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠉⣵⠋⠀⠀⢠⠁⠀⠀⠀⠀⠀⠀⠀⠏⠳⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠈⢢⠀⠀⠀⠀⠀⠀⠀⢀⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣄⢠⣀⣀⠀⠀⠀⠀⠀⣲⣿⡦⠶⠚⠀⠀⠀⠈⠣⣀⠀⠀⠀⠀⠀⠀⢠⠃⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠘⠚⠛⠛⠛⠛⠛⠉⢹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣆⠀⠉⠙⢟⠛⠛⠉⠉⠁⠀⠀⠀⠀⠀⠀ ⠀⠀⠸⡄⠀⠀⠀⠀⢀⡇⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡄⠀⠀⠈⢣⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠈⠁⡖⢲⠊⠉⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⠀⠀⠀⠀⠳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⡼⠁⢸⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⢼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢨⡄⠀⠀⠀⠀⠙⣄⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⢀⡼⠁⢀⡏⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠁⠈⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡘⠁⠀⠀⠀⠀⠀⠘⣆⠀  ⠀⠀⠀⢀⣠⠴⠋⠀⣠⡾⠁⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⠁⠀⠀⠀⠹⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠁⠀⠀⠀⠀⠀⠀⠀⠘⣷⠒⠒⠒⠛⠉⠀⠀⢀⣴⡽⠁⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠀⠀⠀⢸⠁⠀⠀⠀⠀⠀⠙⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡀⠀⠀⠀⠀⣀⡴⣫⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀      ⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠈⠓⢤⣀⡀⠀⠀⠀⠀⠘⣆⠀⠀⠀⠀⠀⠀⠀⠀⢸⣇⣀⣠⠴⢚⡡⠖⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠀⠀⠀⠘⣦⡀⠀⠀⠀⠀⠀⠀⣠⠤⠶⠒⠛⠛⠓⠒⠂⠤⠾⢦⡀⠀⠀⠀⠀⠀⠀⢸⣏⠤⠖⠚⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠀⢀⠔⡮⢭⣓⡀⠀⠀⠀⢀⣀⡽⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⡄⠀⠀⠀⠀⠀⠘⢇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠐⢯⣞⣁⣴⣃⠸⠖⠚⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣄⠀⣠⣄⣠⠶⣾⣑⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                        ⠀⠀⠀⠀⠀⠀⠀⠉⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠉⠛⠳⢬⣻⡖⠦⠽⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
	}
	
	
	public void info() {
		System.out.println("===========================================================================================");
		System.out.println();
		System.out.println();
		System.out.println("    ▶ 파이리");
		System.out.println("    불꽃 속성 포켓몬");
		System.out.println();
		System.out.println("    뜨거운 것을 좋아하는 성격이다.\n"
				+ "    꼬리에 있는 불꽃은 생명을 나타내는 표시이다.\n"
				+ "    꼬리가 물이 적게 닿으면 아무일 없지만 비에 젖으면 불꽃대신 연기만 난다.");
		System.out.println();
		System.out.println("    ▶ SKILL");
		System.out.println();
		System.out.println("    "+skillName1+" : 세찬 불꽃을 상대에게 발사하여 공격한다.");
		System.out.println();
		System.out.println("    "+skillName2+" : 발톱으로 상대를 할퀴어서 공격한다.");
		System.out.println();
		System.out.println();
		//printN(16);
		System.out.println("===========================================================================================");
	}

}
