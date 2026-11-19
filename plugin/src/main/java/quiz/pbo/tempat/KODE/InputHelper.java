package quiz.pbo.tempat.KODE;

import java.util.Scanner;

/* ~~ Holds a single shared Scanner so that all classes read from System.in consistently ~~ */
public class InputHelper {

    /* ~~ The one and only Scanner instance used by the whole application ~~ */
    private static final Scanner SCANNER = new Scanner(System.in);

    /* ~~ Prevents instantiation of this utility class ~~ */
    private InputHelper() {
    }

    /* ~~ Reads one trimmed line, returning null when the input has ended ~~ */
    public static String readLine() {
        if (!SCANNER.hasNextLine()) {
            return null;
        }
        return SCANNER.nextLine().trim();
    }
}
