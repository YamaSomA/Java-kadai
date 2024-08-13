package Kadai_010;

public class PoisonMatango extends Matango {
	int remainingPoison = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero h) {
		super.attack(h);
		if (remainingPoison > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ！");
			this.remainingPoison--;
		}
	}
}
