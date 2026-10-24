 package Lecture_01;

public class TypeConversion {
    public static void main(String[] args) {
        //===Not type conversion=====
        char c='a';
        int a=c;
        System.out.println("Simple:"+a);

          //====Type conversion ====
        
        /// conversion karne par  data lost hota hai;
        /// Agar karna bhi ho to  kisme bhi (data type likhte hai);
        

        //========Explicite convertion======
        int i=300;
        byte b=(byte)i;//-127 to +127
        
        System.out.println("Byte:"+b);
          
     //Tuncating conversion

    ///=====Float to decimal conversion======
      double d=100.04;
      float f=(float) d;
      System.out.println("Float:"+f);

      //===Boolean to any data type=====
      
      //These conversion are not possible
      //  Example:
      boolean bool=true;
     /// int n=bool;
     System.out.println(" Boolean:"+bool);
          //Error   

         //===== Automatic Type promotion======
         //Automatic convert hota hai with help by java

         //Example:
         //byte a=50; ====> -127 to +127
         //byte b=40;
         //byte c=a*b;
     //    System.out.println(c);
     ///Error aye ga  
         

        //sahi karne ke liye
      //  byte ===> int
        byte m=50;
         byte p=40;
         byte q=(byte)(m*p);
        System.out.println("Multiply:"+q);

        // Your Question 1 ====> Solve this question type converstio
        //  byte r=50;
        //  r= b*2;
           

        //Question 2 =>Type converstion
           //(f*b),(i/c),(d*s);print result?
           
               
        /*
         byte b=42;
         char c='a'
          short s=1024
           int i=50000
            float f=5.78f
             double d=0.1234 
              
               double result=    ?
               */

               











    }
}
