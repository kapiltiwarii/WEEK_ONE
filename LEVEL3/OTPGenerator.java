import java.util.*;
public class OTPGenerator {

    // Method to generate a 6-digit
    public static int generateOTP() {
        // Generate a random number
        return (int) (Math.random() * 900000);
    }

    // Method to check that the OTP numbers generated are unique
    public static boolean areUniqueOTPs(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate OTP found
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Creating Array to store the generated OTPs
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP  " + (i + 1) + ": " + otps[i]);
        }

       
        if (areUniqueOTPs(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are duplicated.");
        }
    }
}


