package JeuV2;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main {

	public static void main(String[] args) {
		try {
			AppGameContainer apg=new AppGameContainer(new Graphique("Mon super jeu"));
			apg.setDisplayMode(800, 600, false);//Width/ height/Fullscreen
			apg.start();
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

}
