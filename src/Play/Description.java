package Play;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Description extends JPanel {
    BufferedImage describe;
    BufferedImage describe2;
    public Description() throws IOException {
        describe = ImageIO.read(
                new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile306.png"));
        describe2 = ImageIO.read(
                new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile162.png"));
    }
    public void paint(Graphics g){
        g.drawImage(describe2,0,0, 900,600,null);
        g.drawImage(describe,280,0, 350,580,null);
    }

}
