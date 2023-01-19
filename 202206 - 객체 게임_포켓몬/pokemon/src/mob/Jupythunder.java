package mob;

public class Jupythunder extends Pokemon {

	Condition c = new Condition();

	public Jupythunder(String name) {
		this.name = name;
		property = "전기";
		
		setStats();

		skillName1 = "전기쇼크";
		sk01usedMp = 3;
		skillName2 = "바늘미사일";
		sk02usedMp = 2;

	}

	public void setStats() {
		health = health+((lev-1)*12)+10;
		ether = ether+((lev-1)*1)+2;
		atk = atk+((lev-1)*3)+3;
		def = def+((lev-1)*0.1)-1;
		hp = health;
		mp = ether;
		setBattleAtk();
		setBattleDef();
	}

	public void skill01(Pokemon p) {
		System.out.println("===========================================================================================");
		System.out.println("   " + name + "(가) " + skillName1 + "을 사용했다!");
		System.out.println("   " + name + "의 공격력이 올라갔다!");
		System.out.println("===========================================================================================");
		c.upAtk(this, 4+(lev-1)*1, 1);
		setBattleAtk();
		setBattleDef();
		dmg = battleAtk * 1.5;
		shield = battleDef - 1;
		mp -= sk01usedMp;
	}

	public void skill02(Pokemon p) {
		System.out.println("===========================================================================================");
		System.out.println("   " + name + "(가) " + skillName2 + "을 사용했다!");
		System.out.println("   " + p.getName() + "의 실드가 부셔졌다");
		System.out.println("===========================================================================================");
		c.breakShield(p);
		setBattleAtk();
		setBattleDef();
		dmg = battleAtk * 1.5;
		shield = battleDef;
		mp -= sk02usedMp;
	}
	
