import java.util.*;
public class Temperature{
  public static void main (String[] args){
    Scanner scan=new Scanner (System.in);
    double temperature;
    final int cold = 45;
    final int cool= 67;
    final int ideal= 83;
    final int hot= 84;
    System.out.println("input temp:");
    temperature=scan.nextInt();
      if (temperature<cold)
        System.out.println("cold");
      else if (temperature<=cool)
        System.out.println("Cool");
      else if (temperature<=ideal)
        System.out.println("ideal");
      else if (temperature>83)
        System.out.println("hot");



  }
}
