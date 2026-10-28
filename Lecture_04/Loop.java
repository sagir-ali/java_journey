package Lecture_04;
// ==> Loop =>  Type of Loop .
//     1. for loop.      2. while loop   3. do while loop.
public class Loop {
 public static void main(String[] args) {
    // === For loop ===
    // Syntax:
 //  for(initialization;condition;updating;){
 //   excute this code.
 //}
   for(int i=1;i<=10;i++){
    System.out.println(i+" ");
   }


// //  ==========    While loop ========
//   //Syntax :
//   //      initialization .
//   //       while(condtion){
//   //        code excute .
//   //    updating.
//   //}
           int n=1;
        while (n<=10) {
            System.out.println(n);
            n++;
        }

//  //  ====== do while loop =====
//  // Syntax :
//  //           initialization 
//  //            do{
//  //           code excute.
//  //              updating 
//  //            }while()
      int c=1;
         do{
          
         System.out.println("Hello Everyone");
         
         c++;
        
            

      }while(c<=5);



   // Question 1=> Find the even number 1 to 20.
            
    for(int e=1;e<=20;e++){
       if (e%2==0) {
        System.out.println(e+" ");
       }
    }


 }    
}
