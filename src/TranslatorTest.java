import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TranslatorTest {

    @Test
    public void testStarToE(){
        //Arrange
        Translator translate = new Translator();
        //Act
        String actual = translate.toEng("*");
        //Assert
        assertEquals("E", actual);
    }

    @Test
    public void testStarsToH(){
        //Arrange
        Translator translate = new Translator();
        //Act
        String actual = translate.toEng("****");
        //Assert
        assertEquals("H", actual);
    }

    @Test
    public void testEToStar(){
        //Arrange
        Translator translate = new Translator();
        //Act
        String actual = translate.toMorse("E");
        //Assert
        assertEquals("*", actual);
    }

    @Test
    public void testHToStars(){
        //Arrange
        Translator translate = new Translator();
        //Act
        String actual = translate.toMorse("H");
        //Assert
        assertEquals("****", actual);
    }

    @Test
    public void testHEJToMorse() {
        //Arrange
        Translator translate = new Translator();
        //Act
        String actual = translate.EngToMorse("HEJ");
        //Assert
        assertEquals("**** * *---", actual);
    }

    @Test
    public void testMorseToHEJ() {
        //Arrange
        Translator translate = new Translator();
        //Act
        String actual = translate.MorseToEng("**** * *---");
        //Assert
        assertEquals("HEJ", actual);
    }
}
