package dev.beverlydrive.mmo.entities.dialog;

import dev.beverlydrive.mmo.entities.Entity;

import java.util.List;

public class Dialog
{
   private Entity speaker;
   private Entity listener;
   private String[] frames;

   public Entity getSpeaker()      { return this.speaker;  }
   public Entity getListener()     { return this.listener; }
   public String[] getFrames()     { return this.frames;   }

   public void setSpeaker(Entity speaker)     { this.speaker  = speaker;  }
   public void setListener(Entity listener)   { this.listener = listener; }
   public void setFrames(String[] frames)     { this.frames   = frames;   }
}
