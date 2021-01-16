package dev.beverlydrive.mmo.entities.npcs;

import dev.beverlydrive.mmo.entities.Entity;
import dev.beverlydrive.mmo.entities.Title;
import dev.beverlydrive.mmo.entities.dialog.Dialog;

public class Anna extends Entity
{
    private Dialog questStartDialog = new Dialog();

    public Anna()
    {
        this.setName("Anna");
        this.setCombatLevel(40);
        this.setTitle(new Title("The Moon and Back", "FF0000"));

        this.questStartDialog.setSpeaker(this);
        this.questStartDialog.setFrames(new String[]{
                "*humming 2000's Pop Punk softly*.. Oh! Hello! Can you lend a hand?",
                "I've got this song stuck in my head but I can't seem to remember the name...",
                "Truly! I was visiting the shelter in the city of **__Povo__**. I heard a busker performing it.",
                "I'd go back and ask him of the song myself, but I'm afraid I've got obligations here in **__Orin__**.",
                "Do you think you'd head over to **__Povo__** to place a query on my behalf?",
                "To show my gratitude I'll guide you over Mt. Nogas free of charge for life!",
                "Oh, wonderful! Thank you!"
        });

        // TODO: Quest end dialog
    }
}