import java.util.HashSet;

public class OTPGenerator {
	 public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;// Generate a 6-digit OTP 
    }

    // Method to ensure all OTP numbers are unique
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> otpSet = new HashSet<>();
        
        for (int otp : otps) {
            // If the set already contains the OTP, it's not unique
            if (!otpSet.add(otp)) {
                return false; // Duplicate found
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        // Array to store the generated OTP numbers
        int[] otps = new int[10];
        
        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP #" + (i + 1) + ": " + otps[i]);
        }

        // Check if all OTPs are unique
        if (areOTPsUnique(otps)) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are duplicated.");
        }
    }
}