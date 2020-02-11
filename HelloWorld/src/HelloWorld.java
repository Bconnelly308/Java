/*
   AddictionPrctice.java
   Created By: Brittney Connelly
   Date Created: 11/6/2015
   Makes up random addition problems.
   Reads in users answer.
   Tell user if they are correct or wrong.
   Prints out their 'score'.
*/

import java.util.Scanner;

public class AdditionPractice
{
   public static void main(String[] args)
   {
            
      int answer = 0;
      int score = 0;
      int count = 0;
      int operand1 = 0;
      int operand2 = 0;
      
      while( count < 10)
      {
         Scanner scan = new Scanner(System.in);
         operand1 = pickNumber();
         operand2 = pickNumber();
         
         System.out.println("What is " + operand1 + " + " + operand2);
         answer = scan.nextInt();
         
         if( answer == operand1 + operand2 )
         {
            System.out.println("You're correct!");
            System.out.println(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
            score++;
         }
         
         else
         {
            System.out.println("You're incorrect!");
            System.out.println(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
         }
         count++;
      }
      System.out.println("You're score is " + score*10 + "%");
   }
   public static int pickNumber()
   {
      return (int)(20*Math.random())+1;
   }
}