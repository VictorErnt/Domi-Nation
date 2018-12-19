package JeuV2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;


public class Pioche {
	Random random;
	Tuile deck[];
	ArrayList<Tuile> deckList;
	Stack<Tuile> rdnPioche;
	int nbDominoJeu;
	
	public Pioche(Tuile[] deck,int nbDominoJeu) {
		this.deck=deck;
		deckList=new ArrayList<Tuile>();
		deckList=mettreArray(deck,deckList);
		this.nbDominoJeu=nbDominoJeu;
		rdnPioche=new Stack<Tuile>();
		random= new Random();
		
	}
	
	public ArrayList<Tuile> mettreArray(Tuile[] deck,ArrayList<Tuile> list) {
		list= new ArrayList<Tuile>();
		for(int k=0; k<deck.length;k++) {
			list.add(deck[k]);
		}
		return list;
	}

    public void iniPioche(){
        int r=0;
        int L=0; 
        for(int i=1; i<=nbDominoJeu;i++) {
            L=deckList.size();
            do {
                r=random.nextInt(L+1);
            }while(r==0);
            this.rdnPioche.push(deckList.get(r));
            deckList.remove(r);
        }
        
    }
    
    public Tuile Piocher(){
        return rdnPioche.pop();
    }
    
    public boolean questionPioche() {//False si la liste est vide 
    	if(rdnPioche.size()==0) {
    		return false;
    	}
    	else {
    		return true;
    	}
    }
    

}
