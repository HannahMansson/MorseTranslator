import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TranslatorTDD {

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
    public void testStarDashToA(){
        //Arrange
        Translator translate = new Translator();
        //Act
        String actual = translate.toEng("*-");
        //Assert
        assertEquals("A", actual);
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
    public void testAToStarDash(){
        //Arrange
        Translator translate = new Translator();
        //Act
        String actual = translate.toMorse("A");
        //Assert
        assertEquals("*-", actual);
    }

    @Test
    public void testHEJToMorse(){
        //Arrange
        Translator translate = new Translator();
        //Act
        translate.wordToMorse("HEJ");
        String actual = translate.getWordToMorse();
        //Assert
        assertEquals("**** *- *---", actual);

    }
}
