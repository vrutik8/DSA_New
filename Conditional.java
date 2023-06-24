import java.util.*;

public class Conditional{
public static void main(String args[]){
  int age = 16;
  if(age>=18){
    System.out.println("you are an adult");
  }
   if(age>12 && age<=18){
    System.out.println("you are teenager");
  }
  else{
    System.out.println("you are child");
  }
}
}