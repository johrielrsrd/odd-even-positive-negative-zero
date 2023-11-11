import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        StringBuilder phrase = new StringBuilder();

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = scan.nextInt();

        if (number == 0)
            System.out.println("The number is zero.");
        else {

            // To check if positive, or negative.
            if (number > 0)
                phrase.append("positive");
            else
                phrase.append("negative");

            // To check if even or odd.
            if (number % 2 == 0)
                phrase.append(" even number.");
            else
                phrase.append(" odd number.");

            System.out.println("The output is a " + phrase.toString());
        }
    }
}
