package ex;

public class Hero {
	private String name="minato";
	private int hp=100;
	private int attack=2;

	public void attack(Matango m) {
		while(m.getHp()>0) {
			System.out.println(this.name+"の攻撃");
			if(this.attack>0) {
				System.out.println(this.attack+"ポイントのダメージを与えた");
				m.Heroattack();
			}else {
				System.out.println("攻撃は外れた...");
			}
		}
		if(m.getHp()<0) {
			System.out.println("相手を倒した");
		}
	}

	public int getAttack() {
		return this.attack;
	}

}
