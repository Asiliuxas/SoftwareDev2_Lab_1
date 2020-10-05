import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter a word.");
        Scanner sc = new Scanner(System.in);
        String entry = sc.next();
        String entry_lower = entry.toLowerCase();
        char letter_first = entry.charAt(0);
        char letter_last = entry.charAt(entry.length()-1);
        int vowels = 0;
        for (char j : entry_lower.toCharArray()){
            if (j == 'a' || j == 'e' || j == 'i' || j == 'o' || j == 'u' || j == 'y')
                vowels++;
        }
        System.out.printf("Your word entered is %s. First letter is %c, last letter is %c. It contains %d vowels",entry,letter_first,letter_last,vowels);
    }
}
