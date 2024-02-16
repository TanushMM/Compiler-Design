import java.util.*;
import java.io.*;

public class CharacterWordLine {
    public static void characterWordLine(Scanner sc) {
        StringBuilder sb = new StringBuilder();
        int lineCount = 0;
        while (sc.hasNextLine()) {
            lineCount++;
            sb.append(sc.nextLine());
            sb.append(" ");
        }
        String str = sb.toString();
        int characterCount = str.length();

        ArrayList<String> lst = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                temp.append(str.charAt(i));
            } else {
                lst.add(temp.toString());
                temp.delete(0, temp.length());
            }
        }
        System.out.println("Character Count: " + characterCount);
        System.out.println("Line Count: " + lineCount);
        System.out.println("Word Count: " + lst.size());
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("T:\\JAVA\\college\\CompilerDesign\\sample.txt");
        Scanner sc = new Scanner(file);
        characterWordLine(sc);
    }
}