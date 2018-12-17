package Jeu;

public class Joueur 
{
    
    private int IDJoueur;
    private String CouleurRoi;
    private Plateau royaume;

 
    ////////////////Constructor
    public Joueur(int ID, String couleur,Plateau royaume)
    {
        this.IDJoueur=ID;
        CouleurRoi=couleur;
        this.royaume=royaume;
        
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

	public Plateau getRoyaume() {
		return royaume;
	}

	public void setIDJoueur(int iDJoueur) {
		IDJoueur = iDJoueur;
	}

	public void setCouleurRoi(String couleurRoi) {
		CouleurRoi = couleurRoi;
	}

	public void setRoyaume(Plateau royaume) {
		this.royaume = royaume;
	}
    

}
