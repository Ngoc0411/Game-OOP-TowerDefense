package EnemyType;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BossEnemy extends Enemy{
    public BufferedImage towerImage;
    public BufferedImage towerImage2;
    public BossEnemy() throws IOException {
        super(HIGH_BLOOD, HIGH_MOVESPEED, HIGH_ARMOR, HIGH_REWARD);
        towerImage = ImageIO.read(
                new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile246.png"));
        towerImage2 = ImageIO.read(
                new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile303.png"));
        setXY(0,330);
    }
    public void paint(Graphics g) throws IOException {
        if(getX() >= 197 && getY() > 110) g.drawImage(towerImage2, x,y,90,90,null);
        else g.drawImage(towerImage, x,y, 90,90,null);
    }
    public void increaseX(){
        x ++;
    }
    public void reduceY(){
        y --;
    }

    public void maketheenemymove(){
        if(this.getY() == 110) this.increaseX();
        else if(this.getX() < 197) this.increaseX();
        else this.reduceY();

    }

}