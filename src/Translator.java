import java.util.HashMap;

public class Translator {

    final char [] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
            'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.', ',', '?'};
    final String[] morse = {"*-", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**",
            "*---", "-*-", "*-**", "--", "-*", "---", "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--",
            "-**-", "-*--", "--**", "*----", "**---", "***--", "****-", "*****", "-****", "--***", "---**", "----*",
            "-----", "*-*-*-", "--**--", "**--**"};

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

    public String EngToMorse(String s) {
        String myString ="";
        String[] input = s.split("");
        for (int i = 0; i < input.length; i++) {
            myString +=getEngToMorse().get(input[i]);
            if (i != input.length -1){
                myString +=" ";
            }
        }
        return myString;
    }

    public String MorseToEng(String s) {
        String myString ="";
        String[] input = s.split(" ");
        for (int i = 0; i < input.length; i++) {
            myString += getMorseToEng().get(input[i]);
        }
        return myString;
    }
}
