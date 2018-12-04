
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
     * 1=Chateau
     * 2=Mer
     * 3=Foret
     * 4=Prairie
     * 5=Montagne
     * 6=Champs
     * 7=Mine
     */
    
    private HashMap<Integer,ArrayList<Integer>> Domino = new HashMap<Integer,ArrayList<Integer>>(); 
    
    public Domino()
    {
        // initialisation des variables d'instance
        
    }

    public ArrayList<Integer> returnDomino(int num){
        return Domino.get(num);
    }
}
