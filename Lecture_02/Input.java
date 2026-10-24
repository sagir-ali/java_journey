package Lecture_02;

import java.util.Scanner; // Ye 

//======= Input in Java ==>  Improt the package in Scanner class.
public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // number input ke liye 
        int num1=sc.nextInt();// input ke liye.
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println(sum);


       // ===== Type of Input in user =======
       // 1. Integer => sc.nextInt();
       // 2. Float => sc.nextFloat();
       // 3. double => sc.nextDouble();
       // 4. String => sc.nextLine();
       // 5. char => sc.next();
       // 6. short => sc.nextShort();
       // 7. byte=> sc.nextByte();
       // 8.long => sc.nextLong();


    }
    
}
