import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class ModelTest extends UnitTest {

	@Before
    public void setup() {
        Fixtures.deleteDatabase();
    }
	
    @Test
    public void createAndRetrieveWordSet() {
        new WordSet("Christiaan", "food").save();
        
        WordSet set = WordSet.find("byAuthor", "Christiaan").first();
        
        assertEquals("Christiaan", set.author);
        assertEquals("food", set.title);
    }

    @Test
    public void createAndRetrieveWord() {
    	WordSet set = new WordSet("Christiaan", "food").save();
    	new Word(set, "word").save();
    	
    	Word word = Word.find("byWordSet", set).first();
    	
    	assertEquals("word", word.word);
    }
}
