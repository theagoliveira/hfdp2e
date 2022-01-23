import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) {
        int character;

        try (InputStream in = new LowerCaseInputStream(
            new BufferedInputStream(new FileInputStream("test.txt"))
        )) {
            while ((character = in.read()) >= 0) {
                System.out.print((char) character);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
