package dev.beverlydrive.mmo.items;

public abstract class Item
{
    /** TODO:
     * Much further down the line, I'd like to change these to be
     * server-sided, and simply store a class of item ids on the client.
     * Client would then fetch information for each item as-needed from
     * the server.
     */

    private String name;
    private String description;
    private ItemType type;
    private int attackBonus;
    private int strengthBonus;
    private int defenseBonus;
    private int rangedBonus;
    private int magicBonus;

    public abstract void specialAttack();
}
