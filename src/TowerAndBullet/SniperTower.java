package TowerAndBullet;
import TowerAndBullet.Tower;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SniperTower extends Tower{
    public BufferedImage towerImage;
    public SniperTower()  throws IOException {
        super(LOW_SPEED, LOW_RANGE, LOW_DAMAGE);
        towerImage = ImageIO.read(
                new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile249.png"));
    }
    public void paint(Graphics g){
        g.drawImage(towerImage, x,y,null);
    }
}
