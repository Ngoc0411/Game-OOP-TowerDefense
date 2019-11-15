package ParentObject;

import javax.swing.*;
import java.awt.*;

public abstract class GameEntity{
    private	int x;
    private	int y;
    private	int width;
    private	int height;

    public void setX(int x) {this.x = x;}
    public int getX() {return this.x;}

    public void setY(int x) {this.y = x;}
    public int getY() {return this.y;}

    public void setXY(int x, int y) {this.x = x; this.y = y;}

    public void setWidth(int x) {this.width = x;}
    public int getWidth() {return this.width;}

    public void setHeight(int x) {this.height = x;}
    public int getHeight() {return this.height;}


}