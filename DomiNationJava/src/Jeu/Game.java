package Jeu;

import java.util.List;
import java.util.Scanner;

public class Game {

	private Domino domino;
	private int NbJoueurs;
	private List<Joueur> JoueurList;
	private List<Plateau> RoyaumeList;
	
	//Constructor,Initialisation et création de tout
	public Game(int NbJoueurs) {
		Joueur[] joueur = new Joueur[NbJoueurs];
		Plateau[] royaume = new Plateau[NbJoueurs];
		for(int i=1; i<=NbJoueurs; i++){
			royaume[i-1] = new Plateau(5);// indice d'un tableau commence à 0
			RoyaumeList.add(royaume[i-1]);
		}
		for(int i=1; i<=NbJoueurs; i++){
		joueur[i-1] = new Joueur(royaume[i-1]);// indice d'un tableau commence à 0
		JoueurList.add(joueur[i-1]);
		}
		this.NbJoueurs=NbJoueurs;
		
		//Mettre le chateau au milieu 
		for(int i=1; i<=NbJoueurs; i++){
		royaume[i-1].mettreDomino(3, 3, 1, 0);
		}
		
		domino= new Domino(NbJoueurs*12);
		domino.iniPioche();
		
	}
	
	
	
	
	
	
	
	
	
///////////Get & Set
	public Domino getDomino() {
		return domino;
	}

	public int getNbJoueurs() {
		return NbJoueurs;
	}

	public List<Joueur> getJoueurList() {
		return JoueurList;
	}

	public List<Plateau> getRoyaumeList() {
		return RoyaumeList;
	}

	public void setDomino(Domino domino) {
		this.domino = domino;
	}

	public void setNbJoueurs(int nbJoueurs) {
		NbJoueurs = nbJoueurs;
	}

	public void setJoueurList(List<Joueur> joueurList) {
		JoueurList = joueurList;
	}

	public void setRoyaumeList(List<Plateau> royaumeList) {
		RoyaumeList = royaumeList;
	}
	
}
