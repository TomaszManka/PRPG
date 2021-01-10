package prpg.Entities;

import javax.swing.JOptionPane;

public class Entity
{
    //entityType = enemy, obstacle, player, npc,
    
    private String className = "Entity";
    private int entityX;
    private int entityY;
    
    public Entity(String entityType, int entityX, int entityY, boolean checkHitbox)
    {
        if (entityType.equals("enemy"))
        {
            
        }
        
        else if (entityType.equals("obstacle"))
        {
            
        }
        
        else if (entityType.equals("player"))
        {
            
        }
        
        else if (entityType.equals("npc"))
        {
            
        }
        
        else
        {
            //error
        }
    }
    
    public int getEntityX()
    {
        return entityX;
    }
    
    public int getEntityY()
    {
        return entityY;
    }
    
    public void setEntityX(int entityX)
    {
        this.entityX=entityX;
    }
    
    public void setEntityY(int entityY)
    {
        this.entityY=entityY;
    }
}
