import java.util.Scanner;
import java.util.Random;

class Game{
 Scanner sc = new Scanner(System.in);
 Random rand = new Random();
 int random=rand.nextInt(1,100);
 int num;
 static int i=100;
 static int j=0;
 public void startGame(){
    System.out.print("Choose a number from 1 to 100 for playing this game : ");
    num=sc.nextInt();
    if(num==random){
        System.out.println("Congratulations ! \n\tYou guess a correct number.");
    }
    else{
        i=i-2;
        j=j+1;
        if(num>random){
            System.out.println("Hint : \n  OOPS ! Your number is greater than the number you are guessing.");
        }
        else if(num<random){
            System.out.println("Hint : \n  OOPS ! Your number is lesser than the number you are guessing.");
        }
        while(num!=random){
            System.out.println();
            System.out.print("Again choose a number from 1 to 100 : ");
            num=sc.nextInt();
            if(num>random){
               System.out.println("Hint : \n  OOPS ! Your number is greater than the number you are guessing.");
            }
            else if(num<random){
               System.out.println("Hint : \n  OOPS ! Your number is lesser than the number you are guessing.");
            }
            else{
               System.out.println("-------------------------------------------------------------"+"\nCongratulations ! \n\tYou guess a correct number.");
            }
            i=i-2;
            j=j+1;
        }
    }    
 }
 public void score(){
    System.out.println("Attempts taken by you to guess a number are : "+(j-1));
    System.out.println("And your score is : "+(i+2));
    System.out.println("-------------------------------------------------------------");
 }
}

public class Number_Guessing_Game {
    public static void main(String[] args) {
     System.out.println("\t\t\t-------------------------------------------------------");
     System.out.println("\t\t\t|              GUESSING THE NUMBER GAME               |");
     System.out.println("\t\t\t-------------------------------------------------------");
     Game play = new Game();
     play.startGame();
     play.score();
    }
}
