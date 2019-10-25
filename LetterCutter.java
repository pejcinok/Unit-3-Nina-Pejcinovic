import java.util.*;
public class LetterCutter{
  public static void main (String[] args){
    Scanner scan= new Scanner(System.in);
    System.out.println("Please type in word");
    String word;
    int length;
    word= scan.nextLine();
    length=word.length();
    char[] wordchar= word.toCharArray();
    int i;
    for (i=0;i<length;i++){
      System.out.println(word.charAt(i));
    }

  }

}
