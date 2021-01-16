package dev.beverlydrive.mmo.entities;

public class Title
{
    private String title;
    private String color;

    public Title(String title, String color)
    {
        this.title = title;
        this.color = color;
    }

    public String getTitle() { return this.title; }
    public String getColor() { return this.color; }

    public void setTitle(String title) { this.title = title; }
    public void setColor(String color) { this.color = color; }

}
