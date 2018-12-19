package JeuV2;

public class Tuile {
	private DemiDomino demiDomino1;
	private DemiDomino demiDomino2;
	public Tuile(DemiDomino demiDomino1, DemiDomino demiDomino2) {
		this.demiDomino1 = demiDomino1;
		this.demiDomino2 = demiDomino2;
	}
	
	public DemiDomino getDemiDomino1() {
		return demiDomino1;
	}
	public void setDemiDomino1(DemiDomino demiDomino1) {
		this.demiDomino1 = demiDomino1;
	}
	public DemiDomino getDemiDomino2() {
		return demiDomino2;
	}
	public void setDemiDomino2(DemiDomino demiDomino2) {
		this.demiDomino2 = demiDomino2;
	}

}
