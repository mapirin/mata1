package ex2;

import ex.Matango;

public class Hero {
	private String name="minato";
	private int hp=100;

	public void attack(Matango m) {
		System.out.println(this.name+" attack");
		System.out.println("damege of 5points");
	}

	public void run() {
		System.out.println(this.name+" run");
	}

	public Hero(int hp) {
		System.out.println("Heroのコストラクタが作動");
	}
}
