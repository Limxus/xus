package main;

public class Point {
	//점수 얻기
	public int[] getPoint(String[] name) {
		int point;
		int[] points = new int[5];
		
		for(int i=0;i<name.length;i++) {
			if(name[i]==null) {
				continue;
			}
			int n = Integer.parseInt(name[i].substring(1, name[i].length()));
			if(n==11||n==12||n==13) {
				point = 10;
				points[i] = point;
			}else {
				point = n;
				points[i] = point;
			}
		}
		return points;
	}
	//점수 합계
	public int sumPoint(int[] num) {
		
		int point = 0;
		
		for(int i=0;i<num.length;i++) {
			point += num[i];
		}
		return point;
	}

	public byte judge(int dealer, int player){
		
		byte jud = 0;
		
		if (dealer>21) {
			jud = 1;
			
		}else if (player>dealer) {
			jud = 1;
		}else if (player==dealer) {
			jud = 2;
		}
		
		return jud;
	}
}
