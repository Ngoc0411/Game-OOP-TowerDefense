package StaticObject;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyHouse extends JPanel {
    BufferedImage myhouseimage;
    public MyHouse() throws IOException {
        myhouseimage = ImageIO.read(
                new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile302.png"));
    }
    public void paint(Graphics g){
        g.drawImage(myhouseimage,620,95, 90, 80,null);
    }

}
