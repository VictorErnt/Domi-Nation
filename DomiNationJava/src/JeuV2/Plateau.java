package JeuV2;

import java.util.*;
public class Plateau 
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    
    private int longRoyaume;
    DemiDomino[][] royaume; 

   /////////////////Constructor
    public Plateau(int longRoyaume)
    {
    	royaume= new DemiDomino[longRoyaume][longRoyaume];
    	this.longRoyaume=longRoyaume;
    }
    
   
	//////////////////Methods
    
    public void mettreDomino(int ligne, int colonne, DemiDomino demi){
        royaume[ligne-1][colonne-1]=demi;
    }

    public DemiDomino renvoieCase(int ligne, int colonne) {
    	return royaume[ligne-1][colonne-1];
    }

    /////////////////////Methods Get and Set
	public int getLongRoyaume() {
		return longRoyaume;
	}


	public DemiDomino[][] getRoyaume() {
		return royaume;
	}


	public void setLongRoyaume(int longRoyaume) {
		this.longRoyaume = longRoyaume;
	}


	public void setRoyaume(DemiDomino[][] royaume) {
		this.royaume = royaume;
	}
    

    

}
