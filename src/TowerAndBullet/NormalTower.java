package TowerAndBullet;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class NormalTower extends Tower{
    public BufferedImage towerImage;
    public NormalTower()  throws IOException {
        super(NORMAL_SPEED, NORMAL_RANGE, NORMAL_DAMAGE);
         towerImage = ImageIO.read(
                new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile206.png"));
    }
    public void paint(Graphics g){
        g.drawImage(towerImage, x,y,null);
    }
}
