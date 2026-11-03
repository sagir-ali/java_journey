package Project_01;

import java.util.Scanner;

public class Ali_Coding {
  

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=(int)Math.floor(Math.random()*100)+1;
      System.out.print("Please enter Your Gussing Number:");
    
        int attempts=0;
        int k=5;
        boolean gussCorrect=false;
       while (!gussCorrect) {
         for(int i=0;i<=k;i++){
              int guss=sc.nextInt();
              attempts++;
              if (guss==number) {
               System.out.println("You Win ! "+ attempts +  " attempt");
               gussCorrect =true;
               break;
              }else if (guss<number) {
               System.out.println("Number greater than "+guss);
              }else{
               System.out.println("Number less than "+guss);
              }
         } 
         sc.nextLine();
         if (!gussCorrect) {
            System.out.println("You have use  all attempt : "+ k);
         }
            System.out.println("Do want to play /(yes/No)");
            String respons=sc.nextLine();
            if (!respons.equalsIgnoreCase("Yes")) {
               System.out.println("Game Over ! This number is "+number);
               break;
            
         }
       }
        sc.close();
      
    }
}
