package main;

import java.util.Random;

import game.*;
import mob.*;

public class Main {

	public static void main(String[] args) throws InterruptedException  {

		Random r = new Random();
		GameManager gm = new GameManager();
		GameMsg msg = new GameMsg();
		ActionManager am = new ActionManager();
		Ui ui = new Ui();

		if(msg.startMsg()==1) {
	
			Pokemon[] p = extracted();
			Pokemon[] p2 = extracted();
			
			Pokemon[] myMob = new Pokemon[3];
			Pokemon[] comMob = new Pokemon[3];
			
			int[] random = {100,100,100,100,100,100,100,100,100};
			
			am.crateRandom(r, random);
			
			msg.startMsg2();
	
			am.pickPokemon(am, p, myMob, random);
			am.comPickPokemon(r, p, myMob, comMob);
			
			levUpAll(myMob, 100);///내 포켓몬 레벨 설정
			
			levUpAll(comMob, 5);
			
			msg.printStory();
			Loop :
			while(true) {
				int n = msg.choiceTry();
				if(n==1) {
					gm.countDown();
					ui.screen();
					msg.printN(30);
					ui.battle();
					Thread.sleep(2000);
					
					while(true) {
						gm.mainGame(myMob, comMob, 1);
						if(gm.checkDieAll(comMob)) {
							msg.winnerMsg();
							ui.win();
							break Loop;
						}else if(gm.checkDieAll(myMob)) {
							msg.loserMsg();
							ui.lose();
							break Loop;
						}
					}
				}else if(n==2) {
					msg.printN(30);
					msg.printMsg("모험을 떠난다.", "");
					Thread.sleep(1500);
//					levUpRandom(p2, getAvg(myMob));//적 평균레벨 설정
					for(int i = 0; i<3;i++) {
						msg.printN(10);
						ui.grase();
						msg.printN(30);
						System.out.println("===========================================================================================");
						System.out.println("    ...!!");
						System.out.println("===========================================================================================");
						Thread.sleep(1500);
						ui.screen();
						msg.printN(30);
						gm.mainGame(myMob, p2, 2);
					}
					msg.printN(30);
					msg.printMsg("모험을 마쳤다.", "다음행동을 선택해 주세요.");
					Thread.sleep(1500);
				}else if(n==3) {
					ui.senter();
					allHeal(myMob);
					msg.printN(30);
					msg.printMsg("포켓몬 센터에서 나왔다.", "다음행동을 선택해 주세요.");
				}else {break;}
			}
		}
	}

	private static Pokemon[] extracted() {
		Pokemon[] p = new Pokemon[9];

		Pikachu pika = new Pikachu("피카츄");
		Pairi pai = new Pairi("파이리");
		Kobugi kobu = new Kobugi("꼬부기");
		Beukein beuke = new Beukein("브케인");
		Bulkkochsung bulsung = new Bulkkochsung("불꽃숭이");
		Ingaking ingaking = new Ingaking("잉어킹");
		Jiririball jiriri = new Jiririball("찌리리공");
		Jupythunder jupy = new Jupythunder("쥬피썬더");
		Yadon yadon = new Yadon("야돈");

		p[0] = pika;
		p[1] = pai;
		p[2] = kobu;
		p[3] = beuke;
		p[4] = bulsung;
		p[5] = ingaking;
		p[6] = jiriri;
		p[7] = jupy;
		p[8] = yadon;
		return p;
	}
	
	private static void levUpAll(Pokemon[] p, int j) {
		for(int i = 0; i<p.length; i++) {
			p[i].setLev(j);
			p[i].setStats();
		}
	}
	
	private static void allHeal(Pokemon[] p) {
		for(int i = 0; i<p.length; i++) {
			p[i].setHp(p[i].getHealth());
			p[i].setMp(p[i].getEther());
		}
	}
	
	private static void levUpRandom(Pokemon[] p, int j) {
		for(int i = 0; i<p.length; i++) {
			p[i].setLev(setRandom(j));
			p[i].setStats();
		}
	}
	
	private static int getAvg(Pokemon[] p) {
		int sum = 0, avg;
		for(int i = 0; i<p.length; i++) {
			sum = p[i].getLev();
		}
		avg = sum/(p.length);
		return avg;
	}
	
	private static int setRandom(int n) {
		Random r = new Random();
		return (r.nextInt(3))+n;
	}
	


}