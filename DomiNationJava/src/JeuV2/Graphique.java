package JeuV2;



import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;


public class Graphique extends BasicGame{
	private int squareX;

	public Graphique(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		// TODO Auto-generated method stub
		arg1.setColor(Color.white);
		arg1.drawString("Hello",50,50);
		
		arg1.setColor(Color.green);
		arg1.fillRect(squareX, 60, 100, 200);//x y witdh height
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub
		squareX=0;
		
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub
		Input input=arg0.getInput();//rentre des input d'un controller
		if(input.isKeyDown(Input.KEY_SPACE)) {//Si la touche espace est enfoncé 
			System.out.println("space press");
			squareX++;
		}
	}
	
	

}
