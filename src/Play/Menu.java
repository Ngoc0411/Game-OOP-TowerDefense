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

public class Menu extends JPanel {
    BufferedImage menu, menu2, stop, start;
    NormalTower NT = new NormalTower();
    SniperTower ST = new SniperTower();
    MachineGunTower MT = new MachineGunTower();

    public Menu() throws IOException {
    menu = ImageIO.read(
            new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile301.png"));
    menu2 = ImageIO.read(
            new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile267.png"));
    stop = ImageIO.read(
                new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile307.png"));
    start = ImageIO.read(
                new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile308.png"));
    }
    public void paint(Graphics g){
        g.drawImage(menu,704,0, 182,580,null);
        g.drawImage(menu2,0,484, 704,116,null);
       // g.drawImage(stop,0,485, 80,80,null);
      //  g.drawImage(start,280,485, 80,80,null);
        NT.setXY(730, 110);
        NT.paint(g);
        ST.setXY(800, 100);
        ST.paint(g);
        MT.setXY(765, 180);
        MT.paint(g);
    }

}
