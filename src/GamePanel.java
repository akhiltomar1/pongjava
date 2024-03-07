import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel implements Runnable {

    static final int gamewidth = 1000;
    static final int gameheight = (int)(gamewidth * (0.5));
    static final Dimension screensize = new Dimension(gamewidth,gameheight);
    static final int balld = 20;
    static final int paddlew = 25;
    static final int paddleh = 100;
    Thread gameThread;
    Image image;
    Graphics graphics;
    Paddle p1;
    Paddle p2;
    Ball ball;
    Score score;

    GamePanel(){

        newpaddles();
        newball();
        score = new Score(gamewidth,gameheight);
        this.setFocusable(true);
        this.addKeyListener(new AL());
        this.setPreferredSize(screensize);

        gameThread = new Thread(this);
        gameThread.start();


    }

    public void newball(){

    }
    public void newpaddles(){

    }
    public void paint(Graphics g){

        image = createImage(getWidth(),getHeight());
        graphics = image.getGraphics();
        draw(graphics);
        g.drawImage(image,0,0,this);
    }

    public void draw(Graphics g){



    }
    public void move(){

    }
    public void checkCollision(){

    }
    public void run(){

        long lastTime = System.nanoTime();

    }

    public class AL extends KeyAdapter{
        public void keyPressed(KeyEvent e){

        }
        public void keyReleased(KeyEvent e){

        }
    }


}
