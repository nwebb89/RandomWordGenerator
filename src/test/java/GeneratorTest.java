import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nicholaswebb on 1/19/16.
 */
public class GeneratorTest {

    @Test
    public void testGenerateWord() throws Exception {
        Generator gen = new Generator();

        String s = "g";

            gen.generateWord(s);
            assertEquals("ateye", gen.generateWord(s));


    }
}