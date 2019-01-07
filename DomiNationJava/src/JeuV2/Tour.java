package JeuV2;

import java.util.ArrayList;
import java.util.Stack;

public class Tour {

	public Tour (){
	}
	
	
	
	
	
	///////////////Methods
	
	/*
	 * Créer une fonction qui détermine quels places sont disponible
	 */
	public void possibilitésDomino(Plateau royaume, Tuile tuile) {
		String type="rien";
		String typeDemi1= tuile.getDemiDomino1().getType();
		String typeDemi2= tuile.getDemiDomino2().getType();
		String[] typeCasesAutour;
		ArrayList<ArrayList<Integer>> casesRetenu= new ArrayList<ArrayList<Integer>>();//case vide avec un demidomino à coté
		ArrayList<Integer> notation;//sert à noté les cases retenu
		
		for (int ligne = 1; ligne < royaume.getLongRoyaume()+1; ligne++) {
			for (int colonne = 1; colonne < royaume.getLongRoyaume()+1; colonne++) {
				try{
				type=royaume.renvoieCase(ligne, colonne).getType();
				}catch(Exception e) {
					type="rien";
				}
				if(type.equals("rien")) {
					typeCasesAutour=new String[4];
					typeCasesAutour=CaseB_H_D_Gtype(ligne,colonne,royaume);
					if (typeCasesAutour[0].equals("rien")||typeCasesAutour[1].equals("rien")
							||typeCasesAutour[2].equals("rien")||typeCasesAutour[3].equals("rien")) {
					}
					else {
						for(int autour=0;autour<4;autour++) {
							if(typeCasesAutour[autour].equals(typeDemi1)) {
								
							}
							if(typeCasesAutour[autour].equals(typeDemi2)){
								
							}
							if(typeCasesAutour[autour].equals(typeDemi1) && typeCasesAutour[autour].equals(typeDemi2) ||typeCasesAutour[autour].equals("Chateau")) {
								
							}
						}
						}
					}
			}
		}
		
		
		
	}
	
	


	public String[] CaseB_H_D_Gtype(int ligne, int colonne, Plateau royaume) {
		
		String typeB;
		String typeH;
		String typeG;
		String typeD;

		try {
			// Case du bas
			typeB = royaume.renvoieCase(ligne+1, colonne).getType();
		} catch (Exception e) {
			 typeB = "rien";

		}
		try {
			// Case du haut
			typeH= royaume.renvoieCase(ligne-1, colonne).getType();
		} catch (Exception e) {
			 typeH = "rien";

		}
		try {
			// Case de droite
			typeD = royaume.renvoieCase(ligne, colonne+1).getType();
		} catch (Exception e) {
			typeD = "rien";
		}
		try {
			// Case de gauche
			typeG = royaume.renvoieCase(ligne, colonne-1).getType();
		} catch (Exception e) {
			 typeG = "rien";

		}

		String[] cases = new String[2];
		cases[0]=typeB;
		cases[1]=typeH;
		cases[2]=typeD;
		cases[3]=typeG;

		return cases;
	}
	
	/*
	public static Stack<String> pileRoi(ArrayList<String> rdmRoi) {
    	Stack king = new Stack();
    	for (int i=rdmRoi.size()-1; i>=0;i--) {
    		king.push(rdmRoi.get(i));	
    	}
    	return king;
    }
    
    public static String piocherRoi (Stack roi) {
    	roi.pop();
    	String roiPioché= "" + roi.pop();
    	return roiPioché;
     //je convertit le première élément de la pile en string pcq sinon c'est considéré comme un objet et nn comme un string et 
     //on pourra pas le comparer par la suite pour savoir c'est a qui de jouer, pcq comparaison entre objet je vois pas ..
     
	
    }
	*/
}
