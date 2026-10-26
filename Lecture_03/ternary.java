package Lecture_03;

public class ternary {
    // > Ternary Operator=> the ternary operator is a condition operator that provide to shorthand
    //                       way to write simple if-else statement.
     //sytanx:  condition ? Expression true: Expression false;

     public static void main(String[] args) {
        // Example: 
        int a=10;
        int b=20;
        int max=(a>b)?a:b;
        System.out.println(max);

 
         // Question >= What is the output of the following nested ternary expression ?
         //int x=5; int y=10; int z=15;
         int x=5;
         int y=10;
         int z=15;
         int res=(x>y)?(x>z?x:z):(y>z?y:z);
         System.out.println(res);




     }
}
