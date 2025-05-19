import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static String generatePassword(int length) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols = "!@#$%&*";
        
        String allChars = upper + lower + digits + symbols;
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Generate random characters for the password
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter desired password length: ");
        int length = scanner.nextInt();

        if (length < 4) {
            System.out.println("Password should be at least 4 characters long.");
        } else {
            String password = generatePassword(length);
            System.out.println("Generated Password: " + password);
        }

        scanner.close();
    }
}