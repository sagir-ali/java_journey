package Lecture_02;
  
   //===> Unary Operators: Unary operator need only one operand.
   // =====Type of Unary operator =======
   // 1. Increment Operator          2.  Decrement Operator   
     
public class Unary {
    public static void main(String[] args) {
        // Increment Operator two types 
        // 1. Post -  increment  (++)           2. (++)Pre- increment 
          int a=5;
          a++;   //Post-Increment 
             System.out.println("Post increment:"+a);
            int b=10;
            int c=++b;//Pre- increment
         
                System.out.println("Pre- increment:"+c);

      // =====Decrement Operator================
      // 1.Post -Decrement(--)            2. (--)Pre-Decrement 
      int d=10;
        d--;
        System.out.println("Post-Decrement:"+d);

     //==Pre-Decrement====
     int f=10;
            --f;
      int h=f;
      --h;
      System.out.println("Pre-Decrement:"+f);
     System.out.println("Pre-Decrement:"+h);


      
        
    }
}
