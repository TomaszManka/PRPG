package prpg;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import static prpg.PRPG.enemyX;
import static prpg.PRPG.enemyY;
import static prpg.PRPG.input;
import static prpg.PRPG.playerAgl;
import static prpg.PRPG.playerChr;
import static prpg.PRPG.playerEnd;
import static prpg.PRPG.playerExp;
import static prpg.PRPG.playerHp;
import static prpg.PRPG.playerInt;
import static prpg.PRPG.playerLck;
import static prpg.PRPG.playerLevel;
import static prpg.PRPG.playerMap;
import static prpg.PRPG.playerMaxExp;
import static prpg.PRPG.playerMaxHp;
import static prpg.PRPG.playerPer;
import static prpg.PRPG.playerStr;
import static prpg.PRPG.playerX;
import static prpg.PRPG.playerY;

public class Save
{
    public Save() throws FileNotFoundException
    {
        char pressedKey = (char)input;
        
            switch (pressedKey)
            {
                case 91:
                    
                String savePlayerData = String.valueOf(playerMap)+"\n"+String.valueOf(playerStr)+"\n"+String.valueOf(playerPer)+"\n"+String.valueOf(playerEnd)+"\n"+String.valueOf(playerChr)+"\n"+String.valueOf(playerInt)+"\n"+String.valueOf(playerAgl)+"\n"+String.valueOf(playerLck)+"\n"+String.valueOf(playerMaxHp)+"\n"+String.valueOf(playerHp)+"\n"+String.valueOf(playerLevel)+"\n"+String.valueOf(playerMaxExp)+"\n"+String.valueOf(playerExp)+"\n"+String.valueOf(playerX)+"\n"+String.valueOf(playerY)+"\n";
                String saveEnemyData = String.valueOf(enemyX)+"\n"+String.valueOf(enemyY)+"\n";
                String saveMap = "";
                        
                try (PrintWriter save = new PrintWriter("dataPlayer.txt"))
                {
                    save.println(savePlayerData);
                }
                
                try (PrintWriter save = new PrintWriter("dataEnemy.txt"))
                {
                    save.println(saveEnemyData);
                }
                
                try (PrintWriter save = new PrintWriter("dataMap.txt"))
                {
                    save.println(saveMap);
                }
                
                System.out.println("Zapisano");
                
                break;
            }
    }
}
