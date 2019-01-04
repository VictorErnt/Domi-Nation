package JeuV2;

import java.util.*;

import JeuV2.Plateau;


public class Joueur 
{
    
  
    private String couleurRoi;
    private Plateau royaume;
    private ArrayList<String> roi;

 
    ////////////////Constructor
    public Joueur(Plateau royaume , String couleur)
    {
        
        this.couleurRoi=couleur;
        this.royaume=royaume;
        roi = new ArrayList<String>();
        
    }

    ///////////////////Methods////////////////
    
    public static ArrayList<String> mélangerRoi ( ArrayList<String> Roi) {
    	ArrayList<String> rdmRoi=new ArrayList<String>(Roi);
    	Collections.shuffle(rdmRoi);
    	return rdmRoi;    	
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


    
    
    /////////////////Get and Set
	public String getCouleurRoi() {
		return couleurRoi;
	}

	public void setCouleurRoi(String couleurRoi) {
		this.couleurRoi = couleurRoi;
	}

	public Plateau getRoyaume() {
		return royaume;
	}

	public void setRoyaume(Plateau royaume) {
		this.royaume = royaume;
	}

	public ArrayList<String> getRoi() {
		return roi;
	}

	public void setRoi(ArrayList<String> roi) {
		this.roi = roi;
	}
	
	public static void main(String[] args) {
		
		
		/*c'est le test de mes fonctions pour voir si elles marchent: c'est ok, vous pouvez revérifier */
		
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

	}
}