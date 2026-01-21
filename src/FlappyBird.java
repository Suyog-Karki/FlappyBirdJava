import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;



public class FlappyBird extends JPanel implements ActionListener,KeyListener{
    int boardWidth= 360;
    int boardHeight= 640;
    //initializing images
    Image bgImg;
    Image birdImg;
    Image topPipeImg;
    Image bottomPipeImg;

    //bird change
    int birdX=boardWidth/8;
    int birdY=boardHeight/2;
    int birdWidth=34;
    int birdHeight=24;




    class Bird{
        int x=birdX;
        int y=birdY;
        int width=birdWidth;
        int height=birdHeight;
        Image img;
        Bird(Image img){
            this.img= img;

        }
    }

    Bird bird;
    int velocityY = -6;
    int gravity =1;


    //game timing
    Timer gameLoop;



    FlappyBird(){
        setPreferredSize(new Dimension(boardWidth,boardHeight));
        setBackground(Color.blue);

        //adding images
        bgImg= new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        birdImg= new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
        topPipeImg= new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        bottomPipeImg= new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

        //bird
        bird=new Bird(birdImg);
        //timing
        gameLoop=new Timer(1000/60,this);
        gameLoop.start();



    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g)
    {
        System.out.println("draw");
        g.drawImage(bgImg,0,0,boardWidth,boardHeight,null);

        //adding bird
        g.drawImage(birdImg,bird.x,bird.y,bird.width,bird.height,null);
    }
    public void move(){
        //bird
//        velocityY += gravity;
        bird.y+= velocityY;
        bird.y= Math.max(bird.y,0);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        move();
        repaint();

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


}
