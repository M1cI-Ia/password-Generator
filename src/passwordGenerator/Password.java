package passwordGenerator;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

public class Password {
    protected String password;


    public Password() {
    }

    protected void generatePassword(int pwLength) throws NoSuchProviderException, NoSuchAlgorithmException {

        StringBuffer sb = new StringBuffer();
        //TODO Alphabet
        String alphabet = "abc";
        SecureRandom srandom;
        srandom = SecureRandom.getInstance("NativePRNG", "SUN");
        for (int i = 0; i < pwLength; i++) {
            sb.append(alphabet.charAt(srandom.nextInt(3)));
        }
        System.out.println(sb);
        this.password = sb.toString();
    }

}
