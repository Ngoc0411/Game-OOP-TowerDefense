package StaticObject;

import TowerAndBullet.MachineGunTower;
import TowerAndBullet.NormalTower;
import TowerAndBullet.SniperTower;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Mountain extends JPanel {
    BufferedImage mt1;
    BufferedImage mt2;
    BufferedImage mt3;
    public Mountain() throws IOException {
        mt1 = ImageIO.read(
                new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile135.png"));
        mt2 = ImageIO.read(
                new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile136.png"));
        mt3 = ImageIO.read(
                new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile137.png"));
    }
    public void paint(Graphics g){
        g.drawImage(mt1,100,100,null);
        g.drawImage(mt2,150,100,null);

        g.drawImage(mt2,420,400,null);
        g.drawImage(mt1,380,380,null);
        g.drawImage(mt2,380,430,null);
        g.drawImage(mt3,500,220,null);
    }
}
