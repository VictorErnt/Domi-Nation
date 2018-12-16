
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Csvv {
	//Lecture du fichier

	public static void main(String[] args) throws Exception 
	{

		BufferedReader br = new BufferedReader(new FileReader("dominos.csv"));
		String domuni = null;
		Map<Integer, ArrayList> domino = new HashMap<>();
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
		
			
			dominNb.add(Integer.parseInt(String.valueOf(domin.get(0).charAt(1)),10));  
			dominNb.add(Integer.parseInt(domin.get(1),10)); 
			dominNb.add(Integer.parseInt(domin.get(2),10)); 
			dominNb.add(Integer.parseInt(String.valueOf(domin.get(3).charAt(0)),10));  
			domino.put(k, dominNb);
			
	
			k++;
		}
		br.close();
		domino.remove(0);
		System.out.println(domino);
	}

}// end CVSFile