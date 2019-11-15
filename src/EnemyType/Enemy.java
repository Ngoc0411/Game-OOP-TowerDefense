package EnemyType;

import ParentObject.GameEntity;

import java.awt.*;
import java.io.IOException;

public abstract class Enemy{

    private int blood, moveSpeed, armor, reward;
    public boolean Deleteyesorno = false;
    public int x, y;

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setX(int x){this.x = x;}
    public void setY(int y){this.y = y;}
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setDelete(Boolean b){
        Deleteyesorno = b;
    }
    public boolean getDelete(){
        return Deleteyesorno;
    }

    final static int HIGH_BLOOD = 100;
    final static int HIGH_ARMOR = 100;
    final static int HIGH_REWARD = 100;
    final static int HIGH_MOVESPEED = 4;

    final static int LOW_BLOOD = 10;
    final static int LOW_ARMOR = 10;
    final static int LOW_REWARD = 10;
    final static int LOW_MOVESPEED = 2;

    final static int BASIC_BLOOD = 50;
    final static int BASIC_ARMOR = 50;
    final static int BASIC_REWARD = 50;
    final static int BASIC_MOVESPEED = 3;


    public Enemy(int b, int m, int a, int r){
        this.blood = b;
        this.moveSpeed = m;
        this.armor = a;
        this.reward = r;
    }

    public Enemy() {

    }

    public void setBlood(int x){this.blood = x;}
    public int getBlood(){return this.blood;}

    public void setMoveSpeed(int x){this.moveSpeed = x;}
    public int getMoveSpeed(){return this.moveSpeed;}

    public void setArmor(int x){this.armor = x;}
    public int getArmor(){return this.armor;}

    public void setReward(int x){this.reward = x;}
    public int getReward(){return this.reward;}

    public boolean isDead(){
        return (this.getBlood() <= 0);
    }

    /*public void move(int dir_x, int dir_y){
        this.setX(this.getX() + dir_x);
        this.setY(this.getY() + dir_y);
    } */

	/*public boolean hitTarget(Target target){
		return (this.getX() == target.getX() && this.getY() == target.getY());
	}*/
    public abstract void paint(Graphics g) throws IOException;
}
