package EnemyType;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class ListEnemy extends JPanel implements Runnable{
    Queue<NormalEnemy>  list_Enemy = new LinkedList<>();
    NormalEnemy e = new NormalEnemy();

    NormalEnemy nE = new NormalEnemy();

    public ListEnemy() throws IOException {

        Thread threadPlay = new Thread(this);
        threadPlay.start();
    }
    public void paint(Graphics g){
        try {
            nE.paint(g);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void run() {
        while(true){
            repaint();
            if(nE.getY() == 120) nE.increaseX();
            else if(nE.getX() < 213) nE.increaseX();
            else nE.reduceY();
            try {
                Thread.sleep(20);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
