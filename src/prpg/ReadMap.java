/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prpg;

import static prpg.PRPG.hitboxXY;
import static prpg.PRPG.mapSizeX;
import static prpg.PRPG.mapSizeY;
import static prpg.PRPG.npcX;
import static prpg.PRPG.npcY;
import static prpg.PRPG.obstacleXY;
import static prpg.PRPG.playerMap;
import static prpg.PRPG.playerX;
import static prpg.PRPG.playerY;
import static prpg.PRPG.enemyX;
import static prpg.PRPG.enemyY;

/**
 *
 * @author Tomasz
 */
public class ReadMap
{
    public ReadMap()
    {
        hitboxXY[npcY][npcX] = 0;
        for (int y=0;y<mapSizeY;y++)
        {
            for (int x=0;x<mapSizeX;x++)
            {
                obstacleXY[y][x] = 0;
                hitboxXY[y][x] = 0;
            }
        }
        
        if (playerX==39&&playerY==15&&playerMap==1)
        {
            playerMap=2;
            playerX=1;
            playerY=15;
            enemyX = 22;
            enemyY = 12;
        }
        else if (playerX==0&&playerY==15&&playerMap==2)
        {
            playerMap=1;
            playerX=38;
            playerY=15;
            enemyX = 10;
            enemyY = 4;
        }
        
        if (playerMap==1)
        {
            //mapa 1
            npcX = 3;
            npcY = 3;
            hitboxXY[npcY][npcX] = 1;
            
            for (int y=0;y<mapSizeY;y++)
            {
                for (int x=0;x<mapSizeX;x++)
                {
                    if (y==0||y==19||x==0||x==39||(x==16&&y>3)||(y==7&&(x>3&&x<15)))
                    {
                        obstacleXY[y][x] = 1;
                        hitboxXY[y][x] = 1;
                    }
                }
            }
            obstacleXY[15][39] = 0;
            hitboxXY[15][39] = 0;
        }
        else if (playerMap==2)
        {
            //mapa 2
            npcX = 5;
            npcY = 5;
            hitboxXY[npcY][npcX] = 1;
            
            for (int y=0;y<mapSizeY;y++)
            {
                for (int x=0;x<mapSizeX;x++)
                {
                    if (y==0||y==19||x==0||x==39||(x==14&&y>5)||(y==10&&(x>2&&x<15)))
                    {
                        obstacleXY[y][x] = 1;
                        hitboxXY[y][x] = 1;
                    }
                }
            }
            obstacleXY[15][0] = 0;
            hitboxXY[15][0] = 0;
        }
    }
}
