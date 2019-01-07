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
				try{
				type=royaume.renvoieCase(ligne, colonne).getType();
				}catch(Exception e) {
					type="note";
				}
				
				if (type.equals("Chateau")||type.equals("note")) {
				} else {
					 this.Couronnes=0;
					 this.NbCases=0;
					 exploration(royaume,ligne,colonne,type);
					 this.Score=Score+NbCases*Couronnes;
				}
		

			}
		}
		return this.Score;
	}
	
	

	public String[] CaseBetDtype(int ligne, int colonne, Plateau royaume) {
		
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
	
	//exploration repète l'opération teteChercheuse ligne sur chaque branche de "l'arbre" 
	public void exploration(Plateau royaume, int l, int c, String type) {
		ArrayList<ArrayList<ArrayList<Integer>>> Exploreur = new  ArrayList<ArrayList<ArrayList<Integer>>>();
		ArrayList<ArrayList<ArrayList<Integer>>> Exploreursuivant = new  ArrayList<ArrayList<ArrayList<Integer>>>();
		ArrayList<ArrayList<Integer>> CasesduBas; //= new ArrayList<ArrayList<Integer>>();
		CasesduBas=teteChercheuseLigne(royaume,l,c,type);
		Exploreur.add(CasesduBas);
		
		while(Exploreur.size()!=0) {
			//System.out.println(Exploreur);
			//System.out.println(Couronnes);
			Exploreursuivant = new  ArrayList<ArrayList<ArrayList<Integer>>>();
			for(int i=0; i<Exploreur.size();i++) {
				for (int k=0;k<Exploreur.get(i).size();k++) {
					 CasesduBas=teteChercheuseLigne(royaume,Exploreur.get(i).get(k).get(0),Exploreur.get(i).get(k).get(1),type);
					 Exploreursuivant.add(CasesduBas);
				}
			}
			Exploreur=Exploreursuivant;
		}
	}
	
	//teteChercheuseLigne: sur toute une ligne va répété torpille, donc coche toute une ligne+garde en mémoire celle du meme type en bas et les coche
	
	public ArrayList<ArrayList<Integer>> teteChercheuseLigne(Plateau royaume, int ligne, int colonne,String type) {
		ArrayList<ArrayList<Integer>> casesTypeBas = new ArrayList<ArrayList<Integer>>();
		torpille(royaume,ligne,colonne,type,casesTypeBas);
		return casesTypeBas;
		
	}
	
	
	//Torpille: va coché une case et repéré si celle du bas du même type et la coché si telle est le cas
	public void torpille(Plateau royaume, int ligne, int colonne, String type,ArrayList<ArrayList<Integer>> casesTypeBas)  {
		String[] CasesAutour = new String[2];
		ArrayList<Integer> note;
		CasesAutour=CaseBetDtype(ligne,colonne,royaume);
		
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
			torpille(royaume,ligne,colonne+1,type,casesTypeBas);
		}
	
	}
	
}

