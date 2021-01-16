package dev.beverlydrive.mmo.entities;

public abstract class Entity
{
    private String name;
    private Title title;
    private int combatLevel;
    private boolean player;

    public String getName()     { return this.name;        }
    public Title getTitle()     { return this.title;       }
    public int getCombatLevel() { return this.combatLevel; }
    public boolean isPlayer()   { return this.player;      }

    public void setName(String name)            { this.name = name;               }
    public void setTitle(Title title)           { this.title = title;             }
    public void setCombatLevel(int combatLevel) { this.combatLevel = combatLevel; }
    public void setPlayer(boolean isPlayer)     { this.player = isPlayer;         }
}
