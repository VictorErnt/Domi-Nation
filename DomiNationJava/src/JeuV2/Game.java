package JeuV2;

import java.util.*;
import java.util.Scanner;


public class Game {

	Pioche pioche;
	Csvv csv;
	private int nbJoueurs; 
	private ArrayList<Joueur> joueurList;
	private ArrayList<Plateau> royaumeList;
	
	//Constructor,Initialisation et création de tout
	public Game(int nbJoueurs) {
		 joueurList= new ArrayList<Joueur>();
		 royaumeList= new ArrayList<Plateau>();
		
		
		Joueur[] joueur = new Joueur[nbJoueurs];
		Plateau[] royaume = new Plateau[nbJoueurs];
		for(int i=1; i<=nbJoueurs; i++){
			royaume[i-1] = new Plateau(5);// indice d'un tableau commence à 0
			royaumeList.add(royaume[i-1]);
		}
		for(int i=1; i<=nbJoueurs; i++){
		joueur[i-1] = new Joueur(royaume[i-1]);// indice d'un tableau commence à 0
		joueurList.add(joueur[i-1]);
		}
		/*
		if (nbJoueurs==2) {
			Roi [] roi = new Roi[nbJoueurs*2] ;
				roi[0] = new Roi (joueur[0],1);
				roi[1] = new Roi (joueur[0],2);
				roi[2] = new Roi (joueur[1],3);
				roi[3] = new Roi (joueur[1],4);
				for (int i=1 ; i<=nbJoueurs*2; i++) {
					roiList.add(roi[i-1]);
					
				}		
		}
		else {
			Roi[] roi = new Roi[nbJoueurs];
			for(int i=1; i<=nbJoueurs; i++){
				roi[i-1] = new Roi (joueur[i-1],i);// indice d'un tableau commence à 0
				roiList.add(roi[i-1]);
			}
		}
		*/
		
		
		
		/*
		 * Pour récupérer les joueur et royaume il faut faire 
		 * joueur[0]
		 * joueur[1]
		 * .....
		 * 
		 * royaume[0]
		 * royaume[1]
		 * .....
		 */
		
		this.nbJoueurs=nbJoueurs;
		//Mettre le chateau au milieu 
		for(int i=1; i<=nbJoueurs; i++){
		royaume[i-1].renvoieCase(3, 3).setType("Chateau");
		royaume[i-1].renvoieCase(3, 3).setCouronnes(0);
		}
		csv = null;
		try {
			csv= new Csvv();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Erreur .csv");
			e.printStackTrace();
		}
		
		pioche=new Pioche(csv.getTuiles(),nbJoueurs*12);
		
		
	}
	
	
	
	
	
	
	
	
	
///////////Get & Set

	public int getNbJoueurs() {
		return nbJoueurs;
	}

	public List<Joueur> getJoueurList() {
		return joueurList;
	}

	public List<Plateau> getRoyaumeList() {
		return royaumeList;
	}

	public void setNbJoueurs(int nbJoueurs) {
		nbJoueurs = nbJoueurs;
	}

	public void setJoueurList(List<Joueur> joueurList) {
		joueurList = joueurList;
	}

	public void setRoyaumeList(List<Plateau> royaumeList) {
		royaumeList = royaumeList;
	}
	
}
