
import java.util.*;
public class Plateau 
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    
    private int IdRoyaume;
    private ArrayList<ArrayList<ArrayList<Integer>>> Royaume ;
    private ArrayList<ArrayList<Integer>> Colonne;
    private ArrayList<Integer> DemiDomino;

    /**
     * Constructeur d'objets de classe plateau
     */
    public Plateau(int j, int id)
    {
      Royaume= new ArrayList<ArrayList<ArrayList<Integer>>>();
      Colonne= new ArrayList<ArrayList<Integer>>();
      DemiDomino= new ArrayList<Integer>();
      DemiDomino.add(0);
      DemiDomino.add(0);
      for (int i=0;i<j;i++){
          Colonne.add(DemiDomino);
        }
      for (int i=0;i<j;i++){
          Royaume.add(Colonne);
      }
      //Pour Choisir une case faire: Royaume.get(colonne-1).get(ligne-1).set(0 ou 1,Valeur)
      IdRoyaume=id;
    }
    
    public int getCasetype (int ligne, int colonne){
        return (Royaume.get(colonne-1).get(ligne-1).get(0));
    }
    public int getCaseCouronne (int ligne, int colonne){
        return (Royaume.get(colonne-1).get(ligne-1).get(1));
    }
    
    public void setRoyaume(int ligne, int colonne, int type, int couronne){
        Royaume.get(colonne-1).get(ligne-1).set(0,type);
        Royaume.get(colonne-1).get(ligne-1).set(1,couronne);
    }
}
