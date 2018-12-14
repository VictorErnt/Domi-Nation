package Jeu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Csvv extends Exception {
	private int k = 0;
	private Map<Integer, ArrayList> domino;
	private String domuni = null;

	public Csvv() {
		this.domino = new HashMap<>();
		BufferedReader br = null;
		// Récupération de toutes les données du fichier_______________
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\leont\\Desktop\\Github\\Domi-Nation\\dominos.csv"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println("Erreur d'ouverture");
		}
		try {

			ArrayList<String> domin;
			while ((domuni = br.readLine()) != null) {
				
				String data = Arrays.toString(domuni.split(" , "));

				String[] dom = new String[4];

				for (int j = 0; j < 4; j++) {
					//if (j == 0)
						data.replaceAll("\\[", " ");
				}

				domin = new ArrayList<String>(Arrays.asList(dom));

				domino.put(k, domin);
				k++;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		domino.remove(0);

	}

	public Map<Integer, ArrayList> getDomino() {
		return domino;
	}

	public void setDomino(Map<Integer, ArrayList> domino) {
		this.domino = domino;
	}
}
