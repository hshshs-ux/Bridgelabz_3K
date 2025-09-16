
import java.util.*;
//1-
class StringLengthCustom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        int customLength = getLength(text);
        int builtInLength = text.length();

        System.out.println("Custom Length: " + customLength);
        System.out.println("Built-in Length: " + builtInLength);
    }

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
}


//2-
class SplitWordsCustom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] customWords = splitWords(text);
        String[] builtInWords = text.split(" ");

        System.out.println("Custom Split: " + Arrays.toString(customWords));
        System.out.println("Built-in Split: " + Arrays.toString(builtInWords));
        System.out.println("Are both equal? " + Arrays.equals(customWords, builtInWords));
    }

    public static String[] splitWords(String str) {
        List<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (sb.length() > 0) {
                    words.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(ch);
            }
        }
        if (sb.length() > 0) words.add(sb.toString());

        return words.toArray(new String[0]);
    }
}


//3-
class WordsWithLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] wordLengthArray = getWordLengths(words);

        System.out.println("Word\tLength");
        for (String[] row : wordLengthArray) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static String[] splitWords(String str) {
        List<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (sb.length() > 0) {
                    words.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(ch);
            }
        }
        if (sb.length() > 0) words.add(sb.toString());

        return words.toArray(new String[0]);
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }
}


//4-
class ShortestLongestWord {
    public static void main(String[] args) {
        String text = "Java is a powerful programming language";
        String[] words = text.split(" ");
        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
            if (word.length() > longest.length()) longest = word;
        }

        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
    }
}

//5-
class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int[] result = countVowelsConsonants(text);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }

    public static int[] countVowelsConsonants(String s) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }
}


//6-
class TrimSpacesCustom {
    public static void main(String[] args) {
        String text = "   Hello World   ";
        String customTrimmed = trimCustom(text);
        String builtInTrimmed = text.trim();

        System.out.println("Custom Trim: '" + customTrimmed + "'");
        System.out.println("Built-in Trim: '" + builtInTrimmed + "'");
        System.out.println("Are both equal? " + customTrimmed.equals(builtInTrimmed));
    }

    public static String trimCustom(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) sb.append(s.charAt(i));
        return sb.toString();
    }
}


//7-
class VotingEligibility {
    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] results = checkVoting(ages);

        System.out.println("Age\tCan Vote");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(80); // random age 0-79
        }
        return ages;
    }

    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "True" : "False";
        }
        return result;
    }
}