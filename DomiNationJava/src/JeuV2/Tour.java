package JeuV2;

import java.util.ArrayList;
import java.util.Stack;

public class Tour {

	public Tour (){
	}
	
	/*
	 * Cr�er une fonction qui d�termine quels places sont disponible
	 */
	public static void Possibilit�s_Domino(Plateau plateau, Tuile tuile) {
		
		
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
    	String roiPioch�= "" + roi.pop();
    	return roiPioch�;
    /* je convertit le premi�re �l�ment de la pile en string pcq sinon c'est consid�r� comme un objet et nn comme un string et 
     * on pourra pas le comparer par la suite pour savoir c'est a qui de jouer, pcq comparaison entre objet je vois pas ..
     */
    }
	
}
