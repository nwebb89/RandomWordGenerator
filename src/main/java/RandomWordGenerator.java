
/**
 * Created by nicholaswebb on 1/19/16.
 */
import java.util.*;
public class RandomWordGenerator {




    public static void main(String[] args){
        int numberOfWords = RetrieveConstraints.getNumWords();
        LinkedList<String> startingChars = RetrieveConstraints.getStartingChar();

        LinkedList<String> unSortedChars = WordLoop.generateWordLoop(numberOfWords, startingChars);
        String s = unSortedChars.toString();
        System.out.println(s.substring(1, s.length()-1));
        LinkedList<String> sortedWords = new LinkedList<String>();
        sortedWords = Sorting.sortingWords(unSortedChars);
        String d = sortedWords.toString();

        System.out.println(d.substring(1, d.length() -1));
    }






}




