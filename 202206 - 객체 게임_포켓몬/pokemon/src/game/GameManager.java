
package game;

import mob.*;

public class GameManager {

	GameMsg msg = new GameMsg();
	ActionManager am = new ActionManager();
	BattleManager bm = new BattleManager();
	Ui ui = new Ui();
	Condition c = new Condition();

	public void mainGame(Pokemon[] user, Pokemon[] com, int i) throws InterruptedException {

		Pokemon cPokemon;
		Pokemon uPokemon;
		
		cPokemon = am.comSummon(com);
		if(i==1) {
			msg.Summon("com", cPokemon);
		}else if(i==2){
			msg.SummonField(cPokemon);
		}
		
		while(true) {
			uPokemon = am.userSummon(user);
			
			Thread.sleep(1500);
			
			msg.printN(10);
			uPokemon.img();
			
			Thread.sleep(1500);
	
			msg.printN(30);
			if(i==1) {
				msg.printMsg("com의 포켓몬", cPokemon.getName());
			}else if(i==2){
				msg.printMsg("야생의 포켓몬", cPokemon.getName());
			}
			msg.mobInfo(cPokemon);
			msg.hpMPBar(cPokemon);
			msg.printMsg("나의 포켓몬", uPokemon.getName());
			msg.mobInfo(uPokemon);
			msg.hpMPBar(uPokemon);
	
			boolean youWin = bm.battle(cPokemon, uPokemon);
			
			c.clearAll(uPokemon);
			c.clearAll(cPokemon);
	
			if (youWin) {
				msg.winnerMsg(uPokemon, cPokemon);
				msg.printMsg("경험치를 획득했다.", getExp(uPokemon, cPokemon));
			} else {
				msg.winnerMsg(cPokemon, uPokemon);
//				msg.printMsg("경험치를 획득했다.", getExp(cPokemon, uPokemon));
			}
			
			Thread.sleep(2000);
			msg.printN(30);
			if(i==2) {
				if(cPokemon.getHp()==0) {
					break;
				}
			}else {break;}
		}
	}
	
	public void countDown() throws InterruptedException {
		msg.printMsg("전투가 시작됩니다.", 3);
		Thread.sleep(1000);
		msg.printN(30);
		msg.printMsg("전투가 시작됩니다.", 2);
		Thread.sleep(1000);
		msg.printN(30);
		msg.printMsg("전투가 시작됩니다.", 1);
		Thread.sleep(1000);
	}

	
	public boolean checkDieAll(Pokemon[] arr) {
		boolean result = false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getHp()==0) {
				result = true;
			}else {
				result = false;
				break;
			}
		}
		
		return result;
	}

	public int getExp(Pokemon a, Pokemon b) {
		int n = a.getLev();
		int m = b.getLev();
		int exp = 0;
		
		if(n-m==0) {
		exp = 60;
		a.setExp(a.getExp()+exp);
		a.leveUP(a);
		}else if(n-m<-3) {
			exp = 100;
			a.setExp(a.getExp()+exp);
			a.leveUP(a);
		}else if(n-m<-2){
			exp = 40;
			a.setExp(a.getExp()+exp);
			a.leveUP(a);
		}else if(n-m>2){

		}else {
			exp = 80;
			a.setExp(a.getExp()+exp);
			a.leveUP(a);
		}
		return exp;
	}
}
