package Play;

import EnemyType.BossEnemy;
import EnemyType.NormalEnemy;
import EnemyType.SmallerEnemy;
import ParentObject.GameStage;
import TowerAndBullet.NormalTower;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Play extends JPanel{
    NormalTower nT = new NormalTower();
    NormalEnemy nE = new NormalEnemy();
    SmallerEnemy SE = new SmallerEnemy();
    BossEnemy BE = new BossEnemy();
    DRAW dr = new DRAW();
    public Play() throws IOException {
         add(dr);
    }

}
