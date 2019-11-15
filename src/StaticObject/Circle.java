package StaticObject;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Circle extends JPanel {
    BufferedImage cir;
    int x = 250 , y= 180;
    public Circle() throws IOException {
        cir = ImageIO.read(
                new File("C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile309.png"));
    }
    public void paint(Graphics g){
        g.drawImage(cir, x - 50,y - 50,150,150,null);
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
}
