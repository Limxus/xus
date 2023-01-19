package game;

import java.util.Scanner;

import mob.Pokemon;

public class GameMsg {

	Scanner sc = new Scanner(System.in);

	public int startMsg() {
		System.out.println("===========================================================================================");
		printN(6);
		System.out.println("                    █████  █████  ██ ██▀ █████  ███▄███  █████  ██  ██");
		System.out.println("                    ██▄██  ██ ██  ███▀▀  ██▄▄▄  ██▀█▀██  ██ ██  ███▄██");
		System.out.println("                    ██▀▀▀  ██ ██  ████▄  ██▀▀▀  ██ ▀ ██  ██ ██  ██▀███");
		System.out.println("                    ██     █████  ██ ██▄ █████  ██   ██  █████  ██  ██");
		System.out.println();
		System.out.println("                                    G A M E S T A R T                  ");
		printN(4);
		System.out.println("                                  === 화면을 맞추어주세요 ===                  ");
		System.out.println();
		System.out.println();
		System.out.println("                                  START >>> 1번을 눌러주세요.                  ");
		printN(7);
		System.out.println("===========================================================================================");
		System.out.print(">>>>>");
		int n = sc.nextInt();
		printN(30);
		return n;
	}

	public void printStory() throws InterruptedException {
		printN(30);
		Thread.sleep(1000);
		System.out.println("===========================================================================================");
		System.out.println("    ...");
		System.out.println("===========================================================================================");
		Thread.sleep(1000);
		System.out.println("===========================================================================================");
		System.out.println("    ...");
		System.out.println("===========================================================================================");
		Thread.sleep(1000);
		System.out.println("===========================================================================================");
		System.out.println("    세계 최고의 포켓몬 트레이너가 되기 위해 여행을 떠난지 벌써 1년...");
		System.out.println("===========================================================================================");
		Thread.sleep(1000);
		System.out.println("===========================================================================================");
		System.out.println("    나의 친구들과 함께 지금까지 노력을 게을리 하지않았어.");
		System.out.println("===========================================================================================");
		Thread.sleep(1000);
		System.out.println("===========================================================================================");
		System.out.println("    지금까지의 성과를 확인하기 위해 가까운 KH체육관에 도전해서 이기고 싶어.");
		System.out.println("===========================================================================================");
		Thread.sleep(1000);
		System.out.println("===========================================================================================");
		System.out.println("    그래서 나는....");
		System.out.println("===========================================================================================");
		Thread.sleep(1000);
		System.out.println();
		System.out.println("===========================================================================================");
		System.out.println();
		System.out.println();
	}
	
