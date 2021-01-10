package prpg;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import static prpg.FightEnemy.enemyHp;
import static prpg.PRPG.enemyX;
import static prpg.PRPG.enemyY;
import static prpg.PRPG.fight;
import static prpg.PRPG.fightWindowX;
import static prpg.PRPG.fightWindowY;
import static prpg.PRPG.fightWindowStatus;
import static prpg.PRPG.hitboxXY;
import static prpg.PRPG.input;
import static prpg.PRPG.mapSizeX;
import static prpg.PRPG.mapSizeY;
import static prpg.PRPG.npcX;
import static prpg.PRPG.npcY;
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
import static prpg.PRPG.playerX;
import static prpg.PRPG.playerY;

class Window extends JFrame implements ActionListener, KeyListener
{   
    static JPanel panelShowMap;
    
    static JPanel window1;
    static JPanel window2;
    static JPanel window3;
    static JPanel window4;
    
    static JTextArea text1 = new JTextArea();
    static JTextArea text2 = new JTextArea();
    static JTextArea text3 = new JTextArea();
    static JTextArea text4 = new JTextArea();
    
    static JPanel panelHP;
    static JPanel panelEnemyHP;
    static JPanel panelStats;
    static JPanel Panel9;

    static JTextArea showPosition = new JTextArea();
    static JTextArea tempoHP = new JTextArea();
    static JTextArea tempo2 = new JTextArea();
    static JTextArea tempo1 = new JTextArea();
    
