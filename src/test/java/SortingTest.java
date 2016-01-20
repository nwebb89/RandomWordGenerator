import org.junit.Test;

import static org.junit.Assert.*;
import java.util.*;

/**
 * Created by nicholaswebb on 1/19/16.
 */
public class SortingTest {

    @Test
    public void testSortingWords() throws Exception {
        Sorting sort = new Sorting();
        LinkedList<String> abc = new LinkedList<String>();
        abc.add("t");
        abc.add("o");
        abc.add("a");
        abc.add("g");
        LinkedList<String> rightAnswer = new LinkedList<String>();
        rightAnswer.add("a");
        rightAnswer.add("g");
        rightAnswer.add("o");
        rightAnswer.add("t");
        sort.sortingWords(abc);
        assertEquals(rightAnswer, sort.sortingWords(abc));


    }
}