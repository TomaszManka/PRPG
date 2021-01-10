package prpg;

import java.io.FileNotFoundException;
import static prpg.PRPG.hitboxXY;
import static prpg.PRPG.npcX;
import static prpg.PRPG.npcY;

public class PlayerMove
{
    private int playerX;
    private int playerY;
    private char pressedKey;
    
    public PlayerMove(int input, int playerX, int playerY)
    {   
        pressedKey = (char)input;
        
        switch (pressedKey)
        {       
            case 68:
                if (hitboxXY[playerY][playerX+1]==1)
                {
                    
                }
                else
                {
                    playerX++;
                }
                break;
            
            case 65:
                if (hitboxXY[playerY][playerX-1]==1)
                {
                    
                }
                else
                {
                    playerX--;
                }
                break;
                
            case 83:
                if (hitboxXY[playerY+1][playerX]==1)
                {
                    
                }
                else
                {
                    playerY++;
                }
                break;
        
            case 87:
                if (hitboxXY[playerY-1][playerX]==1)
                {
                    
                }
                else
                {
                    playerY--;
                }
                break;
            
            case 69:
                if (Math.abs(npcX-playerX)<=1&&Math.abs(npcY-playerY)<=1)
                {
                    System.out.println("NPC");
                }
                break;
                
            default:
                break;
        }
        
        this.playerX=playerX;
        this.playerY=playerY;
    }
    
    public int getPlayerY ()
    {
        return playerY;
    }
    
    public int getPlayerX ()
    {
        return playerX;
    }
}
