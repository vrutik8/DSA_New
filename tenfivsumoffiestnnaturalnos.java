import java.util.*;

public class tenfivsumoffiestnnaturalnos {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= user) {
            sum = sum + i;
            i++;
        }
        System.out.println("SUM " + sum);
    }
}
