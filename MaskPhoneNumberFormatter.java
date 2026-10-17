import java.util.Scanner;

public class MaskedPhoneNumberFormatter {

    public static String maskPhoneNumber(String phone) {
        if (phone.length() < 4) {
            return "Invalid phone number";
        }

        StringBuilder masked = new StringBuilder();

        for (int i = 0; i < phone.length() - 4; i++) {
            masked.append('*');
        }

        masked.append(phone.substring(phone.length() - 4));

        return masked.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine().trim();

        System.out.println("Masked Phone Number: "
                + maskPhoneNumber(phone));

        sc.close();
    }
}
