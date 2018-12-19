package Jeu;

import JeuV2.Plateau;

public class Joueur 
{
    
  
    private String CouleurRoi;
    private Plateau royaume;

 
    ////////////////Constructor
    public Joueur(Plateau royaume)
    {
        
        //CouleurRoi=couleur;
        this.royaume=royaume;
        
    }

    ///////////////////Methods
   
    
    
    /////////////////Get and Set
  
    public String getCouleurRoi (){
        return CouleurRoi;
    }

	public Plateau getRoyaume() {
		return royaume;
	}



	public void setCouleurRoi(String couleurRoi) {
		CouleurRoi = couleurRoi;
	}

	public void setRoyaume(Plateau royaume) {
		this.royaume = royaume;
	}
    

}
