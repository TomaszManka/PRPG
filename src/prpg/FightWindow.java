package prpg;

import java.awt.Color;
import javax.swing.BorderFactory;
import static prpg.Window.text1;
import static prpg.Window.text2;
import static prpg.Window.text3;
import static prpg.Window.text4;
import static prpg.Window.window1;
import static prpg.Window.window2;
import static prpg.Window.window3;
import static prpg.Window.window4;
import static prpg.PRPG.playerAttack;
import static prpg.PRPG.playerAction;

public class FightWindow 
{
    static String ability1 = "Zdolność 1";
    static String ability2 = "Zdolność 2";
    static String ability3 = "Zdolność 3";
    static String ability4 = "Zdolność 4";
    
    static String item1 = "Przedmiot 1";
    static String item2 = "Przedmiot 2";
    static String item3 = "Przedmiot 3";
    static String item4 = "Przedmiot 4";
    
    private int fightWindowX;
    private int fightWindowY;
    private int fightWindowStatus;
    private char pressedKey;
    
    public FightWindow(int input, int fightWindowStatus, int fightWindowX, int fightWindowY)
    {   
        pressedKey = (char)input;
        
        switch (pressedKey)
        {
            case 68:
                if (fightWindowX!=1)
                {
                    fightWindowX++;
                }
                break;
            
            case 65:
                if (fightWindowX!=0)
                {
                    fightWindowX--;
                }
                break;
                
            case 83:
                if (fightWindowY!=1)
                {
                    fightWindowY++;
                }
                break;
        
            case 87:
                if (fightWindowY!=0)
                {
                    fightWindowY--;
                }
                break;
                
            case 8:
                if (fightWindowStatus!=0)
                {
                    fightWindowStatus = 0;
                    fightWindowX=0;
                    fightWindowY=0;
                }
                break;
                
            case 10:
                if (fightWindowX==0&&fightWindowY==0)
                {
                    if (fightWindowStatus==0)
                    {
                        playerAttack=1;
                        playerAction=1;
                    }
                    //System.out.println("1");
                }
                else if (fightWindowX==1&&fightWindowY==0)
                {
                    if (fightWindowStatus==0)
                    {
                        fightWindowStatus=1;
                        fightWindowX=0;
                        fightWindowY=0;
                    }
                    //System.out.println("2");
                }
                else if (fightWindowX==0&&fightWindowY==1)
                {
                    if (fightWindowStatus==0)
                    {
                        fightWindowStatus=2;
                        fightWindowX=0;
                        fightWindowY=0;
                    }
                    //System.out.println("3");
                }
                else if (fightWindowX==1&&fightWindowY==1)
                {
                    
                    //System.out.println("4");
                }
                break;
            
            default:
                break;
        }
        
        if (fightWindowX==0&&fightWindowY==0)
        {
            window1.setBorder(BorderFactory.createLineBorder(Color.red));
            window2.setBorder(BorderFactory.createLineBorder(Color.black));
            window3.setBorder(BorderFactory.createLineBorder(Color.black));
            window4.setBorder(BorderFactory.createLineBorder(Color.black));
        }
        
        else if (fightWindowX==1&&fightWindowY==0)
        {
            window1.setBorder(BorderFactory.createLineBorder(Color.black));
            window2.setBorder(BorderFactory.createLineBorder(Color.red));
            window3.setBorder(BorderFactory.createLineBorder(Color.black));
            window4.setBorder(BorderFactory.createLineBorder(Color.black));
        }
        
        else if (fightWindowX==0&&fightWindowY==1)
        {
            window1.setBorder(BorderFactory.createLineBorder(Color.black));
            window2.setBorder(BorderFactory.createLineBorder(Color.black));
            window3.setBorder(BorderFactory.createLineBorder(Color.red));
            window4.setBorder(BorderFactory.createLineBorder(Color.black));
        }
        
        else if (fightWindowX==1&&fightWindowY==1)
        {
            window1.setBorder(BorderFactory.createLineBorder(Color.black));
            window2.setBorder(BorderFactory.createLineBorder(Color.black));
            window3.setBorder(BorderFactory.createLineBorder(Color.black));
            window4.setBorder(BorderFactory.createLineBorder(Color.red));
        }
        
        switch (fightWindowStatus) 
        {
            case 0:
                text1.setText("Atak");
                text2.setText("Zdolności");
                text3.setText("Przedmioty");
                text4.setText("Ucieczka");
                break;
                
            case 1:
                text1.setText(ability1);
                text2.setText(ability2);
                text3.setText(ability3);
                text4.setText(ability4);
                break;
                
            case 2:
                text1.setText(item1);
                text2.setText(item2);
                text3.setText(item3);
                text4.setText(item4);
                break;
                
            default:
                break;
        }
        
        
        
        this.fightWindowX=fightWindowX;
        this.fightWindowY=fightWindowY;
        this.fightWindowStatus=fightWindowStatus;
    }
    
    public int getFightWindowY ()
    {
        return fightWindowY;
    }
    
    public int getFightWindowX ()
    {
        return fightWindowX;
    }
    
    public int getFightWindowStatus ()
    {
        return fightWindowStatus;
    }
}
