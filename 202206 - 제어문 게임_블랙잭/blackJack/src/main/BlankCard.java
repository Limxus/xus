package main;

public class BlankCard {
	
	public void blank(String name) {
		
		String n = name.substring(name.length()-2, name.length());
		String s = name.substring(0, name.length()-2);
		
		if(n.equals("01")) {
			n="A";
			System.out.println(".-------------.");
			System.out.println("|"+String.format("%-13s", n)+"|");
			System.out.println("|             |");
			System.out.println("|      "+s+"      |");
			System.out.println("|     "+s+" "+s+"     |");
			System.out.println("|    "+s+"   "+s+"    |");
			System.out.println("|   "+s+" "+s+" "+s+" "+s+"   |");
			System.out.println("|  "+s+"       "+s+"  |");
			System.out.println("|             |");
			System.out.println("|"+String.format("%13s", n)+"|");
			System.out.println("'-------------'");
		}else if(n.equals("11")){
			n="J";
			System.out.println(".-------------.");
			System.out.println("|"+String.format("%-13s", n)+"|");
			System.out.println("|             |");
			System.out.println("|  "+s+" "+s+" "+s+" "+s+" "+s+"  |");
			System.out.println("|       "+s+"     |");
			System.out.println("|       "+s+"     |");
			System.out.println("|    "+s+"  "+s+"     |");
			System.out.println("|   "+s+" "+s+" "+s+"     |");
			System.out.println("|             |");
			System.out.println("|"+String.format("%13s", n)+"|");
			System.out.println("'-------------'");
		}else if(n.equals("12")){
			n="Q";
			System.out.println(".-------------.");
			System.out.println("|"+String.format("%-13s", n)+"|");
			System.out.println("|             |");
			System.out.println("|     "+s+" "+s+"     |");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|   "+s+"   "+s+" "+s+"   |");
			System.out.println("|     "+s+" "+s+s+"    |");
			System.out.println("|          "+s+"  |");
			System.out.println("|"+String.format("%13s", n)+"|");
			System.out.println("'-------------'");
		}else if(n.equals("13")){
			n="K";
			System.out.println(".-------------.");
			System.out.println("|"+String.format("%-13s", n)+"|");
			System.out.println("|             |");
			System.out.println("|   "+s+"      "+s+"  |");
			System.out.println("|   "+s+"    "+s+"    |");
			System.out.println("|   "+s+" "+s+" "+s+"     |");
			System.out.println("|   "+s+"    "+s+"    |");
			System.out.println("|   "+s+"      "+s+"  |");
			System.out.println("|             |");
			System.out.println("|"+String.format("%13s", n)+"|");
			System.out.println("'-------------'");
		}else if(n.equals("02")) {
			// 2
			System.out.println(".-------------.");
			System.out.println("|"+String.format("%-13s", n)+"|");
			System.out.println("|             |");
			System.out.println("|      "+s+"      |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|      "+s+"      |");
			System.out.println("|             |");
			System.out.println("|"+String.format("%13s", n)+"|");
			System.out.println("'-------------'");
		}else if(n.equals("03")) {
			// 3
			System.out.println(".-------------.");
			System.out.println("|"+String.format("%-13s", n)+"|");
			System.out.println("|      "+s+"      |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|      "+s+"      |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|      "+s+"      |");
			System.out.println("|"+String.format("%13s", n)+"|");
			System.out.println("'-------------'");
		}else if(n.equals("04")) {
			System.out.println(".-------------.");
			System.out.println("|"+String.format("%-13s", n)+"|");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|"+String.format("%13s", n)+"|");
			System.out.println("'-------------'");
		}else if(n.equals("05")) {
			System.out.println(".-------------.");
			System.out.println("|"+String.format("%-13s", n)+"|");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|      "+s+"      |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|"+String.format("%13s", n)+"|");
			System.out.println("'-------------'");
		}else if(n.equals("06")) {
			System.out.println(".-------------.");
			System.out.println("|"+String.format("%-13s", n)+"|");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|"+String.format("%13s", n)+"|");
			System.out.println("'-------------'");
		}else if(n.equals("07")) {
			System.out.println(".-------------.");
			System.out.println("|"+String.format("%-13s", n)+"|");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|      "+s+"      |");
			System.out.println("|             |");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|             |");
			System.out.println("|             |");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|"+String.format("%13s", n)+"|");
			System.out.println("'-------------'");
		}else if(n.equals("08")) {
			System.out.println(".-------------.");
			System.out.println("|"+String.format("%-13s", n)+"|");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|      "+s+"      |");
			System.out.println("|             |");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|             |");
			System.out.println("|      "+s+"      |");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|"+String.format("%13s", n)+"|");
			System.out.println("'-------------'");
		}else if(n.equals("09")) {
			System.out.println(".-------------.");
			System.out.println("|"+String.format("%-13s", n)+"|");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|      "+s+"      |");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|             |");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|             |");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|"+String.format("%13s", n)+"|");
			System.out.println("'-------------'");
		}else if(n.equals("10")) {
			System.out.println(".-------------.");
			System.out.println("|"+String.format("%-13s", n)+"|");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|      "+s+"      |");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|             |");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|      "+s+"      |");
			System.out.println("|   "+s+"     "+s+"   |");
			System.out.println("|"+String.format("%13s", n)+"|");
			System.out.println("'-------------'");
		}
	
		//♢ ♠ ♣ ♡
//		System.out.println("| "+String.format("%-11s",shape)+"|");
//		System.out.println("|   "+String.format("%-9s",num)+"|");
	}
	
	public void backCard() {
		System.out.println(".-------------.");
		System.out.println("|             |");
		System.out.println("|             |");
		System.out.println("|             |");
		System.out.println("|             |");
		System.out.println("|             |");
		System.out.println("|             |");
		System.out.println("|             |");
		System.out.println("|             |");
		System.out.println("|             |");
		System.out.println("'-------------'");
	}

	public String[] reNamed(String[] name) {
		String[] newName = new String[5];
		for (int i=0;i<name.length;i++) {
			if(name[i]==null) {
				continue;
			}
			String s = name[i].substring(0, name[i].length()-2);
			String n = name[i].substring(name[i].length()-2, name[i].length());
			if (n.equals("01")) {
				newName[i] = s+"A";
			}else if(n.equals("11")) {
				newName[i] = s+"J";
			}else if(n.equals("12")) {
				newName[i] = s+"Q";
			}else if(n.equals("13")) {
				newName[i] = s+"K";
			}else {
				newName[i] = s+n;
			}
		}
		return newName;
	}
}
