import java.util.*;
public class DrivingAndDrinking{
  public static void main (String[] args){
    Scanner scan=new Scanner(System.in);
    int age;
    final int minDrive= 17;
    final int minDrink=21;
      System.out.println("input age:");
      age= scan.nextInt();
      if (age<=minDrive){
        System.out.println("Not old enough to drink or drive");
      }
        else if (age>=minDrink){
            System.out.println("old enough to drive and drink");
          }
          else
          {
            System.out.println("Old enough to drive, not old enough to drink");
        }


  }
}
