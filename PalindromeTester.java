import java.util.*;
public class PalindromeTester{
  public static void main (String[] args){

    Scanner scan= new Scanner(System.in);
    System.out.println("Would you like to use palindrome tester? Reply y or n");
    Char reply;
    reply=scan.next.CharAt(0);

      While (reply=y) {
        System.out.println("Please type in phrase");


    String palindrome;
    String palindromeLower;
    String palindromeFinal;
    palindrome= scan.nextLine();
    palindromeLower=palindrome.toLowerCase();
    palindromeFinal=palindromeLower.replace(" ","");

String palReverse = "";

for(int i = palindromeFinal.length() - 1; i >= 0; i--)
{
    palReverse = palReverse + palindromeFinal.charAt(i);
}

 int index= palindromeFinal.compareTo(palReverse);
 if (index!=0)
    System.out.println("Not a palindrome:(");
      else
        System.out.println("Your phrase is a palindrome!");

System.out.println("Thank you for using palindrome tester");

}
  }


}
