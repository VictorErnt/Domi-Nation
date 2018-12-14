package Jeu;

public class Joueur 
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int IDJoueur;
    private String CouleurRoi;
    

 
    ////////////////Constructor
    public Joueur(int ID, String couleur)
    {
        this.IDJoueur=ID;
        CouleurRoi=couleur;
        
    }

    ///////////////////Methods
   
    
    
    /////////////////Get and Set
        public int getIDJoueur () 
    {
        return IDJoueur;
    }
    
    public String getCouleurRoi (){
        return CouleurRoi;
    }
    

}
