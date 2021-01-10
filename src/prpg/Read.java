package prpg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
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
import static prpg.PRPG.enemyX;
import static prpg.PRPG.enemyY;
import static prpg.Window.tempo1;
import static prpg.Window.tempoHP;

public class Read
{
    public Read() throws FileNotFoundException
    {
        char pressedKey = (char)input;
        
            switch (pressedKey)
            {
            case 93:
                Scanner scanner = new Scanner(new File("dataPlayer.txt"));
                playerMap = Integer.parseInt(scanner.nextLine());

                playerStr = Integer.parseInt(scanner.nextLine());
                playerPer = Integer.parseInt(scanner.nextLine());
                playerEnd = Integer.parseInt(scanner.nextLine());
                playerChr = Integer.parseInt(scanner.nextLine());
                playerInt = Integer.parseInt(scanner.nextLine());
                playerAgl = Integer.parseInt(scanner.nextLine());
                playerLck = Integer.parseInt(scanner.nextLine());

                playerMaxHp = Integer.parseInt(scanner.nextLine());
                playerHp = Integer.parseInt(scanner.nextLine());
                playerLevel = Integer.parseInt(scanner.nextLine());
                playerMaxExp = Integer.parseInt(scanner.nextLine());
                playerExp = Integer.parseInt(scanner.nextLine());
                playerX = Integer.parseInt(scanner.nextLine());
                playerY = Integer.parseInt(scanner.nextLine());
                scanner.close();
                
                scanner = new Scanner(new File("dataEnemy.txt"));
                enemyX = Integer.parseInt(scanner.nextLine());
                enemyY = Integer.parseInt(scanner.nextLine());
                scanner.close();
                
                tempoHP.setText("Życie: "+playerHp+'\n'+"Poziom: "+playerLevel+'\n'+"Doświadczenie: "+playerExp+"/"+playerMaxExp);
                tempo1.setText("STR " + playerStr + ", PER " + playerPer + ", END " + playerEnd + ", CHR " + playerChr + ", INT " + playerInt + ", AGL " + playerAgl + ", LCK " + playerLck);
                
                System.out.println("Wczytano");
                
                break;
            }
    }
}
