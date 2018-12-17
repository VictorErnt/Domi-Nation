package Jeu;

public class Tuile {
	private Demi_domino demiDomino1;
	private Demi_domino demiDomino2;
	public Tuile(Demi_domino demiDomino1, Demi_domino demiDomino2) {
		this.demiDomino1 = demiDomino1;
		this.demiDomino2 = demiDomino2;
	}
	
	public Demi_domino getDemiDomino1() {
		return demiDomino1;
	}
	public void setDemiDomino1(Demi_domino demiDomino1) {
		this.demiDomino1 = demiDomino1;
	}
	public Demi_domino getDemiDomino2() {
		return demiDomino2;
	}
	public void setDemiDomino2(Demi_domino demiDomino2) {
		this.demiDomino2 = demiDomino2;
	}

}
