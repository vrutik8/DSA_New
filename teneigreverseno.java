import java.util.*;

public class teneigreverseno {
    public static void main(String args[]) {
        int n = 1024;
        while (n > 0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit + " ");
            // n = n / 10;
            n /= 10;
        }

    }
}
