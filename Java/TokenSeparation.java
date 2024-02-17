import java.util.*;
import java.io.*;

public class TokenSeparation {
    public static void parse(String str) {
        int len = str.length();
        StringBuilder temp = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ' ') {
                temp.append(str.charAt(i));
            } else {
                list.add(temp.toString());
                temp.delete(0, temp.length());
            }
        }
        for (String i : list) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File txt = new File("T:\\JAVA\\college\\CompilerDesign\\sample.txt");
        Scanner file = new Scanner(txt);

        StringBuilder str = new StringBuilder();
        while (file.hasNextLine()) {
            str.append(file.nextLine());
            str.append(" ");
        }
        parse(str.toString());
        file.close();
    }
}
