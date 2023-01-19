package game;

import java.util.Random;
import java.util.Scanner;

import mob.Pokemon;

public class ActionManager {

	GameMsg msg = new GameMsg();
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	
	public int userAction(Pokemon p) {
		int uTemp = 0;
		while (true) {
			uTemp = msg.actionChoiceMsg() - 1;
			if (uTemp == 2) {
				if (msg.skillChoiceMsg(p) == 1) {
					uTemp = 2;
					if (p.getMp() < p.getSk01usedMp()) {
						msg.printMsg("마나가 부족합니다.", "다시 선택해 주세요.");
						continue;
					}
					break;
				} else {
					uTemp = 3;
					if (p.getMp() < p.getSk02usedMp()) {
						msg.printMsg("마나가 부족합니다.", "다시 선택해 주세요.");
						continue;
					}
					break;
				}
			}
			break;
		}

		return uTemp;
	}

	public int comAction(Pokemon p) {
		int uTemp = 0;
		while (true) {
			uTemp = r.nextInt(4);
			if (uTemp == 2) {
				if (p.getMp() < p.getSk01usedMp()) {
					continue;
				}
				break;
			} else if (uTemp == 3) {
				if (p.getMp() < p.getSk02usedMp()) {
					continue;
				}
				break;
			}
			break;
		}
		return uTemp;
	}

	public void actionCase(Pokemon p, Pokemon e, int n) {
		switch (n) {
		case 0:
			p.attack();
			break;
		case 1:
			p.defend();
			break;
		case 2:
			p.skill01(e);
			break;
		case 3:
			p.skill02(e);
			break;
		}
	}

	public Pokemon userSummon(Pokemon[] user) {
		Pokemon uPokemon;
		while(true) {
			int temp = msg.userSummon(user);
			msg.Summon(user[temp - 1]);
			uPokemon = user[temp - 1];
			if(isDie(uPokemon)) {
				msg.printMsg(uPokemon.getName()+"은 쓰러졌다.", "다른 포켓몬을 골라주세요.");
			}else {
				break;
			}
		}
		return uPokemon;
	}

	public Pokemon comSummon(Pokemon[] com) {
		Pokemon cPokemon;
		do {
			int temp = r.nextInt(com.length);
			cPokemon = com[temp];
		}while(isDie(cPokemon));
		return cPokemon;
	}

	public Pokemon choice(Pokemon[] p, int[] random, int i) {
		while (true) {
			int cm = msg.choiceMob(p,random,i);
			int n = 0;

			switch (cm) {
			case 1:
				msg.mobInfo(p[random[0 + (i * 3)]]);
				p[random[0 + (i * 3)]].info();
				n = msg.twoChoiceMsg();
				break;
			case 2:
				msg.mobInfo(p[random[1 + (i * 3)]]);
				p[random[1 + (i * 3)]].info();
				n = msg.twoChoiceMsg();
				break;
			case 3:
				msg.mobInfo(p[random[2 + (i * 3)]]);
				p[random[2 + (i * 3)]].info();
				n = msg.twoChoiceMsg();
				break;
			default:
				System.out.println("err : 잘못 입력하셨습니다.");
				continue;
			}

			if (n == 1) {
				msg.printMsg(p[random[(cm - 1) + (i * 3)]].getName()+"이 내 포켓몬이 되었다. 이름을 지어주겠습니까?", "");
				System.out.print(">>>>>");
				String s = sc.nextLine();
				p[random[(cm - 1) + (i * 3)]].setName(s);
				msg.printMsg("다음 포켓몬을 선택하세요.", "");
				return p[random[(cm - 1) + (i * 3)]];
			}
			msg.printMsg("다시 선택해 주십시오", "");
		}
	}
 	
	private boolean testEqaules(int[] arr, int n) {
		boolean c = false;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==n) {
				c=true;
			}
		}
		return c;
	}
	
	private boolean testEqaules(Pokemon[] arr, Pokemon n) {
		boolean c = false;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i].equals(n)) {
				c=true;
			}
		}
		return c;
	}
	
	public void comPickPokemon(Random r, Pokemon[] p, Pokemon[] myMob, Pokemon[] comMob) {
		for (int i = 0; i < comMob.length; i++) {
			int temp = r.nextInt(9);
			while (testEqaules(myMob,p[temp])) {
				temp = r.nextInt(9);
			}
			comMob[i] = p[temp];
		}
	}

	public void pickPokemon(ActionManager am, Pokemon[] p, Pokemon[] myMob, int[] random) {
		for (int i = 0; i < myMob.length; i++) {
			myMob[i] = am.choice(p,random,i);
		}
	}

	public void crateRandom(Random r, int[] random) {
		for(int i = 0;i<random.length;i++) {
			int rd = r.nextInt(9);
			while (testEqaules(random, rd)) {
				rd = r.nextInt(9);
			}
			random[i] = rd;
		}
	}
	
	public boolean isDie(Pokemon p) {
		if(p.getHp()==0) {
			return true;
		}else {
			return false;
		}
	}
	

}
