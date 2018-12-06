
/**
 * Décrivez votre classe joueur ici.
 *
 * @author JALEF
 * @version 03/12/2018
 */
public class Joueur 
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int IDJoueur;
    private String CouleurRoi;
    

    /**
     * Constructeur d'objets de classe joueur
     */
    public Joueur(int ID, String couleur)
    {
        this.IDJoueur=ID;
        CouleurRoi=couleur;
        
        
    }

        public int getIDJoueur () 
    {
        return IDJoueur;
    }
    
    public String getCouleurRoi (){
        return CouleurRoi;
    }
    

}
