package TowerAndBullet;
import java.util.List;
import ParentObject.GameTile;
import EnemyType.Enemy;

import javax.swing.*;

public class Tower extends GameTile{
    public int x = 0,y = 0;
    public void setY(int y) {
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    final static int HIGH_SPEED = 100;
    final static int HIGHT_RANGE = 100;
    final static int HIGH_DAMAGE = 100;

    final static int LOW_SPEED = 100;
    final static int LOW_RANGE = 100;
    final static int LOW_DAMAGE = 100;

    final static int NORMAL_SPEED = 100;
    final static int NORMAL_RANGE = 100;
    final static int NORMAL_DAMAGE = 100;

    private int shotSpeed;
    private int damageRange;
    private int damage;

    public Tower(int s, int r, int d) {
        this.shotSpeed = s;
        this.damageRange = r;
        this.damage = d;
    }
    public int getShotSpeed() {return this.shotSpeed; }
    public void setShotSpeed(int s) {this.shotSpeed = s; }

    public int getDamageRange() {return this.damageRange; }
    public void setDamageRange(int s) {this.damageRange = s; }

    public int getDamage() {return this.damage;}
    public void setDamage(int s) {this.damage = s;}
}