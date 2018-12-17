package Jeu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class Domino
{
    /*
     * Type:
     * 0=Rien
     * 1=Chateau
     * 2=Mer
     * 3=Foret
     * 4=Prairie
     * 5=Montagne
     * 6=Champs
     * 7=Mine
     */
	Csvv csv;
	private int NbDomino;
    Random random= new Random();
    private HashMap<Integer,ArrayList<Integer>> biblioDomino; 
    private final HashMap<Integer,ArrayList<Integer>> refDomino; 
    Stack<Integer> rdnpioche;
    
    
    ///////////////////Constructor
    public Domino(int NbDomino,Csvv csv)
    {
    	try {
			biblioDomino = csv.main(biblioDomino);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    	refDomino =biblioDomino;//Pour aller chercher la valeur d'un domino
    	rdnpioche = new Stack<Integer>();
        //Donner le nombre de domino à utiliser
        this.NbDomino=NbDomino;
    }

    
    //////////////////Methods
    public ArrayList<Integer> returnDomino(int num){
        return refDomino.get(num);// Dans la liste c'est Couronne1,Type1,Couronne2,Type2
    }
    
    public ArrayList<Integer> rangerDomino(ArrayList<Integer> list0){
        Collections.sort(list0);
        return list0;
    }
    
    public void iniPioche(int nbDomidujeu){
        int r=0;
        int compteur=0;

        int domiPioche=0;
        int L=0; 
        for(int i=0; i<nbDomidujeu;i++) {
            Collection<Integer> key=biblioDomino.keySet();
            L=key.size();
            do {
                r=random.nextInt(L);
            }while(r==0);
            Iterator<Integer> it=key.iterator();
            compteur=0;
            while(compteur<r) {
                compteur++;
                domiPioche=it.next();
            }
            this.rdnpioche.push(domiPioche);
            biblioDomino.remove(domiPioche);
        }
        
    }
    
    public int Pioche(){
        return rdnpioche.pop();
    }
    
    public boolean questionPioche() {//False si la liste est vide 
    	if(rdnpioche.size()==0) {
    		return false;
    	}
    	else {
    		return true;
    	}
    }
    
   ///////////////////Get and Set
    public  HashMap<Integer,ArrayList<Integer>> getRefDomino(){
    	return refDomino;
    }
}
    
   

    
    

