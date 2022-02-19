import java.util.ArrayList;
import java.util.HashMap;

public class Translator {

    ArrayList<String> savedMorseCode = new ArrayList<>();
    ArrayList<String> savedLetters = new ArrayList<>();
    int listPosition = 0;

    char [] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
            'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.', ',', '?'};
    String[] morse = {"*-", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**",
            "*---", "-*-", "*-**", "--", "-*", "---", "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--",
            "-**-", "-*--", "--**", "*----", "**---", "***--", "****-", "*****", "-****", "--***", "---**", "----*",
            "-----", "*-*-*-", "--**--", "**--**"};

    HashMap<String, String> morseToEng = new HashMap<>();

    public HashMap<String, String> getMorseToEng() {
        for (int i = 0; i < letters.length; i++) {
            morseToEng.put(morse[i], String.valueOf(letters[i]));
        }
        return morseToEng;
    }

    HashMap<String, String> engToMorse = new HashMap<>();

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
        for (int i = 0; i<morseInput.length; i++) {
            savedMorseCode.add(firstPosition, morseInput[i]);
            listPosition++;
        }
    }

    public void getCodeToEnglish(){
        String morse;
        for (int i= 0; i< savedMorseCode.size(); i++){
            morse = toEng(savedMorseCode.get(i));
            savedLetters.add(morse);
        }
    }

    public String printSavedLetters(){
        String printEng="";
        for (int i = 0; i<savedLetters.size(); i++){
            printEng = savedLetters.get(i) + printEng;
        }
        return printEng;
    }
    public ArrayList<String> getSavedLetters() {
        return savedLetters;
    }

    public void wordToMorse(String b) {
        int secondPosition = listPosition;
        String [] engInput = b.split("");
        for (int i = 0; i<engInput.length; i++) {
            savedLetters.add(secondPosition, engInput[i]);
            listPosition++;
        }
    }

    public void getEnglishToCode() {
        String eng;
        for (int i = 0; i < savedLetters.size(); i++){
            eng = toMorse(savedLetters.get(i));
            savedMorseCode.add(eng);
        }
    }

    public String printSavedCode() {
        String printMorse = "";
        for (int i = 0; i < savedMorseCode.size(); i++){
            printMorse = savedMorseCode.get(i) + printMorse +" ";
        }
        return printMorse;
    }



}
