package _10_base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

public class Java8Tester {
    public static void main(String[] args) {
        try {

            System.out.println("******************* Base64.getEncoder ***************************");
            // Temel tip base64 kodlama semasini kullanarak kodlayan bir Base64.Encoder dondurur
            String base64encodedString = Base64.getEncoder().encodeToString(
                    "TutorialsPoint?java8".getBytes("utf-8"));
            System.out.println("Base64 Encoded String (Basic) :" + base64encodedString);

            System.out.println("******************* Base64.getDecoder ***************************");
            byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
            System.out.println("Original String: " + new String(base64decodedBytes, "utf-8"));

            System.out.println("******************* Base64.getUrlEncoder ***************************");
            base64encodedString = Base64.getUrlEncoder().encodeToString(
                    "TutorialsPoint?java8".getBytes("utf-8"));
            System.out.println("Base64 Encoded String (URL) :" + base64encodedString);

            System.out.println("******************* Base64.getMimeEncoder ***************************");
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 10; ++i) {
                stringBuilder.append(UUID.randomUUID().toString());
            }
            byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
            String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
            System.out.println("Base64 Encoded String (MIME) :" + mimeEncodedString);

        } catch (UnsupportedEncodingException e) {
            System.out.println("Error :" + e.getMessage());
        }
    }
}
