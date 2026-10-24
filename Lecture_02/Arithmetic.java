package Lecture_02;
//  1. Arithmetic Operator:==> +,-,*,/,% 

public class Arithmetic {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        //=> + Operator Add two number
        int sum=a+b;
        //=> - operator Subtract two number;
        int subtract = a-b;
          //=> * operator Multiply two number;
          int multiply=a*b;
            //=> / operator Division two number;
            int division=a/b;
              // % operator modulo two number  use in remainder ;
              int modulo=a%b;

        System.out.println("Sum:"+sum); // 15;
        System.out.println("Subtract:"+subtract); // 5
        System.out.println("Multiply:"+multiply);// 50
        System.out.println("Division:"+division);// 2
        System.out.println("Modulo:"+modulo); // 0

           
        // 2. Assingment Operator ==>  =, +=, -=, *=, /=, %=
           
        int c=4; // ==>  = operator
          c+=5; // ==> += operator ;
          int i=8;
           i-=5; // ==> -= operator ;
           int j=9;
             j*=5; //==> *= operator ;
             int h=10;
             h/=5; // ==> /= operator ;
             int k=11;
             k%=5;
           k%=5; // ==> %= operator ;
          System.out.println(" += Operator:"+c);// 9;
          System.out.println(" -= Operator:"+i);// 3
          System.out.println("*= Operator:"+j);//45 
          System.out.println("/= Operator:"+h); // 2
          System.out.println("%= Operator:"+k); //1
         
           


    }
}
