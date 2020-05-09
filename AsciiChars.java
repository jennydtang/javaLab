
public class AsciiChars {

    public static void printNumbers() {
        int i;
        for (i = 97; i <= 122; i++) {
            System.out.println((char) i + " = " + i);
        }

    }

    public static void printUpperCaseLetters() {
        System.out.println("\nAlphabet in uppercase :");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.printf("%s ", ch);
        }
    }

    public static void printLowerCaseLetters() {
        System.out.println("Alphabet in lowercase: ");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.printf("%s ", ch);
        }

    }

    public static void main(String[] args) {
        AsciiChars.printNumbers();
        AsciiChars.printLowerCaseLetters();
        AsciiChars.printUpperCaseLetters();
    }

}
