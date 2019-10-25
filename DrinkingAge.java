import java. util.*;
public class DrinkingAge{
    public static void main (String[] args){
      Scanner scan= new Scanner(System.in);
      int age;
      final int minAge=21;
      System.out.println("Input age");
        age=scan.nextInt();
      if (age >= minAge){
        System.out.println("Old enough to drink");
      }
      else
      {
        System.out.println("Not old enough to drink");
      }


    }
}
