package main;

public class Draw {
	
	String[] shape = {"♠", "♢", "♡", "♣"};
	String[] number = {"01","02","03","04","05","06","07","08","09","10","11","12","13"};
	
	int numLen = number.length;
	int shapeLen = shape.length;
	String[] card = new String[52];
	
	int c = 0;
	
	public void namedCard() {
		for(int i=0;i<shapeLen;i++) {
			for(int j=0;j<numLen;j++) {
				card[c] = shape[i]+number[j];
				c++;
			}
		}				
	}
	
	public String drawCard() {
		int n;
		String blank = "";
		
		for (int i=0;i<card.length;i++) {
			blank += card[i];
		}
		
		if (!(blank.equals(""))) {
			do {
				n = (int) (Math.random()*52);
			}while(card[n].equals(""));
			
			String newCard = card[n];
			card[n] = "";
			
			return newCard;
			
		}else {
			System.out.println("카드를 섞어주세요.");
			return "";
		}
	}
	
	//카드 오픈
	public void open(String[] name) {
		BlankCard bc = new BlankCard();
		
		for(int i=0;i<name.length;i++) {
			if(name[i]==null) {
				continue;
			}
			bc.blank(name[i]);
		}
	}

}