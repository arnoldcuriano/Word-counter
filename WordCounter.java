import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Split the input string by whitespace to get an array of words
        String[] words = input.split("\\s+");

        // Count the number of words
        int wordCount = words.length;

        System.out.println("Number of words in the input: " + wordCount);

        scanner.close();
    }
}
