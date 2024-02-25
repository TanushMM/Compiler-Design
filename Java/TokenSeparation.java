import java.util.*;
import java.io.*;

public class TokenSeparation {
    public static void parse(String str) {
        int len = str.length();
        StringBuilder temp = new StringBuilder();
        ArrayList<String> integers = new ArrayList<>();
        ArrayList<String> constants = new ArrayList<>();
        ArrayList<String> operators = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                temp.append(c);
            } else if (Character.isLetter(c)) {
                temp.append(c);
            } else {
                if (temp.length() > 0) {
                    if (Character.isDigit(temp.charAt(0))) {
                        integers.add(temp.toString());
                    } else {
                        constants.add(temp.toString());
                    }
                    temp.delete(0, temp.length());
                }
                if (c != ' ') {
                    operators.add(Character.toString(c));
                }
            }
        }
        if (temp.length() > 0) {
            if (Character.isDigit(temp.charAt(0))) {
                integers.add(temp.toString());
            } else {
                constants.add(temp.toString());
            }
        }

        System.out.println("Integers:");
        for (String integer : integers) {
            System.out.println(integer);
        }

        System.out.println("\nConstants:");
        for (String constant : constants) {
            System.out.println(constant);
        }

        System.out.println("\nOperators:");
        for (String operator : operators) {
            System.out.println(operator);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File txt = new File("T:\\CompilerDesign\\Java\\sample.txt");
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