import java.util.*;
public class MinOfThree{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int input1;
    int input2;
    int input3;
    int minValue;
    System.out.println("input three integer values");

    input1=scan.nextInt();
    input2=scan.nextInt();
    input3=scan.nextInt();

    if (input1<=input2 && input1<=input3)
        System.out.println("Min value is " + input1);
      else if (input2<=input1 && input2<=input3)
        System.out.println("Min value is " + input2);
      else if (input3<=input1 && input3<=input2)
        System.out.println("Min value is " + input3);


  }
}
