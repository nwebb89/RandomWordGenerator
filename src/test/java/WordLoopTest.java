import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by rkelly on 1/19/16.
 */
public class WordLoopTest {
    @Test
    public void testWordLoop() throws Exception {
        //int numWords, LinkedList<String> orderedChar
        int numWords = 5;
        LinkedList<String> orderedChar = new LinkedList<String>();
        orderedChar.add("g");
        orderedChar.add("t");
        orderedChar.add("h");
        orderedChar.add("m");
        assertEquals('a', WordLoop.generateWordLoop(numWords,orderedChar));
    }
}