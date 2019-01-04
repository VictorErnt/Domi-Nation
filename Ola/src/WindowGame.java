
import org.newdawn.slick.*;

public class WindowGame extends BasicGame {
    public WindowGame() {
        super("Lesson 1 :: WindowGame");
    }
    private GameContainer container;
    @Override
    public void init(GameContainer container) throws SlickException {
        this.container = container;
    }

    @Override
    public void render(GameContainer container, Graphics g) throws SlickException {
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException {
    }
    @Override
    public void keyReleased(int key, char c) {
        if (Input.KEY_ESCAPE == key) {
            container.exit();
        }
    }


}