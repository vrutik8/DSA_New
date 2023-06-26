// Solution of 1

// import java.util.*;

// public class Praquenin{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n1 = sc.nextInt();

//         if(n1>0){
//             System.out.println("positivo");
//         }
//         else{
//             System.out.println("negativo");
//         }

//     }
// }

// Solution of 2

// import java.util.*;

// public class Praquenin {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         if(n>100){
//             System.out.println("You have a fever");
//         }
//         else{
//         System.out.println("You dont have a fever");
//         }
//         }
//     }

// Solution of 3

// import java.util.*;

// public class Praquenin{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         switch(n){
//             case 1:{
//                 System.out.println("Sunday");
//                 break;
//             }
//             case 2:{
//                 System.out.println("Monday");
//                 break;
//             }
//             case 3:{
//                 System.out.println("Tuesday");
//                 break;
//             }
//             case 4 :{
//                 System.out.println("Wednesday");
//                 break;
//             }
//             case 5 :{
//                 System.out.println("Thursday");
//                 break;
//             }
//             case 6:{
//                 System.out.println("Friday");
//                 break;
//             }
//             case 7:{
//                 System.out.println("Saturday");
//                 break;
//             }
//             default:{
//                 System.out.println("Check input");
//             }
//         }
//     }
// }
// Solution of 4
// x = false
// y = 63

// Solution of 5

import java.util.*;

public class Praquenin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%4==0){
            System.out.print("Leap Year");
        }
        else{
            System.out.print("not a Leap Year");
        }
    }
}
