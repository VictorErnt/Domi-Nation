
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
	private int NbDomino;
    Random random= new Random();
    private HashMap<Integer,ArrayList<Integer>> biblioDomino; 
    
    //Faire le traitement du .csv pour le transformer en bilbliot�que
    
    private final HashMap<Integer,ArrayList<Integer>> refDomino; 
    Stack<Integer> rdnpioche;
    
    
    ///////////////////Constructor
    public Domino(int NbDomino)
    {
    	biblioDomino = new HashMap<Integer,ArrayList<Integer>>(); 
    	refDomino =biblioDomino;//Pour aller chercher la valeur d'un domino
    	rdnpioche = new Stack<Integer>();
        //Donner le nombre de domino � utiliser
        this.NbDomino=NbDomino;
    }

    
    //////////////////Methods
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
        return rdnpioche.pop();
    }
    
    public boolean questionPioche() {//False si la liste est vide 
    	if(rdnpioche.size()==0) {
    		return false;
    	}
    	else {
    		return true;
    	}
    }
    
   ///////////////////Get and Set
    public  HashMap<Integer,ArrayList<Integer>> getRefDomino(){
    	return refDomino;
    }
    
    //cr�ation dela lib avec tous les dominos
    //import csv
    public class Csvv throws Exception 
    {

		BufferedReader br = new BufferedReader(new FileReader("dominos.csv"));
		String domuni = null;
		Map<Integer, ArrayList> domino = new HashMap<>();
		int k=0;

		//R�cup�ration de toutes les donn�es du fichier_______________
		while ((domuni = br.readLine()) != null)
		{
			String data = Arrays.toString(domuni.split(" , "));

			String [] dom = new  String[4];

			for(int j=0; j<4; j++)
				{
					if( j==0) data.replaceAll("\\[", " ");
					dom[j] = data.split(",")[j];
				}

			ArrayList<String> domin = new ArrayList<String>(Arrays.asList(dom));	
			domino.put(k, domin);
			k++;
		}
		br.close();
		domino.remove(0);
		
	}
   
}

    
    

