package main;

import java.util.Arrays;

public class Msg {
	
	BlankCard bc = new BlankCard();
	Point p = new Point();
	
	public void drawMsgDealer(){
		System.out.println("======================================================");
		System.out.println("==  Dealer's Card                                   ==");
		System.out.println("======================================================");
	}
	
	public void drawMsgPlayer(){
		System.out.println("======================================================");
		System.out.println("==  Your Card                                       ==");
		System.out.println("======================================================");
	}
	
	public void cardPintMsg(String[] name, String who) {
		System.out.println("======================================================");
		System.out.println("==   "+String.format("%-47s", who+" Point")+"==");
		System.out.println("==   "+String.format("%-47s", Arrays.toString(bc.reNamed(name)))+"==");
		System.out.println("==   "+String.format("%-47s", Arrays.toString(p.getPoint(name)))+"==");
		System.out.println("======================================================");
	}
	
	public void hideDealerCard(String[] name) {
		
		String[] hideName = bc.reNamed(name);
		int[] hideNum = p.getPoint(name);
		
		hideName[0] = "Hide";
		hideNum[0] = 0;
		
		System.out.println("======================================================");
		System.out.println("==   "+String.format("%-47s", "Dealer's Card Point")+"==");
		System.out.println("==   "+String.format("%-47s", Arrays.toString(hideName))+"==");
		System.out.println("==   "+String.format("%-47s", Arrays.toString(hideNum))+"==");
		System.out.println("======================================================");
	}
	
	
	
}
