package Assignment_01.Lecture_01;
  //==Question 2=> byte b=10;b=b+5; error kyu deta hai ?Isko kaise fix karoge?
public class Question2 {
    public static void main(String[] args) {
        byte b=10;
       // b=b+5;// Type Conversion kare ge to solve to
              // ho jaye ga par data lose hoga.
        b=(byte)(b+5);   
        System.out.println(" Answer:"+b); // 15



        
    }
}
