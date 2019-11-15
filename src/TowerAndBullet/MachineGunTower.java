package TowerAndBullet;
import TowerAndBullet.Tower;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MachineGunTower  extends Tower {
    public BufferedImage towerImage;
    public MachineGunTower()  throws IOException {
        super(HIGH_SPEED, HIGHT_RANGE, HIGH_DAMAGE);
        towerImage = ImageIO.read(
                new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile250.png"));
    }
    public void paint(Graphics g){
        g.drawImage(towerImage, x,y,null);
    }
}
