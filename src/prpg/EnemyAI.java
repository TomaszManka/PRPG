package prpg;

import static prpg.PRPG.hitboxXY;
import static prpg.PRPG.fight;
import static prpg.PRPG.mapSizeX;
import static prpg.PRPG.mapSizeY;

class EnemyAI
{
    private int enemyX;
    private int enemyY;
    private int differenceX;
    private int differenceY;
    private int exit = 0;
    static int prevMove = 0;
    
    public EnemyAI(int enemyX,int enemyY,int playerX,int playerY)
    {
        differenceX = Math.abs(enemyX-playerX);
        differenceY = Math.abs(enemyY-playerY);
        
        //System.out.println();
        //System.out.println("X: "+differenceX);
        //System.out.println("Y: "+differenceY);
        //System.out.println("Exit: "+prevMove);
        
        if ((differenceX>=differenceY||prevMove==1||prevMove==2)&&prevMove!=3&&prevMove!=4)
        {
            if (Math.abs((enemyX+1)-playerX)<Math.abs((enemyX-1)-playerX)) //RIGHT
            {
                //System.out.println("Right");
                if (hitboxXY[enemyY][enemyX+1]==1) //Jesli sciana po prawej
                {
                    //System.out.println("Sciana");
                    if (Math.abs((enemyY+1)-playerY)>Math.abs((enemyY-1)-playerY)||prevMove==1) //Y--
                    {
                        for (int i=enemyY;i<=mapSizeY;i++)
                        {
                            if (hitboxXY[i][enemyX+1]==1) //Zablokowana daleko góra
                            {

                            }
                            else //Nie
                            {
                                if ((hitboxXY[enemyY+1][enemyX]==1)) //Zablokowana blisko góra
                                {

                                }
                                else //Nie
                                {
                                    exit = 1; //Znaleziono wyjście
                                    prevMove = 1; //Ta zmienna istnieje w celu zachęcenia przeciwnika do powtórzenia ruchu
                                    enemyY--; //Przeciwnik idzie w górę
                                    break;
                                }
                            }
                        }
                    }
                    
                    else //Y++
                    {
                        for (int i=enemyY;exit==0&&i<=mapSizeY;i--)
                        {
                            if (hitboxXY[i][enemyX+1]==1) //Zablokowany daleko dół
                            {

                            }
                            else //Nie
                            {
                                if ((hitboxXY[enemyY-1][enemyX]==1)) //Zablokowany dół
                                {

                                }
                                else //Nie
                                {
                                    exit = 1;
                                    prevMove = 2;
                                    enemyY++;
                                    break;
                                }
                            }
                        }
                    }
                }
                else
                {
                    prevMove = 0;
                    enemyX++;
                }
            }
            
            else //LEFT
            {
                //System.out.println("Left");
                if (hitboxXY[enemyY][enemyX-1]==1)
                {
                    //System.out.println("Sciana");
                    if (Math.abs((enemyY+1)-playerY)>Math.abs((enemyY-1)-playerY)||prevMove==1) //Y--
                    {
                        for (int i=enemyY;exit==0&&i<=mapSizeY;i++)
                        {
                            if (hitboxXY[i][enemyX-1]==1)
                            {

                            }
                            else
                            {
                                if ((hitboxXY[enemyY+1][enemyX]==1))
                                {

                                }
                                else
                                {
                                    exit = 1;
                                    prevMove = 1;
                                    enemyY--;
                                    break;
                                }
                            }
                        }
                    }
                    
                    else
                    {
                        for (int i=enemyY;exit==0&&i<=mapSizeY;i--)
                        {
                            if (hitboxXY[i][enemyX-1]==1)
                            {

                            }
                            else
                            {
                                if ((hitboxXY[enemyY-1][enemyX]==1))
                                {

                                }
                                else
                                {
                                    exit = 1;
                                    prevMove = 2;
                                    enemyY++;
                                    break;
                                }
                            }
                        }
                    }
                }
                else
                {
                    prevMove = 0;
                    enemyX--;
                }
            }
        }
        
        else
        {
            if (Math.abs((enemyY+1)-playerY)<Math.abs((enemyY-1)-playerY)) //DOWN
            {
                //System.out.println("Down");
                if (hitboxXY[enemyY+1][enemyX]==1)
                {
                    //System.out.println("Sciana");
                    if (Math.abs((enemyX+1)-playerX)>Math.abs((enemyX-1)-playerX)||prevMove==3)
                    {
                        for (int i=enemyX;exit==0&&i<=mapSizeX;i++)
                        {
                            if (hitboxXY[enemyY+1][i]==1)
                            {

                            }
                            else
                            {
                                if ((hitboxXY[enemyY][enemyX+1]==1))
                                {

                                }
                                else
                                {
                                    exit = 1;
                                    prevMove = 3;
                                    enemyX--;
                                    break;
                                }
                            }
                        }
                    }
                    else
                    {
                        for (int i=enemyX;exit==0&&i<=mapSizeX;i--)
                        {
                            if (hitboxXY[enemyY+1][i]==1)
                            {

                            }
                            else
                            {
                                if ((hitboxXY[enemyY][enemyX-1]==1))
                                {

                                }
                                else
                                {
                                    exit = 1;
                                    prevMove = 4;
                                    enemyX++;
                                    break;
                                }
                            }
                        }
                    }
                }
                else
                {
                    prevMove = 0;
                    enemyY++;
                }
            }

            else //UP
            {
                //System.out.println("Up");
                if (hitboxXY[enemyY-1][enemyX]==1)
                {
                    //System.out.println("Sciana");
                    if (Math.abs((enemyX+1)-playerX)>Math.abs((enemyX-1)-playerX)||prevMove==3)
                    {
                        for (int i=enemyX;exit==0&&i<=mapSizeX;i++)
                        {
                            if (hitboxXY[enemyY-1][i]==1)
                            {

                            }
                            else
                            {
                                exit = 1;
                                prevMove = 3;
                                enemyX--;
                                break;
                            }
                        }
                    }
                    else
                    {
                        for (int i=enemyX;exit==0&&i<=mapSizeX;i--)
                        {
                            if (hitboxXY[enemyY-1][i]==1)
                            {

                            }
                            else
                            {
                                exit = 1;
                                prevMove = 4;
                                enemyX++;
                                break;
                            }
                        }
                    }
                }
                else
                {
                    prevMove = 0;
                    enemyY--;
                }
            }
        }
        
        this.enemyX=enemyX;
        this.enemyY=enemyY;
        
        if ((Math.abs((enemyY)-playerY)<2)&&(Math.abs((enemyX)-playerX)<2))
        {
            fight=1;
        }
    }
    
    public int getEnemyY ()
    {
        return enemyY;
    }
    
    public int getEnemyX ()
    {
        return enemyX;
    }
}
