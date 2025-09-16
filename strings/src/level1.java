
import java.util.*;

//1-
class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean customResult = compareStrings(str1, str2);
        boolean builtInResult = str1.equals(str2);

        System.out.println("Custom Comparison Result: " + customResult);
        System.out.println("Built-in equals() Result: " + builtInResult);
        System.out.println("Are both results same? " + (customResult == builtInResult));
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}


//2-
class SubstringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String customSubstring = createSubstring(text, start, end);
        String builtInSubstring = text.substring(start, end);

        System.out.println("Custom Substring: " + customSubstring);
        System.out.println("Built-in Substring: " + builtInSubstring);
        System.out.println("Are both substrings equal? " + compareStrings(customSubstring, builtInSubstring));
    }

    public static String createSubstring(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}
//3-
class StringToCharArrayComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] customChars = getChars(text);
        char[] builtInChars = text.toCharArray();

        System.out.println("Custom Char Array: " + Arrays.toString(customChars));
        System.out.println("Built-in Char Array: " + Arrays.toString(builtInChars));
        System.out.println("Are both arrays equal? " + Arrays.equals(customChars, builtInChars));
    }

    public static char[] getChars(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }
}


//4-
class NullPointerDemo {
    public static void main(String[] args) {
        generateException();
        handleException();
    }

    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // Will throw NullPointerException
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}


//5-
class StringIndexDemo {
    public static void main(String[] args) {
        generateException();
        handleException();
    }

    public static void generateException() {
        String text = "Hello";
        System.out.println(text.charAt(10)); // Will throw exception
    }

    public static void handleException() {
        try {
            String text = "Hello";
            System.out.println(text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}


//6-
class IllegalArgumentDemo {
    public static void main(String[] args) {
        generateException();
        handleException();
    }

    public static void generateException() {
        String text = "Java";
        System.out.println(text.substring(4, 2)); // Will throw exception
    }

    public static void handleException() {
        try {
            String text = "Java";
            System.out.println(text.substring(4, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }
}


//7-
class NumberFormatDemo {
    public static void main(String[] args) {
        generateException();
        handleException();
    }

    public static void generateException() {
        String text = "abc123";
        int num = Integer.parseInt(text); // Will throw exception
    }

    public static void handleException() {
        try {
            String text = "abc123";
            int num = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }
}


//8-
class ArrayIndexDemo {
    public static void main(String[] args) {
        generateException();
        handleException();
    }

    public static void generateException() {
        String[] names = {"Alice", "Bob"};
        System.out.println(names[5]); // Will throw exception
    }

    public static void handleException() {
        try {
            String[] names = {"Alice", "Bob"};
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}


//9-
class ToUpperCaseComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String customUpper = toUpperCaseCustom(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("Custom Uppercase: " + customUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Are both equal? " + compareStrings(customUpper, builtInUpper));
    }

    public static String toUpperCaseCustom(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                sb.append((char)(c - 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}


//10-
class ToLowerCaseComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String customLower = toLowerCaseCustom(text);
        String builtInLower = text.toLowerCase();

        System.out.println("Custom Lowercase: " + customLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Are both equal? " + compareStrings(customLower, builtInLower));
    }

    public static String toLowerCaseCustom(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sb.append((char)(c + 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}