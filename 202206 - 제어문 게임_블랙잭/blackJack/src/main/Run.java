package main;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BlankCard bc = new BlankCard();
		Point p = new Point();
		Msg msg = new Msg();

		//게임 시작
		mainGameLoop :
		while(true) {
			System.out.println("======================================================");
			System.out.println("===============  Card Game BlackJack  ================");
			System.out.println("======================================================");
			System.out.println("==                        |                         ==");
			System.out.println("==   1. Game Start        |  2.End                  ==");
			System.out.println("==                        |                     Lim ==");
			System.out.println("======================================================");
			System.out.print("= Dealer : \"Please choose\"\n= I : ");
			int cho1 = sc.nextInt();
			
			if(cho1==1) {
				//gmaeStart
				//카드섞기
				Draw dr = new Draw();
				dr.namedCard();
				
				int dealPoint = 0;
				int playerPoint = 0;
				String[] dealCard = new String[5];
				String[] playerCard = new String[5];
				
				int i = 0;
				int cho2 = 1;
				
				boolean dealInA;
				boolean yourInA;
				
				do {//draw
					if (i>3&&playerPoint<=21) {
						System.out.println("======================================================");
						System.out.println("==  YOU WIN!                                        ==");
						System.out.println("======================================================");
						msg.cardPintMsg(dealCard, "Dealer's Card");
						msg.cardPintMsg(playerCard, "Your Card");
						break mainGameLoop;
					}
					if (dealPoint<=17) {
						//dealer
						System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
						System.out.println("======================================================");
						System.out.println("==  Dealer : Draw!                                  ==");
						System.out.println("======================================================");
						msg.drawMsgDealer();
						dealCard[i+1] = dr.drawCard();
						if(i==0) {
							dealCard[i] = dr.drawCard();
						}
						
						dealPoint = p.sumPoint(p.getPoint(dealCard));
						
						bc.blank(dealCard[i+1]);
						if(i==0) {
							bc.backCard();
						}
						
						
						dealInA =IntStream.of(p.getPoint(dealCard)).anyMatch(x -> x==1);
						
						if (dealPoint==21||(dealInA&&dealPoint==11)) {
							msg.drawMsgDealer();
							dr.open(dealCard);
							System.out.println("======================================================");
							System.out.println("==  Dealer : Black Jack!                            ==");
							System.out.println("==                                                  ==");
							System.out.println("==  ... GAME OVER                                   ==");
							System.out.println("======================================================");
							break mainGameLoop;
						}
					}else {
						System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
						System.out.println("======================================================");
						System.out.println("==  Dealer : Pass!                                  ==");
						System.out.println("======================================================");
					}
					
					//player
					
					if (cho2==1) {
						msg.drawMsgPlayer();
						playerCard[i+1] = dr.drawCard();
						if(i==0) {
							playerCard[i] = dr.drawCard();
						}
		
						playerPoint = p.sumPoint(p.getPoint(playerCard));
						
						bc.blank(playerCard[i+1]);
						if(i==0) {
							bc.blank(playerCard[i]);
						}
						
						yourInA =IntStream.of(p.getPoint(playerCard)).anyMatch(x -> x==1);
						
						if ((yourInA&&playerPoint==11)||playerPoint==21) {
							msg.drawMsgPlayer();
							dr.open(playerCard);
							System.out.println("======================================================");
							System.out.println("==  Your Black Jack!                                ==");
							System.out.println("==                                                  ==");
							System.out.println("==  ... YOU WIN!!                                   ==");
							System.out.println("======================================================");
							break mainGameLoop;
						}else if(playerPoint>21) {
							System.out.println("======================================================");
							System.out.println("==  Your Point Over                                 ==");
							System.out.println("==                                                  ==");
							System.out.println("==  ... GAME OVER                                   ==");
							System.out.println("======================================================");
							msg.cardPintMsg(playerCard, "Your Card");
							break mainGameLoop;
						}
					}
					
					while(true) {
						System.out.println("======================================================");
						System.out.println("==   1. Draw     |  2. Pass      |  3. Infor        ==");
						System.out.println("======================================================");
						System.out.print("= Dealer : \"Please choose\"\n= I : ");
						cho2 = sc.nextInt();			
						
						if(cho2==1) {
							break;
						}else if (cho2==2) {
							if (dealPoint<=17) {
								break;
							}
							System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
							byte j = p.judge(dealPoint, playerPoint);
							if (j==0) {
								System.out.println("======================================================");
								System.out.println("==  YOU LOSE!                                       ==");
								System.out.println("======================================================");
								msg.cardPintMsg(dealCard, "Dealer's Card");
								msg.cardPintMsg(playerCard, "Your Card");
							}else if (j==1) {
								System.out.println("======================================================");
								System.out.println("==  YOU WIN!                                        ==");
								System.out.println("======================================================");
								msg.cardPintMsg(dealCard, "Dealer's Card");
								msg.cardPintMsg(playerCard, "Your Card");
							}else if (j==2) {
								System.out.println("======================================================");
								System.out.println("==  YOU LOSE!                                       ==");
								System.out.println("======================================================");
								msg.cardPintMsg(dealCard, "Dealer's Card");
								msg.cardPintMsg(playerCard, "Your Card");
							}
							break mainGameLoop;
						}else if(cho2==3) {
							System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
							msg.hideDealerCard(dealCard);
							msg.cardPintMsg(playerCard, "Your Card");
							continue;
						}else if(cho2!=1&&cho2!=2&&cho2!=3) {
							System.out.println("입력값을 확인해 주세요");
							System.out.print("게임으로 돌아가시겠습니까? 1. Y / 2. N\n>>");
							int errcho = sc.nextInt();
							if(errcho==1) {
								continue;
							}else {
								break mainGameLoop;
							}
						}
						break;
					}//선택지 loop
					i++;
				}while(cho2==1||cho2==3||cho2==2);//draw loop
			}else if(cho1==2){
				System.out.println("감사합니다.");
				break mainGameLoop;
			}else {
				System.out.println("입력값을 확인해 주세요");
				System.out.print("게임으로 돌아가시겠습니까? 1. Y / 2. N\n>>");
				int errcho = sc.nextInt();
				if(errcho==1) {
					continue;
				}else {
					break;
				}
			}
		}//mainGameLoop
	}//main
}//class
