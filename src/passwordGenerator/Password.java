package passwordGenerator;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

public class Password {
    protected String password;
    private final String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.:!?()[]-_#+&%$/=*";

    public Password() {
    }

    protected void generatePassword(int pwLength) throws NoSuchProviderException, NoSuchAlgorithmException {

        StringBuffer sb = new StringBuffer();
        //TODO Alphabet

        final int uprbnd = alphabet.length();
        SecureRandom srandom;
        srandom = SecureRandom.getInstance("NativePRNG", "SUN");
        for (int i = 0; i < pwLength; i++) {
            sb.append(alphabet.charAt(srandom.nextInt(uprbnd)));
        }
        this.password = sb.toString();
    }

    /**
     * @return password entropy in bit
     */
    protected double passwordStrengthEstimation() {
        return (double) password.length() * -(Math.log10(1 / (double) alphabet.length()) / Math.log10(2));

    }
}
