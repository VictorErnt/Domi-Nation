package JeuV2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Csvv {
	//Lecture du fichier
	private Tuile[] tuiles;
	private DemiDomino[] demiDom;
	
	public  Csvv()  throws Exception 
	{
		tuiles= new Tuile[48]; //indice de 0 à 47
		demiDom=new DemiDomino[2];
	
	
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Victor\\Desktop\\GitHub\\Domi-Nation\\DomiNationJava\\src\\JeuV2\\dominos.csv"));
		String domuni = null;
		int k=0;

		//Récupération de toutes les données du fichier_______________
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
			ArrayList<Integer> dominNb = new ArrayList<Integer>();
		
			demiDom[0]=new DemiDomino (Integer.parseInt(String.valueOf(domin.get(0).charAt(1)),10), domin.get(1));
			demiDom[1]=new DemiDomino (Integer.parseInt(String.valueOf(domin.get(2).charAt(0)),10), domin.get(3));
			tuiles[k]=new Tuile (demiDom[0],demiDom[1]);

			//System.out.println(demiDom[0]);
			k++;
		}
		br.close();
		//System.out.println(tuile);
		return ;
	}

	public Tuile[] getTuiles() {
		return tuiles;
	}

	public void setTuiles(Tuile[] tuile) {
		this.tuiles = tuile;
	}


}