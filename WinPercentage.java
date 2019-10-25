import java.util.*;
import java.text.*;
public class WinPercentage{
public static void main (String[] args){

Scanner scan=new Scanner(System.in);
DecimalFormat dec= new DecimalFormat(".##");

  int gamesPlayed;
  int gamesWon;
  double gamesWonPercent;
    System.out.println("input games played");
  gamesPlayed=scan.nextInt();
    System.out.println("input games won");
  gamesWon=scan.nextInt();


    while (gamesPlayed<gamesWon){
      System.out.println("Games played must be more than games won");

    }
    while (gamesPlayed<=0){
      System.out.println("games played must be more than zero");
    }


   gamesWonPercent = (gamesWon/((double) gamesPlayed)*100);
System.out.println("The percent of games won: %"+ dec.format(gamesWonPercent));




  }

}
