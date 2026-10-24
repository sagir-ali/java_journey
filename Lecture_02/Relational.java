package Lecture_02;

// Relational Opertor :===>: >, <, ==, <=, >= ,!= 


public class Relational {
    public static void main(String[] args) {
     int  a=10;
     int b=5;
     boolean c=(a>b); // > greater then Operator 
     boolean d=(a<b);// < less then Operator 
     boolean e=(a==b); // == double equal opertor
     boolean f=(a<=b); // <= greater then equal opertor;
     boolean g=(a>=b);  //>= less then equal operator ;
     boolean h=(a!=b); // != Not equal operator ;
     System.out.println(" > then operator: "+ c);
     System.out.println("> then operator:"+d);
     System.out.println(" == equal operator:"+e);
     System.out.println( " <= then equal opertor:"+f);
     System.out.println(">= then equal operator:"+g);
     System.out.println("!= Not equal opertor:"+h);


      int age=19;
      if (age>=18) {
        System.out.println("Adult:");    //out is age is 18 se upper hoga  tab output Adult print.
      }else{
        System.out.println("Not adult:"); //Other wise  Not adult .
      }
     
    }
    
}
