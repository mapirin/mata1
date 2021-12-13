package ex;

public class Matango {
	private int hp=5;

	public int getHp() {
		return this.hp;
	}
	public int Heroattack() {
		Hero h=new Hero();
		this.hp=this.hp-h.getAttack();
		return this.hp;
	}
}
