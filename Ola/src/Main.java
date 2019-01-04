import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main
{
    static private AppGameContainer app;

    public static void main( String[] args ) throws SlickException
    {
        app = new AppGameContainer( new WindowGame() );
        app.setDisplayMode( 640, 480, false );
        app.start();
    }
}