	public void img() {
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠒⠊⡽⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("               ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⣀⠴⠚⠉⠀⠀⢀⡞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("               ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⠀⢀⡤⠖⠋⠁⠀⠀⠀⠀⣰⣋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("               ⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⠀⠀⠀⠀⠀⢀⠼⠋⠀⠀⠀⠀⠀⠀⠀⢐⡽⢃⣀⡤⠤⠴⣒⣒⣚⡉⠉⡩⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("               ⠀⠀     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠃⣀⣤⠄⠀⠀⢀⡠⠤⠒⣚⣩⣤⣴⣶⣾⣿⣿⡿⠋⣠⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⡥⠎⢡⣯⠄⣠⠔⣉⣴⣾⣿⣿⣿⣿⣿⣿⣿⡿⠉⣠⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⡠⠤⠠⠞⠁⠀⠀⠀⣻⠏⣡⣾⣿⣿⣿⣿⣿⣿⣿⣿⠟⠉⠀⠺⣄⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⢠⠎⠀⠀⠀⠀⠀⠀⠀⠈⠁⢚⣩⣿⡿⠿⠛⠛⠛⣉⣉⠤⠴⠐⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⡀⠤⠋⠀⠀⢀⠤⣴⣶⣤⠀⠀⠀⠀⠠⠤⢤⡴⠿⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⡾⠦⠀⠀⠀⠐⠿⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⢽⣂⡤⢶⣀⠤⠤⠖⠒⠒⠋⡩⠝⠁⠀⠀⠀⡠⡶⠀⠀⠀⠀⠀⠀⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠘⢦⢄⡀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⢶⡤⠽⠆⠁⠀⠀⠀⢀⣠⣖⡉⠀⠀⢠⣶⡤⠊⡱⠁⠀⠀⢀⣠⠴⠪⠽⢓⠟⠁⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠣⣌⠓⠒⠒⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣐⣷⣄⠀⠀⠀⠀⠈⠉⠴⠮⣅⣀⡔⠁⠃⠀⣰⠃⣀⠤⠒⠁⠀⠀⣀⠔⠁⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠈⠑⢢⣤⣀⡀⠀⢀⡀⣀⡈⢏⠁⠀⠀⠀⠀⠀⠀⠀⡀⠀⢀⣀⣀⣀⣀⠨⠭⠐⠆⠟⠉⠀⠀⠀⠀⢀⠜⠁⠀⠀⠀⠀⢀⣀⡀⠀⠀");
		System.out.println("               ⠀⠀⠀⠀⠀⠀     ⣠⣖⣉⣠⠜⣦⠣⣜⡍⠁⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⢬⠕⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠤⠒⠓⠒⠈⠉⠉⠉⣉⠭⠊⠁⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⢀⡟⠁⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⣀⣱⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠤⠒⠉⠁⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⠟⡺⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠠⡀⠀⠀⠑⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠻⠤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⠀⢰⠃⠀⣴⡇⠀⠀⠀⡀⠀⠀⠀⠀⢀⡡⠀⠑⠢⣄⠈⢦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢤⠄⠤⠬⠭⠖⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("                    ⠀⠀⠀⠀⠀⠀⠀⢠⠃⢠⠎⢹⠹⡀⠀⠀⡞⢆⡗⠦⡀⠀⢹⠃⠀⠀⠀⠉⠒⠷⠈⠁⠢⣤⣤⡤⣀⣀⠀⠀⠀⠀⠀⠈⠓⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀               ⠀⠀⠀     ⢀⣇⠔⠁⠀⢸⠀⣇⠀⠸⠀⠀⠃⠀⠘⠦⡀⣇⠀⠀⠀⠀⠀⣀⣀⣀⠀⠀⠀⠀⠀⠈⠑⠒⠦⢤⣀⠀⢈⣳⡛⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("     ⠀⠀               ⠀⠀⠀⠀⠈⠁⠀⠀⠀⠈⡇⢸⡀⣸⠀⠀⠀⠀⠀⢠⣈⣺⣀⡤⠴⠒⠉⠁⠹⡀⠱⣄⠀⠀⠀⠀⠀⠀⠀⠀⡇⠉⠒⠪⠦⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⠀⢣⢿⡀⠀⠀⠀⢀⡎⠉⠀⠀⠀⠀⠀⠀⠀⠀⢱⡀⠈⣆⠀⠀⠀⠀⠀⠀⠀⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡇⠀⠘⡇⠀⠀⠀⡸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⠈⢧⣀⠀⠀⠀⠀⠀⠸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀                        ⠀⠀⠀⠀⠀⠀⣇⠀⠀⡇⠀⠀⢀⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠃⠀⠀⣠⠟⠓⠦⣀⠀⠀⠀⠙⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀               ⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⡟⠀⢰⠃⠀⠀⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡼⠁⠀⢀⡼⠁⠀⠀⠀⠈⠑⡄⠀⠀⠘⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⣸⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⡶⢛⠉⠀⢀⡴⠋⠀⠀⠀⠀⠀⠀⡼⠁⠀⠀⡼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡸⠁⢠⠃⠀⠀⢰⠃⠀⠀⠀⠀⠀⠀⠀⠓⠷⠖⠒⠋⠀⠀⠀⠀⠀⠀⢀⡼⠁⠀⢀⡜⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⡀⢠⠎⠀⠀⠀⡼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡎⢁⠀⠀⢠⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀               ⠀⠀     ⠀⠀⠀⠀⠀⠀⠀⠈⠙⠻⣄⣄⡠⠜⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⠽⠔⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		}
	
	
	public void info() {
		System.out.println("===========================================================================================");
		System.out.println();
		System.out.println();
		System.out.println("    ▶ 쥬피썬더");
		System.out.println("    전기 속성 포켓몬");
		System.out.println();
		System.out.println("    세포에서 나오는 약한 전기를 털의 정전기로 증폭시킨다.\n"
				+ "    곤두세운 털은 전기를 띤 바늘이다.\n"
				+ "    온몽의 털 사이에는 수많은 마이너스 이온이 발생하고 있어서 항상 찌릿찌릿 소리가 난다.");
		System.out.println();
		System.out.println("    ▶ SKILL");
		System.out.println();
		System.out.println("    "+skillName1+" : 전기 자극을 상대에게 날려서 공격한다. 자신의 공격력을 증가시킨다.");
		System.out.println();
		System.out.println("    "+skillName2+" : 날카로운 침을 상대에게 날려 공격한다. 상대의 실드를 파괴시킨다.");
		System.out.println();
		System.out.println();
		//printN(16);
		System.out.println("===========================================================================================");
	}

}
