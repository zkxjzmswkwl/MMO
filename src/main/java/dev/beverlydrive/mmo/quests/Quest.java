package dev.beverlydrive.mmo.quests;

public abstract class Quest
{
    private String title;
    private String startPoint;
    private String difficulty;
    private int    ID;

    public Quest(String title, String startPoint, String difficulty, int ID)
    {
        title       =    title;
        startPoint  =    startPoint;
        difficulty  =    difficulty;
        ID          =    ID;
    }

    public String getTitle()      { return title;      }
    public String getStartPoint() { return startPoint; }
    public String getDifficulty() { return difficulty; }
    public int    getID()         { return ID;         }
}