	public void winnerMsg() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("===========================================================================================");
		System.out.println("    KH체육관 트레이너 : 크윽... ");
		System.out.println("===========================================================================================");
		Thread.sleep(1000);
		System.out.println("===========================================================================================");
		System.out.println("    KH체육관 트레이너 : 너의 포켓몬들 아주 훌륭하구나");
		System.out.println("===========================================================================================");
		Thread.sleep(2000);
	}
	
	public void loserMsg() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("===========================================================================================");
		System.out.println("    KH체육관 트레이너 : 아직 많이 부족하구나 ");
		System.out.println("===========================================================================================");
		Thread.sleep(1000);
		System.out.println("===========================================================================================");
		System.out.println("    KH체육관 트레이너 : 조금 더 강해져서 돌아오거라");
		System.out.println("===========================================================================================");
		Thread.sleep(2000);
	}
	
	public int choiceTry() {
		System.out.println("===========================================================================================");
		System.out.println();
		System.out.println();
		System.out.println("        1. 체육관에 도전한다              2. 경험을 쌓는다                 3. 포켓몬 센터에 간다");
		System.out.println();
		System.out.println();
		System.out.println("===========================================================================================");
		System.out.print(">>>");
		return sc.nextInt();
	}
	
	// 55
	public int choiceMob(Pokemon[] p, int[] random, int i) {
		System.out.println("===========================================================================================");
		System.out.println("    원하는 포켓몬을 선택하세요.");
		System.out.println();
		System.out.println();
		System.out.println("           ▄▄██████▄▄                   ▄▄██████▄▄                   ▄▄██████▄▄    ");
		System.out.println("         ▄█████████▀██▄               ▄█████████▀██▄               ▄█████████▀██▄  ");
		System.out.println("        ▄█████▀▀▀▀▀▀ ▀█▄             ▄█████▀▀▀▀▀▀ ▀█▄             ▄█████▀▀▀▀▀▀ ▀█▄ ");
		System.out.println("        ███████▀▀█▄▄▄▄██             ███████▀▀█▄▄▄▄██             ███████▀▀█▄▄▄▄██ ");
		System.out.println("        █▀▀▀▀▀█▄▄█▀▀▀▀▀█             █▀▀▀▀▀█▄▄█▀▀▀▀▀█             █▀▀▀▀▀█▄▄█▀▀▀▀▀█ ");
		System.out.println("        ▀█            █▀             ▀█            █▀             ▀█            █▀ ");
		System.out.println("         ▀█▄        ▄█▀               ▀█▄        ▄█▀               ▀█▄        ▄█▀  ");
		System.out.println("           ▀▀█▄▄▄▄█▀▀                   ▀▀█▄▄▄▄█▀▀                   ▀▀█▄▄▄▄█▀▀    ");
		System.out.println();
		System.out.println();
		System.out.print("    ");
		listUpPokemon(p, random, i);
		System.out.println();
		System.out.println();
		System.out.println("===========================================================================================");
		System.out.print(">>>");
		int n = sc.nextInt();
		return n;
	}
	
	public void startMsg2() {
		System.out.println("===========================================================================================");
		System.out.println("");
		System.out.println("");
		System.out.println("    흐음!!");
		System.out.println("    잘 왔다!");
		System.out.println("    포켓몬스터의 세계에 온 것을 환영한다!");
		System.out.println("    내 이름은 오박사!  모두가 포켓몬 박사님이라 부르고 있단다.");
		System.out.println("");
		System.out.println("    자네의 모험에 함께할 친구를 선택하도록 해라.");
		System.out.println("");
		System.out.println("");
		System.out.println("===========================================================================================");
	}
	
	public void hpMPBar(Pokemon p) {
		int a = (int) (p.getHp()*30/p.getHealth());//100*(3/100*10)
		int b = p.getMp()*30/p.getEther();
		System.out.println("===========================================================================================");
		System.out.print("      HP ");
		printBar(a);
		System.out.print("    |      MP ");
		printBar(b);
		System.out.println();
		System.out.println("===========================================================================================");
	}

	private void printBar(int a) {
		for(int i = 0;i<a;i++) {
			System.out.print("█");
		}
		for(int i = 0;i<(30-a);i++) {
			System.out.print("▒");
		}
	}

	public void mobInfo(Pokemon p) {
		System.out.println("===========================================================================================");
		System.out.println();
		System.out.println("    " + String.format("%-15s", "level : "+p.getLev()) +String.format("%-45s", p.getName())
							+printBurf(p)+ p.getProperty() + " 포켓몬");
		System.out.println("                                                      ");
		System.out.println("    HP  : " + String.format("%-10.0f", p.getHp()) + "|       MP  : "
				+ String.format("%-10s", p.getMp()) + "|       ATK  : " + String.format("%-10.0f", p.getBattleAtk())
				+ "|       DEF  : " + String.format("%-10.0f", p.getBattleDef()));
		System.out.println("                                                      ");
		System.out.println("===========================================================================================");
	}
	
	public String printBurf(Pokemon p) {
		int b = p.getBurf();
		int db = p.getDeburf();
		String bs = "";
		String dbs = "";
		if(b!=0) {
			bs = "▲ "+b;
		}
		if(db!=0) {
			dbs = "▼ "+db;
		}
		return String.format("%-5s", bs)+String.format("%-5s", dbs);
	}

	public int twoChoiceMsg() {
		System.out.println("===========================================================================================");
		System.out.println("    선택하시겠습니까?");
		System.out.println("                    1. YES                                    2.NO");
		System.out.println("===========================================================================================");
		System.out.print(">>>>>");
		int n = sc.nextInt();
		printN(30);
		return n;
	}

	public int skillChoiceMsg(Pokemon p) {
		System.out.println("===========================================================================================");
		System.out.println("      1. " + p.getSkillName1() + "             2. " + p.getSkillName2());
		System.out.println("===========================================================================================");
		System.out.print(">>>");
		return sc.nextInt();
	}

	public int actionChoiceMsg() {
		System.out.println("===========================================================================================");
		System.out.println("            1. 공격한다                 2. 방어한다                  3. 스킬");
		System.out.println("===========================================================================================");
		System.out.print(">>>");
		int n = sc.nextInt();
		printN(30);
		return n;
	}

	public void Summon(String name, Pokemon p) {
		System.out.println("===========================================================================================");
		System.out.println("  " + name + "(가) " + p.getName() + "를 꺼내려 하고있다.");
		System.out.println();
		System.out.println("===========================================================================================");
	}
	
	public void Summon(Pokemon p) {
		System.out.println("===========================================================================================");
		System.out.println("     나와라! " + p.getName() + "!!!");
		System.out.println("===========================================================================================");
	}
	
	public void SummonField(Pokemon p) {
		System.out.println("===========================================================================================");
		System.out.println("     야생의 " + p.getName() + "가 나타났다!!!");
		System.out.println("===========================================================================================");
	}

	public int userSummon(Pokemon[] p) {
		System.out.println("===========================================================================================");
		System.out.println("    나는");
		System.out.print("    ");
		listUpUserP(p);
		System.out.println();
		System.out.println("                                                                              를 소환한다.");
		System.out.println("===========================================================================================");
		System.out.print(">>>");
		int n = sc.nextInt();
//		printN(30);
		return n;
	}

	public void winnerMsg(Pokemon a, Pokemon b) {
		System.out.println("===========================================================================================");
		System.out.println("  " + a.getName() + "(가) " + b.getName() + "상대로 승리했다.");
		System.out.println("===========================================================================================");
	}

	public void printMsg(String s, double d) {
		System.out.println("===========================================================================================");
		System.out.println("  " + s + " -> " + String.format("%.0f", d));
		System.out.println("===========================================================================================");
	}

	public void printMsg(String s, String string) {
		System.out.println("===========================================================================================");
		System.out.println("  " + s + " -> " + string);
		System.out.println("===========================================================================================");
	}

	public void dieMsg(Pokemon p) {
		System.out.println("===========================================================================================");
		System.out.println("  " + p.getName() + "는 치명적인 상처를 받았다.");
		System.out.println("===========================================================================================");
	}

	private void listUpPokemon(Pokemon[] p, int[] random, int i) {
		System.out.print("       1. " + String.format("%-18s", p[random[0 + (i * 3)]].getName()));
		System.out.print("       2. " + String.format("%-18s", p[random[1 + (i * 3)]].getName()));
		System.out.print("       3. " + String.format("%-17s", p[random[2 + (i * 3)]].getName()));
	}

	private void listUpUserP(Pokemon[] p) {
		System.out.print("       1. " + String.format("%-18s", p[0].getName()));
		System.out.print("       2. " + String.format("%-18s", p[1].getName()));
		System.out.print("       3. " + String.format("%-17s", p[2].getName()));
	}
	
	public void printN(int n) {
		for(int i = 0; i<n;i++){
			System.out.println();
		}
	}
}
