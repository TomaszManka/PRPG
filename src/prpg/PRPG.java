package prpg;

import javax.swing.JFrame;

public class PRPG
{
    static int playerMap = 2;
    
    static int playerStr = 5;
    static int playerPer = 5;
    static int playerEnd = 10;
    static int playerChr = 5;
    static int playerInt = 5;
    static int playerAgl = 5;
    static int playerLck = 5;
    static int playerMaxHp = playerEnd*10;
    static int playerHp = playerMaxHp;
    static int playerLevel = 1;
    static int playerMaxExp = playerLevel*10;
    static int playerExp = 0;
    
    static final int maxMapSizeX = 200;
    static final int maxMapSizeY = 200;
    
    static int mapSizeX = 40;
    static int mapSizeY = 20;
    
    static int input = 0;
    static int fight = 0;
    static int playerAction = 0;
    static int playerAttack = 0;
    static int selectEnemy = 0;
    static int fightWindowStatus = 0;
    static int fightWindowX = 0;
    static int fightWindowY = 0;
    
    static int playerX = 2;
    static int playerY = 2;
    static int enemyX = 22;
    static int enemyY = 12;
    static int npcX = 3;
    static int npcY = 3;
    
    static int[][] obstacleXY = new int [maxMapSizeY][maxMapSizeX];
    static int[][] hitboxXY = new int [maxMapSizeY][maxMapSizeX];
    
    public static void main(String[] args)
    {
        Window ramka = new Window();
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.show();
    }
}
    

