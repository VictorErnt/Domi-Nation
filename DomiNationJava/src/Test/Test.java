package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.Stack;

import JeuV2.Csvv;
import JeuV2.DemiDomino;
import JeuV2.Joueur;
import JeuV2.Pioche;
import JeuV2.Plateau;
import JeuV2.Tuile;


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
		//System.out.println(score.ScoreRoyaume(plat));
		
		
		
		
		Joueur[] joueur = new Joueur[3];
		Plateau[] royaume = new Plateau[3];
		for(int i=1; i<=3; i++){
			royaume[i-1] = new Plateau(5);// indice d'un tableau commence à 0
		}
		
		
		
		/*c'est le test de mes fonctions pour voir si elles marchent: c'est ok, vous pouvez revérifier */
	/*	
		Plateau royaume1;
		Plateau royaume2;
		Plateau royaume3;
		
		Joueur joueur1= new Joueur( royaume1 = new Plateau(5) , "bleu");
		Joueur joueur2= new Joueur( royaume2 = new Plateau(5) , "vert");
		Joueur joueur3= new Joueur( royaume2 = new Plateau(5) , "rouge");
		
		ArrayList Roi = new ArrayList();
		Roi.add(joueur1.getCouleurRoi());
		Roi.add(joueur2.getCouleurRoi());
		Roi.add(joueur3.getCouleurRoi());
		
		System.out.println(Roi.size());
		System.out.println(mélangerRoi(Roi));
		
		Stack piocheRoi=new Stack();
		piocheRoi = pileRoi(mélangerRoi(Roi));
		System.out.println(piocherRoi(piocheRoi));
		
		
		
		*/
		
		Random random =new Random();
		Csvv csvu = null;
		try {
			csvu= new Csvv();
			//System.out.println(csvu.getTuiles()[0].getDemiDomino1().getType());
		} catch (Exception e) {
			System.out.println("Erreur .csv");
			e.printStackTrace();
		}
		
		Pioche pioche=new Pioche(csvu.getTuiles(),48);
		System.out.println(pioche.piocheTuile().getDemiDomino1().getType());

		
	}

}
