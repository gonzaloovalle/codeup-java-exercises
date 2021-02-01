import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Say something to Bob: ");
        String userInput = scanner.nextLine();

        if(userInput.endsWith("?")) {
            String answer = "Sure";
            System.out.println(answer);
        } else if (userInput.endsWith("!")) {
            String exclamation = "Whoa, chill out!";
            System.out.println(exclamation);
        } else if (userInput.equals("")) {
            String silent = "Fine. Be that way!";
            System.out.println(silent);
        } else {
            String reply = "Whatever";
            System.out.println(reply);
        }

    }

}
