import java.util.*;
import java.io.*;

public class VowelsConsonants {
    public static void vowelsConsonants(Scanner sc) {
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) {
            sb.append(sc.nextLine());
            sb.append(" ");
        }
        String str = sb.toString();
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            } else if (c != ' ') {
                consonantCount++;
            }
        }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("T:\\JAVA\\college\\CompilerDesign\\sample.txt");
        Scanner sc = new Scanner(file);
        vowelsConsonants(sc);
    }
}
