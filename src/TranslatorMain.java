import java.util.Scanner;

public class TranslatorMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Translator translate = new Translator();

        System.out.println("Welcome to the translator!");
        System.out.println("Please, choose what you would like to translate from Morse och English,");
        System.out.println("to translate from Morse enter 1, to translate from English enter 2");
        String choice = scan.nextLine().toUpperCase();

        while (true) {
            if (choice.equals("M")) {
                System.out.println(translate.MorseToEng(scan.nextLine()));
            } else if (choice.equals("E")) {
                System.out.println(translate.EngToMorse(scan.nextLine().toUpperCase()));
            }
        }
    }
}