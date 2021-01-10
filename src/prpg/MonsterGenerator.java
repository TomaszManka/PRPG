package prpg;

public class MonsterGenerator
{
    private int enemyStr = 0;
    private int enemyPer = 0;
    private int enemyEnd = 0;
    private int enemyChr = 0;
    private int enemyInt = 0;
    private int enemyAgl = 0;
    private int enemyLck = 0;
    
    private int numberOfCases = 0;
    private int enemyGender = 0;
    private String enemyNameM = "Ala";
    private String enemyNameD = "Ali";
    private String enemyNameC = "Ali";
    private String enemyNameB = "Alę";
    private String enemyNameN = "Alą";
    private String enemyNameMs = "Ali";
    private String monsterType = "wielką";
    
    //private int monsterValue -> przerobić  na funkcję "MonsterGenerator()"
    //private int monsterTypeValue z liczbą bazowaną na wartości z kejsów z monsterValue
    
    public MonsterGenerator(int monsterValue, int monsterTypeValue)
    {
        switch (monsterValue)
        {
            case 0:
                enemyGender = 0;
                enemyStr = 0;
                enemyPer = 0;
                enemyEnd = 2;
                enemyChr = 0;
                enemyInt = 0;
                enemyAgl = 0;
                enemyLck = 0;
                enemyNameM = "mrówka";
                enemyNameD = "mrówki";
                enemyNameC = "mrówce";
                enemyNameB = "mrówkę";
                enemyNameN = "mrówce";
                enemyNameMs = "mrówce";
            switch (monsterTypeValue)
            {
                case 0:
                    monsterType="bardzo małą";
                    enemyStr=enemyStr-1;
                    enemyEnd=enemyEnd-1;
                    break;
                case 1:
                    monsterType="zwykłą";
                    break;
                case 2:
                    monsterType="wielką";
                    enemyStr=enemyStr+1;
                    enemyEnd=enemyEnd+1;
                    break;
                default:
                    break;
            }
                break;
                
            case 1:
                enemyGender = 1;
                enemyStr = 0;
                enemyPer = 0;
                enemyEnd = 2;
                enemyChr = 0;
                enemyInt = 0;
                enemyAgl = 0;
                enemyLck = 0;
                enemyNameM = "wilk";
                enemyNameD = "wilka";
                enemyNameC = "wilkowi";
                enemyNameB = "wilka";
                enemyNameN = "wilkiem";
                enemyNameMs = "wilku";
            switch (monsterTypeValue)
            {
                case 0:
                    monsterType="zapchlonego";
                    enemyStr=enemyStr+1;
                    enemyEnd=enemyEnd+1;
                    break;
                case 1:
                    monsterType="nieumarłego";
                    enemyStr=enemyStr+1;
                    enemyEnd=enemyEnd+6;
                    break;
                case 2:
                    monsterType="alfa";
                    enemyStr=enemyStr+4;
                    enemyEnd=enemyEnd+4;
                    break;
                default:
                    break;
            }
                break;
                
            case 2:
                enemyGender = 1;
                enemyStr = 0;
                enemyPer = 0;
                enemyEnd = 4;
                enemyChr = 0;
                enemyInt = 0;
                enemyAgl = 0;
                enemyLck = 0;
                enemyNameM = "bandyta";
                enemyNameD = "bandyty";
                enemyNameC = "bandycie";
                enemyNameB = "bandytę";
                enemyNameN = "bandytą";
                enemyNameMs = "bandycie";
            switch (monsterTypeValue)
            {
                case 0:
                    monsterType="jednookiego";
                    enemyPer=enemyPer-2;
                    break;
                case 1:
                    monsterType="potężnego";
                    enemyStr=enemyStr+4;
                    break;
                case 2:
                    monsterType="beznogiego";
                    enemyAgl=0;
                    break;
                default:
                    break;
            }
                break;
                
            default:
                break;
        }
    }
    
    public String getEnemyNameM ()
    {
        return enemyNameM;
    }
    
    public String getEnemyNameD ()
    {
        return enemyNameD;
    }
    
    public String getEnemyNameC ()
    {
        return enemyNameC;
    }
    
    public String getEnemyNameB ()
    {
        return enemyNameB;
    }
    
    public String getEnemyNameN ()
    {
        return enemyNameN;
    }
    
    public String getEnemyNameMs ()
    {
        return enemyNameMs;
    }
    
    public int getEnemyStr ()
    {
        return enemyStr;
    }
    
    public int getEnemyPer ()
    {
        return enemyPer;
    }
    
    public int getEnemyEnd ()
    {
        return enemyEnd;
    }
    
    public int getEnemyChr ()
    {
        return enemyChr;
    }
    
    public int getEnemyInt ()
    {
        return enemyInt;
    }
    
    public int getEnemyAgl ()
    {
        return enemyAgl;
    }
    
    public int getEnemyLck ()
    {
        return enemyLck;
    }
    
    public int getEnemyGender ()
    {
        return enemyGender;
    }
    
    public String getMonsterType ()
    {
        return monsterType;
    }
}
