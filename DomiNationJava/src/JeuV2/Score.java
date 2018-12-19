package JeuV2;

import java.util.ArrayList;

public class Score {
	
	private int Score;
	private int Couronnes;
	private int NbCases;

	public Score() {
		Score=0;
		Couronnes=0;
		NbCases=0;
	}

	public int ScoreRoyaume(Plateau royaume) {
		String type="note";
		int Score=0;
		for (int ligne = 1; ligne < royaume.getLongRoyaume()+1; ligne++) {
			for (int colonne = 1; colonne < royaume.getLongRoyaume()+1; colonne++) {
				type=royaume.renvoieCase(ligne, colonne).getType();
				
				if (type.equals("Chateau")||type.equals("note")) {
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
	
	

	public String[] CaseBetD(int ligne, int colonne, Plateau royaume) {
		
		String typeB ;
		String typeD;

		try {
			// Case du bas
			typeB = royaume.renvoieCase(ligne+1, colonne).getType();
		} catch (Exception e) {
			 typeB = "note";

		}

		try {
			// Case de droite
			typeD = royaume.renvoieCase(ligne, colonne+1).getType();
		} catch (Exception e) {
		 typeD = "note";

	}
		String[] cases = new String[2];
		cases[0]=typeB;
		cases[1]=typeD;

		return cases;
	}
	
	
	public void Exploration(Plateau royaume, int l, int c, String type) {
		ArrayList<ArrayList<ArrayList<Integer>>> Exploreur = new  ArrayList<ArrayList<ArrayList<Integer>>>();
		ArrayList<ArrayList<ArrayList<Integer>>> Exploreursuivant = new  ArrayList<ArrayList<ArrayList<Integer>>>();
		ArrayList<ArrayList<Integer>> CasesduBas; //= new ArrayList<ArrayList<Integer>>();
		CasesduBas=TeteChercheuseligne(royaume,l,c,type);
		Exploreur.add(CasesduBas);
		
		while(Exploreur.size()!=0) {
			System.out.println(Exploreur);
			//System.out.println(Couronnes);
			Exploreursuivant = new  ArrayList<ArrayList<ArrayList<Integer>>>();
			for(int i=0; i<Exploreur.size();i++) {
				for (int k=0;k<Exploreur.get(i).size();k++) {
					 CasesduBas=TeteChercheuseligne(royaume,Exploreur.get(i).get(k).get(0),Exploreur.get(i).get(k).get(1),type);
					 Exploreursuivant.add(CasesduBas);
				}
			}
			Exploreur=Exploreursuivant;
		}
	}
	
		
	public ArrayList<ArrayList<Integer>> TeteChercheuseligne(Plateau royaume, int ligne, int colonne,String type) {
		ArrayList<ArrayList<Integer>> casesTypeBas = new ArrayList<ArrayList<Integer>>();
		Torpille(royaume,ligne,colonne,type,casesTypeBas);
		return casesTypeBas;
		
	}
	
	
	
	public void Torpille(Plateau royaume, int ligne, int colonne, String type,ArrayList<ArrayList<Integer>> casesTypeBas)  {
		String[] CasesAutour = new String[2];
		ArrayList<Integer> note;
		CasesAutour=CaseBetD(ligne,colonne,royaume);
		
		this.NbCases++;
		this.Couronnes=Couronnes+royaume.renvoieCase(ligne, colonne).getCouronnes();
		
		royaume.renvoieCase(ligne, colonne).setType("note");
			

		if(CasesAutour[0].equals(type)) {
		
			royaume.renvoieCase(ligne+1, colonne).setType("note");
	
			note=new ArrayList<Integer>();
			note.add(ligne+1);
			note.add(colonne);
			casesTypeBas.add(note);
			
		}
		if(CasesAutour[1].equals(type)) {
			Torpille(royaume,ligne,colonne+1,type,casesTypeBas);
		}
	
	}
	
}

