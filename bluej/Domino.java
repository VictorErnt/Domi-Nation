
/**
 * Décrivez votre classe domino ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
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
    Random random= new Random();
    private HashMap<Integer,ArrayList<Integer>> biblioDomino = new HashMap<Integer,ArrayList<Integer>>(); 
    
    //Faire le traitement du .csv pour le transformer en bilbliotéque
    
    private final HashMap<Integer,ArrayList<Integer>> refDomino =biblioDomino;//Pour aller chercher la valeur d'un domino
    Stack rdnpioche = new Stack();
    
    public Domino()
    {
        
        
        //Donner le nombre de domino à utiliser
        
    }

    public ArrayList<Integer> returnDomino(int num){
        return refDomino.get(num);
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
        int longueur = biblioDomino.size();
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
        int a=(int)rdnpioche.peek();
        rdnpioche.pop();
        return a;
    }
   
}
    
    

