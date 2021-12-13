package ex2;

public class SuperHero extends Hero {
	private boolean flying;
	public void fly() {
		this.flying=true;
		System.out.println("flyaway");
	}
	public void land() {
		this.flying=false;
		System.out.println("putin");
	}
	public void run() {
		System.out.println("撤退した");
	}

	Hero h=new Hero();
	public void hhh() {
		h.run();
	}
}
