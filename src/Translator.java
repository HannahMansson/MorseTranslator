import java.util.HashMap;

public class Translator {


    String translatedToMorse ="";
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

    public void wordToMorse(String b) {
        String [] morseInput = b.split("");
        for (int i =0; i < morseInput.length; i++){
            for (int j =0; j < morse.length; j++){
                if(morse[j]==morseInput[i]){
                   translatedToMorse+= morse[j] +" ";
                }
            }
        }
    }

    public String getWordToMorse() {
        return translatedToMorse;
    }
}
