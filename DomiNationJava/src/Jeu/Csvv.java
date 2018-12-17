package Jeu;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Csvv {
	//Lecture du fichier
	
	public Csvv(HashMap<Integer, ArrayList<Integer>> domino)
	{
		 
		try {
			domino=main(domino);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Erreur de création de biblioteque");
		}
	}
	public HashMap<Integer, ArrayList<Integer>> main(HashMap<Integer,ArrayList<Integer>> domino) throws Exception 
	{

		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\leont\\Desktop\\Github\\Domi-Nation\\DomiNationJava\\src\\Test\\dominos.csv"));
		String domuni = null;
		//Map<Integer, ArrayList> domino = new HashMap<>();
		int k=1;

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
		
			
			dominNb.add(Integer.parseInt(String.valueOf(domin.get(0).charAt(1)),10));  
			dominNb.add(Integer.parseInt(domin.get(1),10)); 
			dominNb.add(Integer.parseInt(domin.get(2),10)); 
			dominNb.add(Integer.parseInt(String.valueOf(domin.get(3).charAt(0)),10));  
			domino.put(k, dominNb);
			
	
			k++;
		}
		br.close();
		//System.out.println(domino);
		return domino;
	}

}