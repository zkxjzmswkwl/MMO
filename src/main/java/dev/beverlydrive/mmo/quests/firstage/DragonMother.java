package dev.beverlydrive.mmo.quests.firstage;

import dev.beverlydrive.mmo.quests.Quest;

/**
 * Storyline:
 *
 * You start the quest by talking to a concerned father.
 * His wife's been missing for many years.
 * His son has been lost for several days, and there's been dragon sightings.
 * You find the son hiding in a cave, he tells you the dragon has been chasing him.
 * If you deliver the son back to his father, they'll both surely die.
 * So you realize you have to fight and kill the dragon.
 * Upon doing so, it comes to light (?) that the dragon's the son's mother.
 * The mother tells you that a mysterious figure placed a spell on her many years ago
 * resulting in her current form.
 * You ask why she's come back now after being absent for many years.
 * She tells you she's finally found a way to be returned to her normal form.
 * Unfortunately, dragons don't have the best fine-motor control, and she can't pick the
 * necessary herbs herself. She asks if you would do it. This introduces the player to the Herblore skill.
 * You go and pick the required herbs, fill a vial, mix the potion, and use it on the dragon.
 * Her form returns to normal, and you go back to the husband with both his wife and son.
 * Quest complete (Quest part of series 1/?)
 * <--- Second quest in series --->
 * You find out the husband was previously a nobleman of the neighboring kingdom,
 * but was framed for a crime he didn't commit by a group of corrupt kingdom officials.
 * After being framed, he and his family were exiled.
 * He tells you that he reckons those responsible for cursing his wife are the same who framed him.
 * ....
 */

public class DragonMother extends Quest {

    public DragonMother(String title, String startPoint, String difficulty, int ID) {
        super(title, startPoint, difficulty, ID);
    }
}
