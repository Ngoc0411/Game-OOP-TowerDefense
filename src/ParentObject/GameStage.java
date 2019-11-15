package ParentObject;

import Play.DRAW;
import Play.Play;
import Play.Sound_cdjv;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.swing.*;


public class GameStage extends JFrame{
    DRAW dr = new DRAW();
    Play pl = new Play();
    Sound_cdjv sound = new Sound_cdjv("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\ThienAmTu-DangCapNhat_38yhd_hq.wav");

    public static int xClick = 0 ,yClick = 0 ;
    public GameStage() throws IOException {
        setTitle("Tower Defense");
        setSize(900, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println(e.getButton());
                if(e.getButton() == 1){
                    xClick = e.getX();
                    yClick = e.getY();
                    System.out.println("L: " + xClick + "," + yClick);
                }
            }
        });



        add(dr);
        sound.start();
       // sound.suspend();
       // sound.resume();
    }
    public static void main (String[] args) throws IOException {
       GameStage gst = new GameStage();
    }

}