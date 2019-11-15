package Play;

import TowerAndBullet.MachineGunTower;
import TowerAndBullet.NormalTower;
import TowerAndBullet.SniperTower;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BEGIN extends JPanel {
    BufferedImage begin;

    public BEGIN() throws IOException {
        begin = ImageIO.read(
                new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile305.png"));
    }
    public void paint(Graphics g){
        g.drawImage(begin,0,0, 900,600,null);
    }

}
