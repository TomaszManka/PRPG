package prpg;

import java.util.Random;
import static prpg.Window.showPosition;
import static prpg.PRPG.playerAction;
import static prpg.PRPG.playerAttack;
import static prpg.PRPG.selectEnemy;
import static prpg.PRPG.fight;
import static prpg.PRPG.playerAgl;
import static prpg.PRPG.playerChr;
import static prpg.PRPG.playerEnd;
import static prpg.PRPG.playerExp;
import static prpg.PRPG.playerHp;
import static prpg.PRPG.playerInt;
import static prpg.PRPG.playerLck;
import static prpg.PRPG.playerLevel;
import static prpg.PRPG.playerMaxExp;
import static prpg.PRPG.playerPer;
import static prpg.PRPG.playerStr;
import static prpg.PRPG.enemyX;
import static prpg.PRPG.enemyY;

public class FightEnemy
{
    static int enemyGender = 0;
    static String genderAttack = "zaatakowała/zaatakował";
    static String genderDefeat = "została pokonana/został pokonany";
    
    private int playerDamage = 0;
    private int enemyDamage = 0;
    
    static int enemyHp = 0;
    static int enemyExp = 0;
    
    static int enemyStr = 0;
    static int enemyPer = 0;
    static int enemyEnd = 0;
    static int enemyChr = 0;
    static int enemyInt = 0;
    static int enemyAgl = 0;
    static int enemyLck = 0;
    
    // 1.musi równać się 1, 2.musi kończyć się na 2,3,4, 3.wszystko inne
    static String text = "punkt, punkty, punktów";
    
    static String enemyNameM = "Ala";
    static String enemyNameD = "Ali";
    static String enemyNameC = "Ali";
    static String enemyNameB = "Alę";
    static String enemyNameN = "Alą";
    static String enemyNameMs = "Ali";

    static String monsterType = "wielką";
    
    private int monsterValue;
    private int monsterTypeValue;
    
    public FightEnemy()
    {
        showPosition.setText(capitalize(enemyNameM)+" czeka na twoją akcję.");
        if (selectEnemy==0)
        {
            Random random = new Random();
            monsterValue = random.nextInt(3);
            monsterTypeValue = random.nextInt(3);
            
            MonsterGenerator monsterGenerator = new MonsterGenerator(monsterValue,monsterTypeValue);
            
            enemyNameM=monsterGenerator.getEnemyNameM();
            enemyNameD=monsterGenerator.getEnemyNameD();
            enemyNameC=monsterGenerator.getEnemyNameC();
            enemyNameB=monsterGenerator.getEnemyNameB();
            enemyNameN=monsterGenerator.getEnemyNameN();
            enemyNameMs=monsterGenerator.getEnemyNameMs();
            enemyGender=monsterGenerator.getEnemyGender();
            monsterType=monsterGenerator.getMonsterType();
            
            enemyStr=monsterGenerator.getEnemyStr();
            enemyPer=monsterGenerator.getEnemyPer();
            enemyEnd=monsterGenerator.getEnemyEnd();
            enemyChr=monsterGenerator.getEnemyChr();
            enemyInt=monsterGenerator.getEnemyInt();
            enemyAgl=monsterGenerator.getEnemyAgl();
            enemyLck=monsterGenerator.getEnemyLck();
            enemyHp=enemyEnd;
            
            enemyExp=enemyStr+enemyPer+enemyEnd+enemyChr+enemyInt+enemyAgl+enemyLck;
            if (enemyExp<=0)
            {
                enemyExp=1;
            }
            selectEnemy=1;
            showPosition.setText("Napotkałeś "+monsterType+" "+enemyNameB+"!");
            
            if (enemyGender == 0) //przerobić na metodę
            {
                genderAttack = " zadała ";
                genderDefeat = " została pokonana";
            }

            else
            {
                genderAttack = " zadał ";
                genderDefeat = " został pokonany";
            }
        }
        
        if (playerAction==1)
        {
            if (playerAttack==1)
            {
                //gracz zadaje co najmniej 1 pkt obrażeń.
                playerDamage = playerStr-enemyEnd;   
                if (playerDamage<=0)
                {
                    playerDamage=1;
                }
                enemyHp = enemyHp - playerDamage;
                showPosition.setText("Zadałeś "+enemyNameC+" "+playerDamage+" "+casePoint(playerDamage,text)+" obrażeń");
                playerAttack=0;
            }
            playerAction=0;
            
            //przeciwnik zadaje co najmniej 1 pkt obrażeń.
            enemyDamage = enemyStr-playerEnd;
            if (enemyDamage<=0)
            {
                enemyDamage=1;
            }
            playerHp = playerHp - enemyDamage;
            showPosition.setText(showPosition.getText()+'\n'+capitalize(enemyNameM)+genderAttack+"ci "+enemyDamage+" "+casePoint(enemyDamage,text)+" obrażeń");
        }
        
        //martwy przeciwnik
        if (enemyHp<1)
        {
            showPosition.setText(showPosition.getText()+'\n'+capitalize(enemyNameM)+genderDefeat+"!");
            fight=0;
            selectEnemy=0;
            showPosition.setText(showPosition.getText()+'\n'+"Otrzymałeś "+enemyExp+" "+casePoint(enemyExp,text)+" doświadczenia!");
            
            playerExp=playerExp+(enemyExp*(1+playerInt/10));
            PlayerExperience playerExperience = new PlayerExperience();
            
            enemyX = 22;
            enemyY = 12;
        }
    }

    private String capitalize(String str)
    {
        if(str == null || str.isEmpty())
        {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    
    public int getPlayerHp ()
    {
        return playerHp;
    }
    
    public int getEnemyHp ()
    {
        return enemyHp;
    }
    
    //funkcja oddająca ostatnią cyfrę
    public static int lastDigit(int n) 
    {
        return (n % 10); 
    }
    
    //badanie poprawności słowa po cyfrze
    public static String casePoint (int n, String casePoints)
    {
        if (lastDigit(n)>=2 && lastDigit(n)<=4)
        {
            casePoints = "punkty";
        }
        else if (lastDigit(n)==1)
        {
            casePoints = "punkt";
        }
        else
        {
            casePoints = "punktów";
        }
        return casePoints;
    }
}
