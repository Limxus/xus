package mob;

public class Condition {

	public void heal(Pokemon p, int n) {
		p.setHp(p.getHp() + n);
	}

	public void downAtk(Pokemon p, int n, int m) {
		p.setDeburfAtk(n);
		p.setDeburf(m);
	}

	public void downDef(Pokemon p, int n, int m) {
		p.setDeburfDef(n);
		p.setDeburf(m);
	}

	public void upDef(Pokemon p, int n, int m) {
		p.setBurfDef(n);
		p.setBurf(m);
	}

	public void upAtk(Pokemon p, int n, int m) {
		p.setBurfAtk(n);
		p.setBurf(m);
	}

	public void breakShield(Pokemon p) {
		p.setShield(0);
		p.setDeburfDef(999);
	}

	public void clearDeburf(Pokemon p) {
		p.setDeburfAtk(0);
		p.setDeburfDef(0);
	}
	
	public void clearAll(Pokemon p) {
		p.setBurfAtk(0);
		p.setBurfDef(0);
		p.setDeburfAtk(0);
		p.setDeburfDef(0);
		p.setDeburf(0);
		p.setBurf(0);
	}

}
