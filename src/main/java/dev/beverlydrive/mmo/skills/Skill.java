package dev.beverlydrive.mmo.skills;

public interface Skill
{
    public abstract void incExp(int amount);
    public abstract void decExp(int amount);
    public abstract void levelUp();
    public abstract void loadProgress();
    public abstract void buff(int amount);
    public abstract void debuff(int amount);
}