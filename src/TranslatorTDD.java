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
    public void testSplitMorseCode(){

        Translator translate = new Translator();
        String morse = "**** * *---";
        translate.splitMorseCode(morse);

        String actual = morse;


        String expected = "**** * *---";
        assertEquals(expected, actual);
    }

    @Test
    public void testGetCodeToEnglish(){

        Translator translate = new Translator();

        String morseInput = "**** * *---";
        translate.splitMorseCode(morseInput);

        translate.getCodeToEnglish();
        String actual = translate.printSavedLetters();


        String expected = "HEJ";
        assertEquals(expected, actual);

    }

    @Test
    public void testSplitWordIntoLetters(){

        Translator translate = new Translator();

        String eng = "HEJ";
        translate.splitWordToLetters(eng);


        String actual = eng;


        String expected = "HEJ";
        assertEquals(expected, actual);
    }

    @Test
    public void testGetLettersToMorse(){

        Translator translate = new Translator();

        String engInput = "HEJ";
        translate.splitWordToLetters(engInput);

        translate.getEnglishToCode();
        String actual = translate.printSavedCode();

        String expected = "**** * *--- ";
        assertEquals(expected, actual);

    }

}
