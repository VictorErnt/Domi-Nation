package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import Jeu.*;


public class Test {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> casesTypeBas = new ArrayList<ArrayList<Integer>>();
		Jeu.Plateau plat=new Jeu.Plateau(5);
		
		plat.mettreDomino(1, 1, 2, 0);
		plat.mettreDomino(1, 2, 2, 0);
		plat.mettreDomino(1, 3, 2, 0);
		plat.mettreDomino(1, 4, 2, 0);
		plat.mettreDomino(1, 5, 2, 0);
		

		plat.mettreDomino(2, 1, 2, 0);
		plat.mettreDomino(3, 1, 2, 0);
		
		plat.mettreDomino(2, 3, 2,0);
		plat.mettreDomino(3, 3, 2, 0);
		plat.mettreDomino(3, 4, 2, 0);
		plat.mettreDomino(3, 5, 2,0);
		plat.mettreDomino(4,4,2,0);
		
		//plat.mettreDomino(2, 2, 3, 2);
		//plat.mettreDomino(3, 2, 2, 1);
		//new Jeu.Score();
		
		
		//System.out.println(plat.getRoyaume());
		//System.out.println(plat.getCaseCouronne(2, 3));
		//System.out.println(ScoreRoyaume(plat));
		Jeu.Domino domino=new Jeu.Domino(48);
		domino.iniPioche();
		HashMap<Integer, ArrayList<Integer>> o = domino.getRefDomino();
		//System.out.println(domino.Pioche());
		//System.out.println(domino.getBiblioDomino());
		//System.out.println(o);
		
		
		
		Joueur[] joueur = new Joueur[3];
		Plateau[] royaume = new Plateau[3];
		for(int i=1; i<=3; i++){
			royaume[i-1] = new Plateau(5);// indice d'un tableau commence à 0
		}
		System.out.println();
	}
	

}
