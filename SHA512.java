import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA512 {

    public static void main(String[] args) {
        String text = "Hello, SHA-512!";

        try {
            // Create MessageDigest instance for SHA-512
            MessageDigest md = MessageDigest.getInstance("SHA-512");

            // Add text bytes to digest
            md.update(text.getBytes());

            // Get the hash's bytes
            byte[] digest = md.digest();

            // Convert bytes to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }

            System.out.println("SHA-512 Hash: " + sb.toString());

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
