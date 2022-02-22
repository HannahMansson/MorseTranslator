import java.util.ArrayList;
import java.util.HashMap;

public class Translator {

    final ArrayList<String> savedMorseCode = new ArrayList<>();
    final ArrayList<String> savedLetters = new ArrayList<>();
    int listPosition = 0;

    final char [] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
            'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.', ',', '?', ' '};
    final String[] morse = {"*-", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**",
            "*---", "-*-", "*-**", "--", "-*", "---", "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--",
            "-**-", "-*--", "--**", "*----", "**---", "***--", "****-", "*****", "-****", "--***", "---**", "----*",
            "-----", "*-*-*-", "--**--", "**--**", " "};

    final HashMap<String, String> morseToEng = new HashMap<>();

    public HashMap<String, String> getMorseToEng() {
        for (int i = 0; i < letters.length; i++) {
            morseToEng.put(morse[i], String.valueOf(letters[i]));
        }
        return morseToEng;
    }

    final HashMap<String, String> engToMorse = new HashMap<>();

    public HashMap<String, String> getEngToMorse() {
        for (int i = 0; i < letters.length; i++) {
            engToMorse.put(String.valueOf(letters[i]), morse[i]);
        }
        return engToMorse;
    }


    public String toEng(String s) {
        return getMorseToEng().get(s);
    }

    public String toMorse(String e) {
        return getEngToMorse().get(e);
    }

    public void splitMorseCode(String b) {
        int firstPosition = listPosition;
        String [] morseInput = b.split(" ");
        for (String s : morseInput) {
            savedMorseCode.add(firstPosition, s);
            listPosition++;
        }
    }

    public void getCodeToEnglish(){
        String morse;
        for (String s : savedMorseCode) {
            morse = toEng(s);
            savedLetters.add(morse);
        }
    }

    public String printSavedLetters(){
        StringBuilder printEng= new StringBuilder();
        for (String savedLetter : savedLetters) {
            printEng.insert(0, savedLetter);
        }
        return printEng.toString();
    }


    public void splitWordToLetters(String b) {
        int secondPosition = listPosition;
        String [] engInput = b.split("");
        for (String s : engInput) {
            savedLetters.add(secondPosition, s);
            listPosition++;
        }
    }

    public void getEnglishToCode() {
        String eng;
        for (String savedLetter : savedLetters) {
            eng = toMorse(savedLetter);
            savedMorseCode.add(eng);
        }
    }

    public String printSavedCode() {
        StringBuilder printMorse = new StringBuilder();
        for (String s : savedMorseCode) {
            printMorse.insert(0, s + " ");
        }
        return printMorse.toString();
    }



}
