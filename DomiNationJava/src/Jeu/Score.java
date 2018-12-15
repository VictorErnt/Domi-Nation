package Jeu;

import java.util.ArrayList;

public class Score {
	private int Score=0;
	private int Couronnes=0;
	private int NbCases=0;

	public Score() {

	}

	public int ScoreRoyaume(Plateau royaume) {
		int type = 0;
		for (int ligne = 1; ligne < royaume.getLongRoyaume()+1; ligne++) {
			for (int colonne = 1; colonne < royaume.getLongRoyaume()+1; colonne++) {
			
				type = royaume.getCasetype(ligne, colonne);
				
				if (type == 0 || type == 1) {
				} else {
					 this.Couronnes=0;
					 this.NbCases=0;
					 Exploration(royaume,ligne,colonne,type);
					 this.Score=Score+NbCases*Couronnes;
				}

			}
		}
		return this.Score;
	}
	
	

	public ArrayList<Integer> CaseBetD(int ligne, int colonne, Plateau royaume) {
		int typeB = 0;

		int typeD = 0;

		try {
			// Case du bas
			typeB = royaume.getCasetype(ligne+1, colonne );
		} catch (Exception e) {
			 typeB = 0;

		}

		try {
			// Case de droite
			typeD = royaume.getCasetype(ligne, colonne+1);
		} catch (Exception e) {
		 typeD = 0;

	}
		ArrayList<Integer> cases = new ArrayList<Integer>();
		cases.add(typeB);
		cases.add(typeD);

		return cases;
	}
	
	
	public void Exploration(Plateau royaume, int l, int c, int type) {
		ArrayList<ArrayList<Integer>> CasesduBas = new ArrayList<ArrayList<Integer>>();
		CasesduBas=TeteChercheuseligne(royaume,l,c,type);
		System.out.println(CasesduBas);
			for(int i=0; i<CasesduBas.size();i++) {
				Exploration(royaume,CasesduBas.get(i).get(0),CasesduBas.get(i).get(1),type);
			}
		}
		
	
		
	public ArrayList<ArrayList<Integer>> TeteChercheuseligne(Plateau royaume, int ligne, int colonne, int type) {
		ArrayList<ArrayList<Integer>> casesTypeBas = new ArrayList<ArrayList<Integer>>();
		Torpille(royaume,ligne,colonne,type,casesTypeBas);
		return casesTypeBas;
		
	}
	
	
	
	public void Torpille(Plateau royaume, int ligne, int colonne, int type,ArrayList<ArrayList<Integer>> casesTypeBas)  {
		ArrayList<Integer> CasesAutour = new ArrayList<Integer>();
		ArrayList<Integer> note;
		CasesAutour=CaseBetD(ligne,colonne,royaume);
		
			this.NbCases++;
			int p=this.Couronnes;
			this.Couronnes=p+royaume.getCaseCouronne(ligne, colonne);
		
		royaume.mettreDomino(ligne, colonne, 0, royaume.getCaseCouronne(ligne, colonne));
			

		if(CasesAutour.get(0)==type) {
		
			royaume.mettreDomino(ligne+1, colonne, 0, royaume.getCaseCouronne(ligne, colonne));
	
			note=new ArrayList<Integer>();
			note.add(ligne+1);
			note.add(colonne);
			casesTypeBas.add(note);
			
		}
		if(CasesAutour.get(1)==type) {
			Torpille(royaume,ligne,colonne+1,type,casesTypeBas);
		}
	
	}
	
}