    public Window()
    {   
        setSize(840, 460);
        this.add(showPosition);
        showPosition.setBounds(10, 10, 400, 400);
        showPosition.setFocusable(false);
        this.addKeyListener(this);
        
        this.add(text3);
        text3.setBounds(1, 1, 168, 98);
        text3.setFocusable(false);
        
        this.add(text4);
        text4.setBounds(1, 1, 168, 98);
        text4.setFocusable(false);
        
        this.add(text2);
        text2.setBounds(1, 1, 168, 98);
        text2.setFocusable(false);
        
        this.add(text1);
        text1.setBounds(1, 1, 168, 98);
        text1.setFocusable(false);
        
        this.add(tempoHP);
        tempoHP.setBounds(1, 1, 168, 80);
        tempoHP.setFocusable(false);
        
        this.add(tempo2);
        tempo2.setBounds(1, 1, 168, 48);
        tempo2.setFocusable(false);
        
        this.add(tempo1);
        tempo1.setBounds(1, 1, 358, 18);
        tempo1.setFocusable(false);
        
        //Panele boczne
        window1 = new JPanel();
        window1.setBounds(431, 171, 170, 100);
        window1.setBorder(BorderFactory.createLineBorder(Color.black));
        add(window1);
        window1.setLayout(null);
        window1.add(text1);
        text1.setText("Atak");
        
        window2 = new JPanel();
        window2.setBounds(621, 171, 170, 100);
        window2.setBorder(BorderFactory.createLineBorder(Color.black));
        add(window2);
        window2.setLayout(null);
        window2.add(text2);
        text2.setText("Zdolności");
        
        window4 = new JPanel();
        window4.setBounds(621, 291, 170, 100);
        window4.setBorder(BorderFactory.createLineBorder(Color.black));
        add(window4);
        window4.setLayout(null);
        window4.add(text4);
        text4.setText("Ucieczka");
        
        window3 = new JPanel();
        window3.setBounds(431, 291, 170, 100);
        window3.setBorder(BorderFactory.createLineBorder(Color.black));
        add(window3);
        window3.setLayout(null);
        window3.add(text3);
        text3.setText("Przedmioty");
        
        panelHP = new JPanel();
        panelHP.setBounds(431, 51, 170, 82);
        panelHP.setBorder(BorderFactory.createLineBorder(Color.black));
        add(panelHP);
        panelHP.setLayout(null);
        panelHP.add(tempoHP);
        tempoHP.setText("Życie: "+playerHp+'\n'+"Poziom: "+playerLevel+'\n'+"Doświadczenie: "+playerExp+"/"+playerMaxExp);
        
        panelEnemyHP = new JPanel();
        panelEnemyHP.setBounds(621, 51, 170, 50);
        panelEnemyHP.setBorder(BorderFactory.createLineBorder(Color.black));
        add(panelEnemyHP);
        panelEnemyHP.setLayout(null);
        panelEnemyHP.add(tempo2);
        tempo2.setText("Życie przeciwnika: " + enemyHp);
        
        panelStats = new JPanel();
        panelStats.setBounds(431, 21, 360, 20);
        panelStats.setBorder(BorderFactory.createLineBorder(Color.black));
        add(panelStats);
        panelStats.setLayout(null);
        panelStats.add(tempo1);
        tempo1.setText("STR " + playerStr + ", PER " + playerPer + ", END " + playerEnd + ", CHR " + playerChr + ", INT " + playerInt + ", AGL " + playerAgl + ", LCK " + playerLck);
        
        Panel9 = new JPanel();
        Panel9.setBounds(411, 11, 400, 400);
        Panel9.setBorder(BorderFactory.createLineBorder(Color.black));
        add(Panel9);
        Panel9.setLayout(null);
        
        //Główny panel
        panelShowMap = new JPanel();
        panelShowMap.setBounds(1, 1, 50, 50);
        add(panelShowMap);
        panelShowMap.add(showPosition);
        panelShowMap.setLayout(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) 
    {
        
    }

    @Override
    public void keyTyped(KeyEvent arg0) 
    {
        
    }

    @Override
    public void keyPressed(KeyEvent arg0) 
    {
        
    }

    @Override
    public void keyReleased(KeyEvent arg0) 
    {
        if (fight == 0)
        {
            
            try {
                Save save = new Save();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                Read read = new Read();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //poruszanie się gracza oraz przeciwnika
            showPosition.setText("");
            
            input = arg0.getKeyCode();
            
            PlayerMove playerMove = new PlayerMove(input,playerX,playerY);
            playerX=playerMove.getPlayerX();
            playerY=playerMove.getPlayerY();
            hitboxXY[playerY][playerX] = 1; //ustawianie tymczasowego hitboxa dla gracza 
            //hitboxXY[enemyY][enemyX] = 0; //usuwanie tymczasowego hitboxa dla przeciwnika 
            
            EnemyAI enemyAi = new EnemyAI(enemyX,enemyY,playerX,playerY);
            enemyX=enemyAi.getEnemyX();
            enemyY=enemyAi.getEnemyY();
            hitboxXY[playerY][playerX] = 0; //usuwanie tymczasowego hitboxa dla gracza
            //hitboxXY[enemyY][enemyX] = 1; //ustawianie tymczasowego hitboxa dla przeciwnika 
            
            ReadMap readMap = new ReadMap();
            Map map = new Map(showPosition,mapSizeX,mapSizeY,playerX,playerY,enemyX,enemyY,npcX,npcY);
        }
        
        else
        {
            //ruszanie oknami
            
            //hitboxXY[enemyY][enemyX] = 0; //usuwanie tymczasowego hitboxa dla przeciwnika 
            showPosition.setText("");
            
            input = arg0.getKeyCode();
            FightWindow fightWindow = new FightWindow(input,fightWindowStatus,fightWindowX,fightWindowY);
            fightWindowX=fightWindow.getFightWindowX();
            fightWindowY=fightWindow.getFightWindowY();
            
            fightWindowStatus=fightWindow.getFightWindowStatus();
            
            FightEnemy fightEnemy = new FightEnemy();
            playerHp=fightEnemy.getPlayerHp();
            tempoHP.setText("Życie: "+playerHp+'\n'+"Poziom: "+playerLevel+'\n'+"Doświadczenie: "+playerExp+"/"+playerMaxExp);
            enemyHp=fightEnemy.getEnemyHp();
            tempo2.setText("Życie przeciwnika: "+enemyHp);
            
            if (playerHp<=0)
            {
                System.exit(0);
            }
        }
    }
}