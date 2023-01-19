package mob;

public class Pokemon {

	protected String name;
	protected String property;

	protected double atk = 20;
	protected double def = 1;
	protected double health = 100;
	protected int ether = 10;
	protected double hp = health;
	protected int mp = ether;

	protected double burfAtk;
	protected double burfDef;
	protected double deburfAtk;
	protected double deburfDef;

	protected double battleAtk;
	protected double battleDef;

	protected String skillName1;
	protected String skillName2;
	protected int sk01usedMp;
	protected int sk02usedMp;
	protected double dmg;
	protected double shield;

	protected int burf;
	protected int deburf;
	
	protected int lev = 1;
	protected int exp = 0;
	
	public void setStats() {
		
	}
	
	public void leveUP(Pokemon p) {
		if(p.getExp()>=100) {
			p.setExp(p.getExp()-100);
			p.setLev(p.getLev()+1);
			p.setStats();
		}
	}
	
	public void attack() {
		setBattleAtk();
		setBattleDef();
		System.out.println("===========================================================================================");
		System.out.println("   " + name + "(가) 공격했다!");
		System.out.println("===========================================================================================");
		dmg = battleAtk;
		shield = battleDef - 1;
	}

	public void defend() {
		setBattleAtk();
		setBattleDef();
		System.out.println("===========================================================================================");
		System.out.println("   " + name + "(가) 방어했다!");
		System.out.println("===========================================================================================");
		dmg = battleAtk * 0.5;
		shield = battleDef + 3;
	}
	
	public void img() {

	}

	public void skill01(Pokemon p) {

	}

	public void skill02(Pokemon p) {

	}

	// getter setter
	
	public int getLev() {
		return lev;
	}

	public void setLev(int lev) {
		this.lev = lev;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	

	public double getHealth() {
		return health;
	}

	public int getEther() {
		return ether;
	}
	
	public int getSk01usedMp() {
		return sk01usedMp;
	}

	public int getSk02usedMp() {
		return sk02usedMp;
	}

	public void setBattleAtk() {
		double a = this.atk + this.burfAtk - this.deburfAtk;
		if (a <= 0) {
			this.battleAtk = 0;
		} else {
			this.battleAtk = a;
		}
	}

	public void setBattleDef() {
		double a = this.def + this.burfDef - this.deburfDef;
		if (a <= 0) {
			this.battleDef = 0;
		} else {
			this.battleDef = a;
		}
	}

	public double getBurfAtk() {
		return burfAtk;
	}

	public void setBurfAtk(double burfAtk) {
		this.burfAtk = burfAtk;
	}

	public double getBurfDef() {
		return burfDef;
	}

	public void setBurfDef(double burfDef) {
		this.burfDef = burfDef;
	}

	public double getDeburfAtk() {
		return deburfAtk;
	}

	public void setDeburfAtk(double deburfAtk) {
		this.deburfAtk = deburfAtk;
	}

	public double getDeburfDef() {
		return deburfDef;
	}

	public void setDeburfDef(double deburfDef) {
		this.deburfDef = deburfDef;
	}

	public int getBurf() {
		return burf;
	}

	public int getDeburf() {
		return deburf;
	}

	public void setBurf(int burf) {
		if (burf <= 0) {
			this.burf = 0;
		} else {
			this.burf = burf;
		}
	}

	public void setDeburf(int deburf) {
		if (deburf <= 0) {
			this.deburf = 0;
		} else {
			this.deburf = deburf;
		}
	}

	public double getBattleAtk() {
		return battleAtk;
	}

	public double getBattleDef() {
		return battleDef;
	}

	public double getShield() {
		return shield;
	}

	public void setShield(double shield) {
		if (shield <= 0) {
			this.shield = 0;
		} else {
			this.shield = shield;
		}
	}

	public String getSkillName1() {
		return skillName1;
	}

	public String getSkillName2() {
		return skillName2;
	}

	public double getDmg() {
		return dmg;
	}

//	public void setDmg(int dmg) {
//		this.dmg = dmg;
//	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name.equals("")) {
		}else {
			this.name = name;
		}
	}

	public String getProperty() {
		return property;
	}

	public double getAtk() {
		return atk;
	}

	public double getDef() {
		return def;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double d) {
		if (d <= 0) {
			this.hp = 0;
		}else if (d >= this.health) {
			this.hp = this.health;
		}else {
			this.hp = d;
		}
	}

	public int getMp() {
		return mp;
	}
	
	public void setMp(int d) {
		if (d <= 0) {
			this.mp = 0;
		}else if (d >= this.ether) {
			this.mp = this.ether;
		}else {
			this.mp = d;
		}
	}

	public void info() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public String toString() {
//		return "Pokemon [name=" + name + ", atk=" + atk + ", def=" + def + ", hp=" + hp + ", mp=" + mp + ", burfAtk="
//				+ burfAtk + ", burfDef=" + burfDef + ", deburfAtk=" + deburfAtk + ", deburfDef=" + deburfDef
//				+ ", battleAtk=" + battleAtk + ", battleDef=" + battleDef + ", dmg=" + dmg + ", shield=" + shield
//				+ ", burf=" + burf + ", deburf=" + deburf + "]";
//	}

}// class
