package Jeu;

public class Roi {
	private Joueur joueur ;
	private int roi;
	
	public Roi(Joueur joueur, int roi) {
		this.joueur = joueur;
		this.roi = roi;
	}
	
///////////////////////////// getter and setter ////////////////////////////
	public Joueur getJoueur() {
		return joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	public int getRoi() {
		return roi;
	}

	public void setRoi(int roi) {
		this.roi = roi;
	}
	
	

}
