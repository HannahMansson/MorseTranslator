import java.util.Scanner;

public class TranslatorMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Translator translate = new Translator();
        boolean wrongInput = true;

        System.out.println("Welcome to the translator!");
        System.out.println("Please, choose what you would like to translate from Morse och English,");
        System.out.println("to translate from Morse, enter M and to translate from English, enter E");

        String choice;

        choice = scan.nextLine().toUpperCase();
        switch (choice) {
            case "M":
                String morseInput = scan.nextLine().toUpperCase();
                translate.splitMorseCode(morseInput);
                translate.getCodeToEnglish();
                System.out.println(translate.printSavedLetters());
                break;
            case "E":
                String engInput = scan.nextLine().toUpperCase();
                translate.splitWordToLetters(engInput);
                translate.getEnglishToCode();
                System.out.println(translate.printSavedCode());
                break;
            default:
                System.out.println("Please only enter M or E");

        }


    }

}
/**/