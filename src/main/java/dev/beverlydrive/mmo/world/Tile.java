package dev.beverlydrive.mmo.world;

import java.util.List;

public class Tile
{
    private int id;
    private List<Object> occupants;

    public int getId() { return this.id; }
    public List<Object> getOccupants() { return this.occupants; }

    public void setId(int id) { this.id = id; }
    public void setOccupants(List<Object> occupants) { this.occupants = occupants; }

    public void pushOccupant(Object newOccupant)
    {
        this.occupants.add(newOccupant);
    }

    public void clearOccupants()
    {
        this.occupants.clear();
    }

    public void removeOccupant(int indice)
    {
        this.occupants.remove(indice);
    }
}
