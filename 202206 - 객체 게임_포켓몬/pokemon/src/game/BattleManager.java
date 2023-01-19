package game;

import java.util.Random;

import mob.Pokemon;

public class BattleManager {

	GameMsg msg = new GameMsg();
	Random r = new Random();
	ActionManager am = new ActionManager();

	public boolean battle(Pokemon com, Pokemon user) throws InterruptedException {

		boolean win = false;

		for (int i = 0; true; i++) {
			int cTemp = am.comAction(com);
			int uTemp = am.userAction(user);
			if (i % 2 == 0) {

				fight(user, com, uTemp, cTemp);
				Thread.sleep(500);
				if (dmgAndOver(user, com)) {
					win = true;
					break;
				}
				Thread.sleep(500);
				if (dmgAndOver(com, user)) {
					break;
				}
			} else {
				fight(com, user, cTemp, uTemp);
				Thread.sleep(500);
				if (dmgAndOver(com, user)) {
					break;
				}
				Thread.sleep(500);
				if (dmgAndOver(user, com)) {
					win = true;
					break;
				}
			}
			Thread.sleep(2000);
			msg.printN(20);
			msg.printMsg("com의 포켓몬", com.getName());
			msg.mobInfo(com);
			msg.hpMPBar(com);
			msg.printMsg("나의 포켓몬", user.getName());
			msg.mobInfo(user);
			msg.hpMPBar(user);
			countDownBurf(com, user);
		}
		return win;
	}

	private void fight(Pokemon p1, Pokemon p2, int n, int m) throws InterruptedException {
		am.actionCase(p1, p2, n);
		Thread.sleep(500);
		am.actionCase(p2, p1, m);
		Thread.sleep(500);
		burfCheck(p1);
		burfCheck(p2);
	}

	private void burfCheck(Pokemon p) {
		if (p.getBurf() == 0) {
			p.setBurfAtk(0);
			p.setBurfDef(0);
		}
		if (p.getDeburf() == 0) {
			p.setDeburfAtk(0);
			p.setDeburfDef(0);
		}
	}

	private void countDownBurf(Pokemon p1, Pokemon p2) {
		p1.setBurf(p1.getBurf() - 1);
		p2.setBurf(p2.getBurf() - 1);
		p1.setDeburf(p1.getDeburf() - 1);
		p2.setDeburf(p2.getDeburf() - 1);
	}

	private boolean dmgAndOver(Pokemon a, Pokemon b) {
		msg.printMsg(a.getName() + "공격 데미지", dmgCalc(a, b));
		b.setHp(b.getHp() - dmgCalc(a, b) * critical());
		if (b.getHp() == 0) {
			msg.dieMsg(b);
			return true;
		} else {
			return false;
		}
	}

	private double dmgCalc(Pokemon a, Pokemon b) {
		return a.getDmg() - (a.getDmg() * (b.getShield() / 10));
	}

	private double critical() {
		if (r.nextInt(10) < 1) {
			msg.printMsg("크리티컬 데미지!!", "두배의 데미지를 입힌다");
			return 2;
		} else {
			return 1;
		}
	}



}
