import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			AppGameContainer apg=new AppGameContainer(new Jeu("Mon super jeu"));
			apg.setDisplayMode(800, 600, false);//Width/ height/Fullscreen
			apg.start();
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
