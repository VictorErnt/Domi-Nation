package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import Jeu.*;
import JeuV2.DemiDomino;
import JeuV2.Joueur;
import JeuV2.Plateau;


public class Test {

	public static void main(String[] args) {
		JeuV2.Plateau plat=new JeuV2.Plateau(5);
		DemiDomino domi=new DemiDomino(0,"Montagne"); 
		DemiDomino domi2=new DemiDomino(1,"Montagne"); 
		DemiDomino domi3=new DemiDomino(0,"Montagne"); 
		DemiDomino domi4=new DemiDomino(0,"Montagne"); 
		DemiDomino domi5=new DemiDomino(0,"Montagne"); 
		DemiDomino domi6=new DemiDomino(0,"Montagne"); 
		DemiDomino domi7=new DemiDomino(0,"Montagne"); 
		DemiDomino domi8=new DemiDomino(0,"Montagne"); 
		DemiDomino domi9=new DemiDomino(0,"Montagne"); 
		DemiDomino domi10=new DemiDomino(0,"Montagne"); 
		DemiDomino domi11=new DemiDomino(0,"Montagne"); 
		DemiDomino domi12=new DemiDomino(0,"Montagne"); 
		DemiDomino domi13=new DemiDomino(1,"Montagne"); 
		
		
		
		
		plat.mettreDomino(1, 1, domi);
		plat.mettreDomino(1, 2, domi2);
		plat.mettreDomino(1, 3, domi3);
		plat.mettreDomino(1, 4, domi4);
		plat.mettreDomino(1, 5, domi5);
		
		
		plat.mettreDomino(2, 1, domi6);
		plat.mettreDomino(3, 1, domi12);
		plat.mettreDomino(2, 3, domi7);
		plat.mettreDomino(3, 3, domi8);
		plat.mettreDomino(3, 4, domi9);
		plat.mettreDomino(3, 5, domi10);
		plat.mettreDomino(4, 4, domi11);
		plat.mettreDomino(3, 2, domi13);
		
		JeuV2.Score score=new JeuV2.Score();
		
		
		//System.out.println(plat.getRoyaume());
		//System.out.println(plat.getCaseCouronne(2, 3));
		System.out.println(score.ScoreRoyaume(plat));
		
		
		
		
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
		
		
		
		
		
	}
	

}
