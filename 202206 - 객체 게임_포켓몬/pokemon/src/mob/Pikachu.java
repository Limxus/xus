package mob;

public class Pikachu extends Pokemon {

	Condition c = new Condition();

	public Pikachu(String name) {
		this.name = name;
		property = "전기";
		
		setStats();

		skillName1 = "백만볼트";
		sk01usedMp = 4;
		skillName2 = "아이언테일";
		sk02usedMp = 3;

	}

	public void setStats() {
		health = health+((lev-1)*10);
		ether = ether+((lev-1)*1);
		atk = atk+((lev-1)*3);
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
		System.out.println("   " + p.getName() + "의 실드가 부셔졌다");
		System.out
				.println("===========================================================================================");
		c.breakShield(p);
		setBattleAtk();
		setBattleDef();
		dmg = battleAtk * 1.5;
		shield = battleDef - 1;
		mp -= sk02usedMp;
	}

	public void img() {
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⡿⠛⢹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⡄⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀⠀⡿⠋⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣤⣤⣤⣤⡄⠀⠀⠀⠀⠀⠀⢀⠔⠈⠀⠰⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀⠸⠀⠀⠀⠀⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠤⠒⠒⠉⢠⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⣠⠖⠁⠀⠀⠀⠀⠇⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠄⠊⠉⠀⠀⠀⠀⢠⣿⣿⣿⣿⠿⠋⠀⠀⠀⠀⠀⣠⠚⠁⠀⠀⠀⠀⠀⠀⢸⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠘⠒⠀⠀⠀⠀⠐⠒⠢⠤⣠⠔⠉⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⠟⠋⠁⠀⠀⠀⠀⠀⡠⠎⠁⠀⠀⠀⠀⠀⠀⠀⠀⠈⡆");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀⡰⠂⠀⠀⠀⠀⠀⠀⢀⠠⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⠤⠔⠋⠁⠀⠀⠀⠀⠀⠀⠀⢠⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠃");
		System.out.println("                  ⠀⠀⠀⠀⠀⣠⡪⠄⠀⠀⠀⠀⠀⠀⠀⣿⣶⣿⡷⠀⠀⠀⠀⠀⠘⢖⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠔⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡸");
		System.out.println("                  ⠀⠀⠀⠀⠐⣿⣷⠇⠀⠠⠀⠀⠀⢀⠀⠉⠛⠉⢠⠤⠰⣤⡀⠀⠀⠈⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠔⠋⠀");
		System.out.println("                  ⠀⠀⠀⠀⣇⠉⠉⠠⠤⣤⣤⣤⣶⣿⠀⠀⠀⢠⣅⠀⣠⣿⡇⠀⠀⠀⠘⡀⠀⠀⠀⠀⠀⠀⠀⢠⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠔⠉⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⡆⢳⠀⠀⠀⠘⣿⣿⣿⣿⠀⠀⠀⠘⣿⣿⣿⣿⠇⠀⠀⠀⠀⢱⡀⠀⠀⠀⠀⠀⠀⠀⢣⠀⠀⠀⠀⠀⠀⠀⠀⡠⠔⠊⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⠸⣿⣇⠀⠀⠀⠙⣿⠛⢹⠀⠀⠀⠀⠈⠛⠛⠁⠀⠀⠀⠀⠀⠀⢣⠀⠀⠀⠀⠀⠀⠀⠀⢳⣴⣠⡇⣄⡠⠖⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠈⠣⣀⠀⠀⠀⠈⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⣀⠤⡖⣒⠀⠀⠀⢣⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⣀⠤⠤⠒⠓⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠦⣵⣭⣸⡆⠀⠀⠈⣧⡀⠀⠀⠀⠀⠀⣠⣶⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⡀⢖⣊⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⡘⠿⣿⠿⠃⠀⠀⠀⠈⠙⡄⠀⢀⣴⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⢜⢿⠗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢆⠈⠻⣿⣿⣿⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠈⠉⠐⠒⠠⠤⠤⠤⠄⣀⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⡀⠈⠻⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣷⣴⣾⣿⣿⡿⠗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⡋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⠷⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢡⡀⠀⠀⠀⠀⢀⣠⣴⣶⣶⣶⣶⣦⣤⣤⣤⣴⣶⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣶⣶⣿⣿⣿⣿⠟⠛⠉⠉⠙⠛⠿⢿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⢿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠹⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠿⡫⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠧⣹⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println();
	}

	public void info() {
		System.out.println("===========================================================================================");
		System.out.println();
		System.out.println();
		System.out.println("    ▶ 피카츄");
		System.out.println("    전기 속성 포켓몬");
		System.out.println();
		System.out.println("    붉은 뺨은 전기 주머니이다.\n"
				+ "    이 전기 주머니에 전기를 모아 자신을 위협하는 천적들을 물리친다.\n"
				+ "    약해진 동료 피카츄에게 전기를 흘려보내 힘을 나눠주거나 열매를 전기로 구워먹는 등 지혜를 갖추고 있다. ");
		System.out.println();
		System.out.println("    ▶ SKILL");
		System.out.println();
		System.out.println("    "+skillName1+" : 강한 전격을 상대에게 날려서 공격한다.");
		System.out.println();
		System.out.println("    "+skillName2+" : 단단한 꼬리로 상대를 힘껏 쳐서 공격한다. 상대의 실드를 파괴시킨다.");
		System.out.println();
		System.out.println();
//		printN(16);
		System.out.println("===========================================================================================");
	}

}
