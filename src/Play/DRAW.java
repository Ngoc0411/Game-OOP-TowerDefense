package Play;
import EnemyType.*;
import ParentObject.GameField;
import ParentObject.GameStage;
import StaticObject.Circle;
import StaticObject.Mountain;
import StaticObject.MyHouse;
import TowerAndBullet.MachineGunTower;
import TowerAndBullet.NormalTower;
import TowerAndBullet.SniperTower;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class DRAW extends JPanel implements Runnable {
    int d =0, x1 = 0 , x2=0, x3=0;
    NormalTower nT = new NormalTower();
    SniperTower sT = new SniperTower();
    MachineGunTower mT = new MachineGunTower();

    NormalEnemy nE = new NormalEnemy();
    SmallerEnemy SE = new SmallerEnemy();
    BossEnemy BE = new BossEnemy();
    Queue<Enemy> list_Enemy = new LinkedList<>();
    Enemy E ;


    GameField GF = new GameField();
    BEGIN bg = new BEGIN();
    Mountain mt = new Mountain();
    Description dc = new Description();
    Menu mn = new Menu();
    MyHouse mh = new MyHouse();

    Circle cr = new Circle();

    Boolean doneClick = false;

    public DRAW() throws IOException {
        Thread threadPlay = new Thread(this);
        threadPlay.start();
        list_Enemy.add(nE);
        list_Enemy.add(BE);
        list_Enemy.add(SE);
        list_Enemy.add(nE);
        list_Enemy.add(BE);
        E = list_Enemy.remove();

    }
    public void paint(Graphics g){
        GF.paint(g);
        if(GameStage.xClick == 0 && GameStage.yClick == 0) bg.paint(g);
        else if(GameStage.xClick >= 544 && GameStage.xClick <= 683 && GameStage.yClick >= 510 && GameStage.yClick <= 587) dc.paint(g);
        else if(GameStage.xClick >= 235 && GameStage.xClick <= 369 && GameStage.yClick >= 507 && GameStage.yClick <= 589){
            GF.paint(g);
            try {
                SE.paint(g);
                BE.paint(g);
                nE.paint(g);
            } catch (IOException e) {
                e.printStackTrace();
            }
            mn.paint(g);
            mh.paint(g);
            mt.paint(g);
            //nT.setXY(GameStage.xClick, GameStage.yClick);
            //nT.paint(g);
        }
      //  if(GameStage.xClick >= 754 && GameStage.xClick <= 786 && GameStage.yClick >= 160 && GameStage.yClick <= 189) doneClick = true;
        if(GameStage.xClick >= 754 && GameStage.xClick <= 786 && GameStage.yClick >= 160 && GameStage.yClick <= 189){
            GF.paint(g);
            try {
                if(SE.getDelete() == false)
                    SE.paint(g);
                if(BE.getDelete() == false)
                    BE.paint(g);
                if(nE.getDelete() == false)
                    nE.paint(g);
            } catch (IOException e) {
                e.printStackTrace();
            }
            mn.paint(g);
            mh.paint(g);
            mt.paint(g);
            nT.setXY(250,180);
            nT.paint(g); //nT.getDamageRange()


            d = (int) Math.sqrt((nT.x - nE.getX())*(nT.x - nE.getX()) + (nT.y - nE.getY())*(nT.y - nE.getY()));
            if(d <= 80){
                x1 ++;
                if(x1==70){
                nE.setDelete(true);
                x1 = 0;
                }
                cr.paint(g);
                g.drawLine(nT.x + 10 ,nT.y + 30,nE.getX() + 30,nE.getY() + 30);

            }
            d = (int) Math.sqrt((nT.getX() - SE.getX())*(nT.getX() - SE.getX()) + (nT.getY() - SE.getY())*(nT.getY() - SE.getY()));
            if(d <= 80){
                x2++;
                if(x2 == 50){
                SE.setDelete(true);
                x2 = 0;}
                cr.paint(g);
                g.drawLine(nT.x + 10 ,nT.y + 30,SE.getX() + 30,SE.getY() + 30);

            }


            d = (int) Math.sqrt((nT.getX() - BE.getX())*(nT.getX() - BE.getX()) + (nT.getY() - BE.getY())*(nT.getY() - BE.getY()));
            if(d <= 80){
                x3++;

                if(x3 == 100){
                BE.setDelete(true);
                x3 = 0;
                }
                cr.paint(g);
                g.drawLine(nT.x + 10 ,nT.y + 30,BE.getX() + 30,BE.getY() + 30);
            }
        }
        if(GameStage.xClick >= 820 && GameStage.xClick <= 860 && GameStage.yClick >= 135 && GameStage.yClick <= 186){
            GF.paint(g);
            try {
                if(SE.getDelete() == false)
                    SE.paint(g);
                if(BE.getDelete() == false)
                    BE.paint(g);
                if(nE.getDelete() == false)
                    nE.paint(g);
            } catch (IOException e) {
                e.printStackTrace();
            }
            mn.paint(g);
            mh.paint(g);
            mt.paint(g);
            sT.setXY(250, 300);
            sT.paint(g); //nT.getDamageRange()

            d = (int) Math.sqrt((sT.x - nE.getX())*(sT.x - nE.getX()) + (sT.y - nE.getY())*(sT.y - nE.getY()));
            if(d <= 80){
                x1 ++;
                if(x1==70){
                nE.setDelete(true);
                x1 = 0;
                }
                cr.setXY(250,300);
                cr.paint(g);
                g.drawLine(sT.x + 20 ,sT.y + 30,nE.getX() + 30,nE.getY() + 30);

            }


            d = (int) Math.sqrt((sT.getX() - SE.getX())*(sT.getX() - SE.getX()) + (sT.getY() - SE.getY())*(sT.getY() - SE.getY()));
            if(d <= 80){
                x2 ++;
                if(x2==50){
                SE.setDelete(true);
                x2 = 0;}
                cr.setXY(250,300);
                cr.paint(g);
                g.drawLine(sT.x + 20 ,sT.y + 30,SE.getX() + 30,SE.getY() + 30);

            }


            d = (int) Math.sqrt((sT.getX() - BE.getX())*(sT.getX() - BE.getX()) + (sT.getY() - BE.getY())*(sT.getY() - BE.getY()));
            if(d <= 80){
                x3++;
                if(x3 == 100){
                BE.setDelete(true);
                x3 = 0;
                }
                cr.setXY(250,300);
                cr.paint(g);
                g.drawLine(sT.x + 20 ,sT.y + 30,BE.getX() + 30,BE.getY() + 30);

            }
        }

        if(GameStage.xClick >= 781 && GameStage.xClick <= 823 && GameStage.yClick >= 214 && GameStage.yClick <= 266){
            GF.paint(g);
            try {
                if(SE.getDelete() == false)
                    SE.paint(g);
                if(BE.getDelete() == false)
                    BE.paint(g);
                if(nE.getDelete() == false)
                    nE.paint(g);
            } catch (IOException e) {
                e.printStackTrace();
            }
            mn.paint(g);
            mh.paint(g);
            mt.paint(g);
            mT.setXY(100, 400);
            mT.paint(g); //nT.getDamageRange()

            d = (int) Math.sqrt((mT.x - nE.getX())*(mT.x - nE.getX()) + (mT.y - nE.getY())*(mT.y - nE.getY()));
            if(d <= 80){
                x1 ++;
                if(x1 == 70){
                nE.setDelete(true);
                x1 = 0;
                }
                cr.setXY(100,400);
                cr.paint(g);
                g.drawLine(mT.x + 30 ,mT.y + 30,nE.getX() + 30,nE.getY() + 30);

            }
            d = (int) Math.sqrt((mT.getX() - SE.getX())*(mT.getX() - SE.getX()) + (mT.getY() - SE.getY())*(mT.getY() - SE.getY()));
            if(d <= 80){
                x2 ++;
                if(x2 == 50){
                SE.setDelete(true);
                x2 = 0;
                }
                cr.setXY(100,400);
                cr.paint(g);
                g.drawLine(mT.x + 30 ,mT.y + 30,SE.getX() + 30,SE.getY() + 30);
            }


            d = (int) Math.sqrt((mT.getX() - BE.getX())*(mT.getX() - BE.getX()) + (mT.getY() - BE.getY())*(mT.getY() - BE.getY()));
            if(d <= 80){
                x3 ++;
                if(x3 == 100){
                BE.setDelete(true);
                x3 = 0;
                }
                cr.setXY(100,400);
                cr.paint(g);
                g.drawLine(mT.x + 30 ,mT.y + 30,BE.getX() + 30,BE.getY() + 30);
            }
        }
    }
    @Override
    public void run() {
        SE.setX(-100);
        BE.setX(-200);
        while(true){
            repaint();
            nE.maketheenemymove();
            SE.maketheenemymove();
            BE.maketheenemymove();
            try {
                Thread.sleep(50);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}