package prpg;

import javax.swing.JOptionPane;
import static prpg.PRPG.playerAgl;
import static prpg.PRPG.playerChr;
import static prpg.PRPG.playerEnd;
import static prpg.PRPG.playerExp;
import static prpg.PRPG.playerInt;
import static prpg.PRPG.playerLck;
import static prpg.PRPG.playerLevel;
import static prpg.PRPG.playerMaxExp;
import static prpg.PRPG.playerPer;
import static prpg.PRPG.playerStr;
import static prpg.Window.tempo1;

public class PlayerExperience
{
    static int options = 0;
    static String popup;
    private boolean breakLoop;
    
    public PlayerExperience()
    {
        //poziom do góry
        if (playerExp>=playerMaxExp)
        {
            playerExp=playerExp-playerMaxExp;
            playerLevel++;
            playerMaxExp=playerLevel*10;
            breakLoop=false;
            
            do
            {
                if (options==0)
                {
                    popup=JOptionPane.showInputDialog("Podaj statystykę, którą chcesz zwiększyć:"+'\n'+"STR 1 - +1 do obrażeń"+'\n'+"PER 1 - WIP"+'\n'+"END 1 - +1 do defensywy oraz +10 do życia"+'\n'+"CHR 1 - WIP"+'\n'+"INT 1 - +10% doświadczenia"+'\n'+"AGL 1 - +10% szansy na ucieczkę"+'\n'+"LCK 1 - WIP!"+'\n'+"> - dalej");
                }
                else if (options==1)
                {
                    popup=JOptionPane.showInputDialog("(INT) Podaj statystykę, którą chcesz zwiększyć:"+'\n'+"INT 2 - Kula Ognia"+'\n'+"INT 3 - Uzdrowienie"+'\n'+"< - wstecz"+'\n');
                }

                if (popup.equals(">"))
                {
                    options=1;
                }
                else if (popup.equals("<"))
                {
                    options=0;
                }

                else if (popup.equals("STR 1"))
                {
                    playerStr++;
                    breakLoop=true;
                }

                else if (popup.equals("PER 1"))
                {
                    playerPer++;
                    breakLoop=true;
                }

                else if (popup.equals("END 1"))
                {
                    playerEnd++;
                    breakLoop=true;
                }

                else if (popup.equals("CHR 1"))
                {
                    playerChr++;
                    breakLoop=true;
                }

                else if (popup.equals("INT 1"))
                {
                    playerInt++;
                    breakLoop=true;
                }

                else if (popup.equals("AGL 1"))
                {
                    playerAgl++;
                    breakLoop=true;
                }

                else if (popup.equals("LCK 1"))
                {
                    playerLck++;
                    breakLoop=true;
                }

                else if (popup.equals("INT 2"))
                {
                    //kula ognia
                }

                else if (popup.equals("INT 3"))
                {
                    //uzdrowienie
                }
            } while (breakLoop==false);
            
            tempo1.setText("STR " + playerStr + ", PER " + playerPer + ", END " + playerEnd + ", CHR " + playerChr + ", INT " + playerInt + ", AGL " + playerAgl + ", LCK " + playerLck);
        }
    }
}
