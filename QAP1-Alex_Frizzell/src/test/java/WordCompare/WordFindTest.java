package WordFind;

import org.example.WordFind;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordFindTest {
    @Test
    public void WordFindTest() {
        WordFind wordFind = new WordFind();

        Assertions.assertTrue(wordFind.findWordCompare("Over_watch", "Over_watch_2_just_released"));

        Assertions.assertTrue(wordFind.findWordCompare("Yo", "Yo_whats_up!"));

        Assertions.assertTrue(wordFind.findWordCompare("Bye", "Bye_see_ya_later!"));
    }
    @Test
    public void WordFindTest2() {
        WordFind wordFind = new WordFind();

        Assertions.assertTrue(wordFind.findWordCompare("Python", "Python_is_my_favorite!"));

        Assertions.assertTrue(wordFind.findWordCompare("Dog", "I_have_a_black_german_shepard_Dog"));

        Assertions.assertTrue(wordFind.findWordCompare("lizard", "My_lizard_name_is_Jerry"));
    }
    @Test
    public void WordFindTest3() {
        WordFind wordFind = new WordFind();

        Assertions.assertTrue(wordFind.findWordCompare("Dirt_bike", "I_used_to_race_Dirt_bikes!"));

        Assertions.assertTrue(wordFind.findWordCompare("Okay", "Okay_cya_later!"));

        Assertions.assertTrue(wordFind.findWordCompare("Wii", "Wii_Sports"));
    }
}

