
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
    public Plateau(int longRoyaume, int id)
    {
    	this.longRoyaume=longRoyaume;
      Royaume= new ArrayList<ArrayList<ArrayList<Integer>>>();
      Colonne= new ArrayList<ArrayList<Integer>>();
      DemiDomino= new ArrayList<Integer>();
      DemiDomino.add(0);
      DemiDomino.add(0);
      for (int i=0;i<longRoyaume;i++){
          Colonne.add(DemiDomino);
        }
      for (int i=0;i<longRoyaume;i++){
          Royaume.add(Colonne);
      }
      //Pour Choisir une case faire: Royaume.get(colonne-1).get(ligne-1).set(0 ou 1,Valeur)
      setIdRoyaume(id);
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
    

    public int ScoreRoyaume() {
    	ArrayList<ArrayList<Integer>> notéGlobal=new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> nulle=new ArrayList<Integer>();
    	for(int ligne=0; ligne<longRoyaume;ligne++) {
    		for(int colonne=0;colonne<longRoyaume;colonne++) {
    			
    			int type=getCasetype(ligne,colonne);
    			int couronne=getCaseCouronne(ligne,colonne);
    			
    			if (type==0 || type==1) {}
    			else {
    				try {
    				//Case du haut
    				int typeH=getCasetype(ligne,colonne-1);
        			int couronneH=getCaseCouronne(ligne,colonne-1);
        			
        			if(typeH==type) {
        				
        			}
        			
    				}catch(Exception e){
    					int typeH=0;
    					int couronneH=0;
    				}
    				try {
        			//Case du bas
        			int typeB=getCasetype(ligne,colonne+1);
        			int couronneB=getCaseCouronne(ligne,colonne+1);
    				}catch(Exception e){
    					int typeB=0;
    					int couronneB=0;
    				}
    				try {
        			//Case de gauche
        			int typeG=getCasetype(ligne-1,colonne);
        			int couronneG=getCaseCouronne(ligne-1,colonne);
    				}catch(Exception e){
    					int typeG=0;
    					int couronneG=0;
    				}
    				try {
        			//Case de droite
        			int typeD=getCasetype(ligne+1,colonne);
        			int couronneD=getCaseCouronne(ligne+1,colonne);
    				}catch(Exception e) {
    					int typeD=0;
    					int couronneD=0;
    				}
    				
    			}
    			
    		}
    	}
    	return 0;
    }
    
    
    
    
    /////////////////////Methods Get and Set
	public int getIdRoyaume() {
		return IdRoyaume;
	}

	public void setIdRoyaume(int idRoyaume) {
		IdRoyaume = idRoyaume;
	}
}
