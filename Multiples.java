import java.util.*;
public class Multiples{
  public static void main(String[] args){
  Scanner input =new Scanner(System.in);

  System.out.println("Please input your multiple");
  int multiple=input.nextInt();
  System.out.println("Please input your upper limit");
  int upperLimit=input.nextInt();

  while (multiple<0){

    System.out.println("Please input positive multiple");
    multiple=input.nextInt();
}
  while (multiple>upperLimit){
      System.out.println("input must be less than upperlimit");
      upperLimit=input.nextInt();
  }

  int counter=0;
    for  (int i=0; i <=upperLimit; i++){
    	if ((upperLimit-i) % multiple==0){
          System.out.print(upperLimit-i+" ");
          counter++;
        }
          if (counter==5 ){
      System.out.println();
        counter=0;
    }
}


        }


}
