package Transaction;

import java.util.Random;

public class AuthenticationService {
    public String generateOTP() {
        Random random = new Random();
        return String.format("%06d", random.nextInt(1000000));
    }

    public boolean verifyOTP(String inputOTP, String correctOTP) {
        return inputOTP.equals(correctOTP);
    }
}
