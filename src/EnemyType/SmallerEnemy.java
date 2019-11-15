package EnemyType;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class SmallerEnemy extends Enemy{
    public BufferedImage towerImage;
    public BufferedImage towerImage2;
    public boolean Deleteyesorno = false;
    public SmallerEnemy() throws IOException {
        super(LOW_BLOOD, LOW_MOVESPEED, LOW_ARMOR, LOW_REWARD);
        towerImage = ImageIO.read(
                new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile247.png"));
        towerImage2 = ImageIO.read(
                new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile304.png"));
        setXY(-1000,343);
    }
    public void paint(Graphics g) throws IOException {
        if(getX() >= 213 && getY() > 120) g.drawImage(towerImage2, x,y,null);
        else g.drawImage(towerImage, x,y,null);
    }
    public void increaseX(){
        x ++;
    }
    public void reduceY(){
        y --;
    }

    public void maketheenemymove(){
        if(this.getY() == 120) this.increaseX();
        else if(this.getX() < 213) this.increaseX();
        else this.reduceY();
    }
}