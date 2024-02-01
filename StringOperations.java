import java.util.*;

// String Operations without using inbuilt string functions except some essentials

public class StringOperations {
    // return string length
    public static int stringLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }

    // checks if string is empty
    public static boolean isEmpty(String str) {
        if (stringLength(str) > 0) {
            return false;
        } else {
            return true;
        }
    }

    // concats two strings
    public static String concatenate(String s1, String s2) {
        return s1 + s2;
    }

    // converting string to character array
    public static char[] toCharacterArray(String str) {
        char[] array = new char[stringLength(str)];
        for (int i = 0; i < stringLength(str); i++) {
            array[i] = str.charAt(i);
        }
        return array;
    }

    // substring from start to end index
    public static String subString(String str, int start, int end) throws IndexOutOfBoundsException {
        char[] array = toCharacterArray(str);
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(array[i]);
        }
        return sb.toString();
    }

    public static String stringReplace(String str, char OLD, char NEW) {
        char[] cArray = toCharacterArray(str);
        for (int i = 0; i < stringLength(str); i++) {
            if (cArray[i] == OLD) {
                cArray[i] = NEW;
            }
        }
        return new String(cArray);
    }

    public static ArrayList<String> splitString(String str) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringLength(str); i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            } else {
                list.add(sb.toString());
                sb.delete(0, sb.length());
            }
        }
        list.add(sb.toString());
        return list;
    }

    // String equals
    public static boolean isEqual(String s1, String s2) {
        if (stringLength(s1) != stringLength(s2)) {
            return false;
        }
        for (int i = 0; i < stringLength(s1); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // string length
        System.out.println(stringLength("hello"));

        // isEmpty()
        System.out.println(isEmpty("hello"));

        // String concatenate
        System.out.println(concatenate("Hello", "World"));

        // String to character array
        char[] cArray = toCharacterArray("Hello");
        for (char c : cArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // subString()
        String str = "hello";
        System.out.println(subString(str, 1, 3));

        // stringReplace()
        System.out.println(stringReplace(str, 'l', 'x'));

        // String Split
        System.out.println(splitString("This is a test This is another test"));

        // String isEqual()
        String str2 = "hellO";
        System.out.println(isEqual(str, str2));
    }
}
