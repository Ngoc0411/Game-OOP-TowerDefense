package EnemyType;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class NormalEnemy extends Enemy{
    public BufferedImage towerImage;
    public BufferedImage towerImage2;

    public boolean Deleteyesorno = false;
    public NormalEnemy() throws IOException {

        super(BASIC_BLOOD, BASIC_MOVESPEED, BASIC_ARMOR, BASIC_REWARD);
        towerImage = ImageIO.read(
                new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile245.png"));
        towerImage2 = ImageIO.read(
                new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile300.png"));
        this.setXY(-200,343);
    }
    public void paint(Graphics g) throws IOException {
        if(getX() >= 213 && getY() > 121) g.drawImage(towerImage2, x, y,null);
        else g.drawImage(towerImage, x, y,null);
    }
    public void increaseX(){
        x += 2;
    }
    public void reduceY(){
        y -= 2;
    }
    public void maketheenemymove(){
        if(this.getY() == 121) this.increaseX();
        else if(this.getX() < 213) this.increaseX();
        else this.reduceY();
    }

}