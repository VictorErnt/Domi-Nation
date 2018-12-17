package Jeu;

import java.util.*;
public class Plateau 
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    
    private int IdRoyaume;
    private int longRoyaume;
    private ArrayList<ArrayList<ArrayList<Integer>>> Royaume ;
    private ArrayList<ArrayList<Integer>> Colonne;
    private ArrayList<Integer> DemiDomino;

   /////////////////Constructor
    public Plateau(int longRoyaume)
    {
    	this.longRoyaume=longRoyaume;
      Royaume= new ArrayList<ArrayList<ArrayList<Integer>>>();
   for (int k=0;k<longRoyaume;k++){ 
	   Colonne= new ArrayList<ArrayList<Integer>>();
      for (int i=0;i<longRoyaume;i++){
    	  DemiDomino= new ArrayList<Integer>();
    	  DemiDomino.add(0);
    	  DemiDomino.add(0);
          Colonne.add(DemiDomino);
        }
     
          Royaume.add(Colonne);
      }
      //Pour Choisir une case faire: Royaume.get(colonne-1).get(ligne-1).set(0 ou 1,Valeur)
    }
    
   
	//////////////////Methods
    public int getCasetype (int ligne, int colonne){
        return (Royaume.get(colonne-1).get(ligne-1).get(0));
    }
    public int getCaseCouronne (int ligne, int colonne){
        return (Royaume.get(colonne-1).get(ligne-1).get(1));
    }
    
    public void mettreDomino(int ligne, int colonne, int type, int couronne){
        Royaume.get(colonne-1).get(ligne-1).set(0,type);
        Royaume.get(colonne-1).get(ligne-1).set(1,couronne);
        
    }
    

    
    /////////////////////Methods Get and Set
	public int getIdRoyaume() {
		return IdRoyaume;
	}

	public void setIdRoyaume(int idRoyaume) {
		IdRoyaume = idRoyaume;
	}


	public ArrayList<ArrayList<ArrayList<Integer>>> getRoyaume() {
		return Royaume;
	}


	public void setRoyaume(ArrayList<ArrayList<ArrayList<Integer>>> royaume) {
		Royaume = royaume;
	}


	public int getLongRoyaume() {
		return longRoyaume;
	}


	public void setLongRoyaume(int longRoyaume) {
		this.longRoyaume = longRoyaume;
	}
}
