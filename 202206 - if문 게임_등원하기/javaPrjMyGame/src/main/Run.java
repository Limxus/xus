package main;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Menu mu = new Menu();
		
		MainLoop :
		while (true) {
			
			System.out.println("========================================");
			mu.wd("Go to KH Academy","","1. GAME START","2. EXIT");
			byte option1 = sc.nextByte();
			
			int score = 0;
			
			if(option1==1) {
				
				String[] weeks = {"월","화","수","목","금"};
				
				WeekLoop :
				for (int i=0; i<5; i++) {
					
					int time = 0;
					
					while(true) {//1번째 선택
						mu.wdMs(weeks[i]+"요일 아침이 밝았습니다. 현재시간 AM 07:00 \n학원 등원까지 약 한시간.... 당신은...");
						mu.wd("", "1. 일어난다 (+0min)", "2. 조금 더 잔다 (+15min)", "3. 오늘은 포기한다.");
						byte subOption = sc.nextByte();
						
						if (subOption==3) {
							if(i==0) {
								mu.wdMs("월요일 부터 포기하다니.....\nGAME OVER");
								break MainLoop;								
							}else {
								mu.wdMs("오늘은 땡땡이 쳤다...!");
								score -= 20;
								System.out.println("                                        ");
								System.out.println("              다 음 날   . . .            ");
								System.out.println("                                        ");
								System.out.println("========================================");
								continue WeekLoop;
							}
						}else if (subOption!=1&&subOption!=2) {
							mu.wdMs("입력값을 확인하여 주시기 바랍니다.");
							continue;
						}else {
							int late = (subOption==1) ? 0 : 15;
							time += late;
							break;
						}
					}
					
					while(true) {//2번째 선택
						mu.wdMs("결국 일어난 당신 등원을 하기위해 한시간동안\n준비를 마쳤다..이후 당신은 ...");
						mu.wd("", "1. 지하철을 이용한다 (+35min)", "2. 버스를 이용한다 (+45min)", "3. 오늘은 집에서 온라인으로 들어야겠다");
						byte subOption = sc.nextByte();
						
						if (subOption==3) {
							mu.wdMs("오늘은 집에서 편안하게 수업을 마쳤다.");
							score += 50;
							System.out.println("                                        ");
							System.out.println("              다 음 날   . . .            ");
							System.out.println("                                        ");
							System.out.println("========================================");
							continue WeekLoop;
						}else if (subOption!=1&&subOption!=2) {
							mu.wdMs("입력값을 확인하여 주시기 바랍니다.");
							continue;
						}else {
							int late = (subOption==1) ? 35 : 45;
							time += late;
							break;
						}
					}
					
					while(true) {//3번째 선택
						mu.wdMs("학원에 등원하는 길 학원 앞 카페가 눈길을 끈다. \n당신은...");
						mu.wd("", "1. 당연히 아침엔 커피한잔 (+15min)", "2. 커피는 무슨 가서 물이나 마시자 (+0min)", "");
						byte subOption = sc.nextByte();
						
						if (subOption!=1&&subOption!=2) {
							mu.wdMs("입력값을 확인하여 주시기 바랍니다.");
							continue;
						}else {
							int late = (subOption==1) ? 15 : 0;
							time += late;
							break;
						}
					}
					
					if (time==60) {
						mu.wdMs("휴 정시도착 오늘도 완벽하다");
						score += 90;
					}else if (time<60) {
						mu.wdMs("오늘도 여유로운 하루 10분 전 도착이 정석이지");
						score += 100;
					}else if (time<70){
						mu.wdMs("아차 조금 지각해 버렸다.. 이정돈 아슬아슬...세이프?");
						score += 80;
					}else {
						mu.wdMs("오늘은 지각해버렸다 ㅠㅜ");
						score += 70;
					}
					
					if (i==1) {
						System.out.println("                                        ");
						System.out.println("              수 업 끝   . . .            ");
						System.out.println("                                        ");
						System.out.println("========================================");
						while(true) {
							mu.wdMs("집에 돌아가는길 친한 친구에게서 메세지가 왔다. \n친구 : \"내일 영화 콜?\"");
							mu.wd("", "1. \"오케이 보고싶었는데 콜!!\"", "2. \"미안해 나 내일 학원가야해 ㅠㅜ\"", "");
							byte subOption = sc.nextByte();
							
							if (subOption!=1&&subOption!=2) {
								mu.wdMs("입력값을 확인하여 주시기 바랍니다.");
								continue;
							}else if(subOption==1){
								score -= 20;
								i += 1;
								System.out.println("========================================");
								System.out.println("                수요일은                  ");
								System.out.println("               M O V I E                ");
								System.out.println("                                        ");
								System.out.println("========================================");
								break;
							}else {
								System.out.println("========================================");
								break;
							}
						}
					}else if (i==3) {
						System.out.println("                                        ");
						System.out.println("              수 업 끝   . . .            ");
						System.out.println("                                        ");
						System.out.println("========================================");
						while(true) {
							mu.wdMs("집에 돌아가는길 썸을 타는 그(그녀)에게 연락이 왔다. \n썸 : \"저기혹시.. 내일 시간 되시나요?\"");
							mu.wd("", "1. \"당연하죠!! 언제가 좋으신가요!!\"", "2. \"죄송해요.. 내일은 학원이있어서ㅜ", "다음에 괜찮으신가요\"");
							byte subOption = sc.nextByte();
							
							if (subOption!=1&&subOption!=2) {
								mu.wdMs("입력값을 확인하여 주시기 바랍니다.");
								continue;
							}else if(subOption==1){
								score -= 20;
								i += 1;
								System.out.println("========================================");
								System.out.println("                 금요일은                 ");
								System.out.println("                D A T E                 ");
								System.out.println("                                        ");
								System.out.println("========================================");
								break;
							}else {
								System.out.println("========================================");
								break;
							}
						}
					}
					
					if (i!=4) {
						System.out.println("                                        ");
						System.out.println("              다 음 날   . . .            ");
						System.out.println("                                        ");
						System.out.println("========================================");
					}
					
				}//weekLoop
				
				if (score==500) {
					System.out.println("                                        ");
					System.out.println("              이번주..나는                 ");
					System.out.println("              500점 만점!!                ");
					System.out.println("========================================");
					mu.wdMs("흠냐흠냐.. 꿈인가..? 몸이 다 뻐근하다...(알람소리)");
					break;
				}else if (score>=450) {
					System.out.println("                                        ");
					System.out.println("              이번주..나는                 ");
					System.out.println("                 "+score+"점             ");
					System.out.println("========================================");
					mu.wdMs("이번주도 알차게 공부한 당신! 성공으로 가는 지름길!");
					break;
				}else if (score>=400) {
					System.out.println("                                        ");
					System.out.println("              이번주..나는                 ");
					System.out.println("                 "+score+"점             ");
					System.out.println("========================================");
					mu.wdMs("2% 부족하지만 열심히 한 당신! 이정도만 해도 우등생!");
					break;
				}else if (score>=350) {
					System.out.println("                                        ");
					System.out.println("              이번주..나는                 ");
					System.out.println("                 "+score+"점             ");
					System.out.println("========================================");
					mu.wdMs("열심히는 했지만..... 아직 많이 부족하네요");
					break;
				}else if (score>250) {
					System.out.println("                                        ");
					System.out.println("              이번주..나는                 ");
					System.out.println("                 "+score+"점             ");
					System.out.println("========================================");
					mu.wdMs("조금더 분발할 필요가 있습니다.");
					break;
				}else if (score==250) {
					System.out.println("                                        ");
					System.out.println("              이번주..나는                 ");
					System.out.println("                 "+score+"점             ");
					System.out.println("========================================");
					mu.wdMs("열심히 했지만 가끔은 등원하는게 어떨까요?");
					break;
				}else {
					System.out.println("                                        ");
					System.out.println("              이번주..나는                 ");
					System.out.println("                 "+score+"점             ");
					System.out.println("========================================");
					mu.wdMs("놀거 다 놀면 공부는 언제하니!");
					break;
				}
				
			
			}else if(option1==2) {
				System.out.println("감사합니다.");
				break;
			}else {
				mu.wdMs("입력값을 확인하여 주시기 바랍니다.");
				continue;
			}
			
		}//반복문
	}//main

}
