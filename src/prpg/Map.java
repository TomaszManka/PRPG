package prpg;

import javax.swing.JTextArea;
import static prpg.PRPG.hitboxXY;

class Map
{
    //TO DO -> przyjmuje tablicę entity i wyszukuje
    //public Map (int numberOfEntities, Entity entityList[numberOfEntities])
    public Map(JTextArea showPosition,int mapSizeX,int mapSizeY,int playerX,int playerY,int enemyX,int enemyY, int npcX, int npcY)
    {
        for (int y=0;y<mapSizeY;y++)
        {
            for (int x=0;x<mapSizeX;x++)
            {
                if (x==playerX && y==playerY)
                {
                    //System.out.print("P");
                    showPosition.setText(showPosition.getText() + "P");
                    //zamienić na grafikę
                }
                else if (x==enemyX && y==enemyY)
                {
                    //System.out.print("E");
                    showPosition.setText(showPosition.getText() + "E");
                }
                else if (x==npcX && y==npcY)
                {
                    //System.out.print("N");
                    showPosition.setText(showPosition.getText() + "N");
                }
//                else if (obstacleXY[y][x]==1)
//                {
//                    //System.out.print("O");
//                    showPosition.setText(showPosition.getText() + ">");
//                }
                else if (hitboxXY[y][x]==1)
                {
                    //System.out.print("O");
                    showPosition.setText(showPosition.getText() + ">");
                }
                else 
                {
                    //System.out.print("S");
                    showPosition.setText(showPosition.getText() + "_");
                }
            }
            //System.out.println();
            showPosition.setText(showPosition.getText() + '\n');
        }
        //System.out.println();
    }
}