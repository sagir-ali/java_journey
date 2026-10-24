package Lecture_02;
 // Logical Operator:==> &&,||,!
public class Logical {
    public static void main(String[] args) {
        int age=20;
        // examlpe for: false condition;
      //  int age=110; 
        if (age>=18&&age<=100) { //  &&(AND)  Operator   in two condition are true then result true otherwise false
            System.out.println("You can vote in the election!");
        }else{
            System.out.println("You can't vote in election!");
        }


          
       //=========== OR (||) Operator==========
             int balance=700;
             if (balance<500||balance<=0) {  // OR(||) operator: If at least one condition is true ,reault is true  
                System.out.println(" low balance:! Please maintain your balance:");
             }else{
                System.out.println("Safe balance:");
             }

        
    }
}
