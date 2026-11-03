import java.security.MessageDigest;

public class CodeFingerprint {

    public static String generateFingerprint(String code) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte[] hash = md.digest(code.getBytes());

            StringBuilder result = new StringBuilder();

            for (byte b : hash) {
                result.append(String.format("%02x", b));
            }

            return result.toString();

        } catch (Exception e) {
            return "Error generating fingerprint";
        }
    }

    public static void main(String[] args) {

        String code = "int a = 10; int b = 20;";

        String fingerprint = generateFingerprint(code);

        System.out.println("Original Code: " + code);
        System.out.println("Fingerprint: " + fingerprint);
    }
}
