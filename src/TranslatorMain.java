import java.util.Scanner;

public class TranslatorMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Translator translate = new Translator();

        String input = scan.nextLine().toUpperCase();
        while (true) {
            translate.splitMorseCode(input);
            translate.getCodeToEnglish();
            System.out.println(translate.printSavedLetters());

        }
    }

}
