import java.util.*;

public class nineigpassorfail{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int mks = sc.nextInt();

        String rst = (mks>=35) ? "Pass" : "Fail";
     
        System.out.println(rst);
    }
}
