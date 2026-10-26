package Lecture_03;

public class Switch {
    //==> Switch is the optamize int if else if  ladder ;
     // Note:  switch is the button type click then work.
     // syntax:
      //   switch(expression){
      //case 1:
      //   excute statement 
      //     break;
      // case 2: 
      //  excute statement
     //     break;
     //     default :
     //     excute statement
      //}
    public static void main(String[] args) {
        // Example:  Number 5 print;
        int num=5;
        switch(num){   // switch (expression) ---> byte ,short , int ,char, Enumeration
            case 1:
                System.out.println("1 is equal of number 5");
                break;
            case 2:
                System.out.println(" 2 is equal of number 5");  
                break;  
                   case 3:
                System.out.println(" 3 is equal of number 5");  
                break;  
                   case 4:
                System.out.println(" 4 is equal of number 5");  
                break;  
                   case 5:
                System.out.println(" 5 is equal of number 5");  
                break;  
            default :
                 System.out.println("Not a number .");
                 break;



 //      1.  switch ---> limited use case --> should evaluate to byte ,short,int , char, Enumeration .
//       2.   No duplicate case allowed .
//       3.   After JDK7 String can also be used as switch expression .
//       4.   After JDK-14 swiich is enhanced too much .
        }

        // Question > Find the day of weak ?

         int day=7;
         switch (day) {
            case 1:
                System.out.println("Monday");
                break;
               case 2:
                System.out.println("Tuesday");
                break;
                  case 3:
                System.out.println("Wednesday");
                break;
                  case 4:
                System.out.println("Thursday");
                break;
                  case 5:
                System.out.println("Friday");
                break;
                  case 6:
                System.out.println("Saturday");
                break;
                  case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid day");
                break;
         }

    }
}
