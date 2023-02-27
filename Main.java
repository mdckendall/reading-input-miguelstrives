import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.next();

        int length = word.length();
        System.out.println("The length of the word is: " + length);
  }
}