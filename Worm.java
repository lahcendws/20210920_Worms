package atelier;

public class Worm {
	private String name;
	private int life = 100;
	private int attak = 10;

	public Worm(String name, int life, int attak) {

		this.life = life;
		this.attak = attak;
		this.name = name;
		// this.damage = damage;

	}

	// getter et setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttak() {
		return attak;
	}

	public void setAttak(int attak) {
		this.attak = attak;
	}

	public static void main(String[] args) {

		Worm worm1 = new Worm("ghost", 40, 10);
		Worm worm2 = new Worm("titeuf", 50, 5);

		while (worm1.getLife() > 0 && worm2.getLife() > 0) {

			System.out.println(" le ver " + worm1.getName() + " attaque :");

			worm2.setLife(worm2.getLife() - worm1.getAttak());

			if (worm2.getLife() == 0) {
				System.out.println(" le ver " + worm1.getName() + " a gagne");
				System.exit(1);

			}
			System.out.println(" le ver" + worm2.getName() + " reste :" + worm2.getLife());
			System.out.println(" le ver " + worm2.getName() + " attaque! :");
			worm1.setLife(worm1.getLife() - worm2.getAttak());
			System.out.println("le ver " + worm1.getName() + " reste :" + worm1.getLife());

		}
	}

}
