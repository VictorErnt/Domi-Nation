package Test;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> casesTypeBas = new ArrayList<ArrayList<Integer>>();
		Jeu.Plateau plat=new Jeu.Plateau(5, 1);
		
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
		plat.mettreDomino(3, 2, 2, 1);
		Jeu.Score score=new Jeu.Score();
		
		//System.out.println(plat.getRoyaume());
		System.out.println(plat.getCaseCouronne(2, 3));
		System.out.println(score.ScoreRoyaume(plat));

		
	}
	
	public static void ajout(int e) {
		e=e+1;
	}
}
