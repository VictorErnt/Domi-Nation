package JeuV2;

import java.util.ArrayList;
import java.util.Stack;

public class Tour {

	public Tour (){
	}
	
	/*
	 * Créer une fonction qui détermine quels places sont disponible
	 */
	public static void Possibilités_Domino(Plateau plateau, Tuile tuile) {
		
		
	}
	
	
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
    /* je convertit le première élément de la pile en string pcq sinon c'est considéré comme un objet et nn comme un string et 
     * on pourra pas le comparer par la suite pour savoir c'est a qui de jouer, pcq comparaison entre objet je vois pas ..
     */
    }
	
}
