package ParentObject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GameField {
    private List<ArrayList<BufferedImage>> MAP = new ArrayList <ArrayList <BufferedImage>> ();

    public GameField() throws IOException {
        String s = "C:\\Users\\phamv\\IdeaProjects\\TowerDefense\\Default size\\towerDefense_tile";
        String str = ".png";
        BufferedImage icon1 = ImageIO.read(new File(s + "222" + str));
        BufferedImage icon2 = ImageIO.read(new File(s + "055" + str));
        for(int i = 0; i < 16; i++){
            ArrayList<BufferedImage> Array_BIM = new ArrayList<>();
            for(int j = 0; j < 11; j++){
                BufferedImage bIm;
                if(j == 8){
                    if(i >= 0 && i <= 5)
                     bIm = icon2;
                    else bIm = icon1;
                }else if(i == 5){
                     if(j >= 3 && j <= 8)
                         bIm = icon2;
                     else bIm = icon1;
                }else if(j == 3){
                    if(i >= 5)
                        bIm = icon2;
                    else bIm = icon1;
                }else  bIm = icon1;

                Array_BIM.add(bIm);
            }
            MAP.add(Array_BIM);
        }
    }

    public BufferedImage getAt(int i, int j) {
        return MAP.get(i).get(j);
    }

    public void paint(Graphics g){
        int x = 0, y = 0;
        for(int j = 0; j < 11; j++)
        {
            for(int i = 0; i < 16; i++) {
                g.drawImage(MAP.get(i).get(j), x*44, y*44, 44,44, null);
                x ++;
            }
        x = 0;
        y++;
        }
     }
}

