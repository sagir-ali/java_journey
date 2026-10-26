package Lecture_03;
 //=> Decision Making  in Java :
 //===>  Type of Decision Making statement ;
  //   1. if          2. if-else                 3.if-else if ladder statement            4. Nested if statement

public class Decision_Making {
            //====================== 3. if else if ladder ==============
            //   syntax : 
            //                if(codition 1){
            //                          first conditon 
            //                } 
            //                  else if(condition){
            //                    second condition
            //                }
            //                   else{
                //                false condition 
           //
           //                }   
           
           
          // =================> Nested if statement  ==========>
            // syntax :
           //                if(condition 1){
           //                if(condition 2){
            //                 if(condition 3){
            //                  }
            //               }
    //              }


         
         public static void main(String[] args) {
             //   ==== 1. if statement=====
         //  syntax:
           // if(condition){
                //statement executed by true value .
         //   }

            int age=20;
            if (age>=18) { //  check condition kya age 18 ya usse bada hai Agar bada hai print kar do Adult.
                System.out.println("adult");
            }
         
             //=================== 2. if else statement============================
         // syntax: 
        //               if(condition){ 
        //                         // first executed by true value
        //                        }
        //                          else{
        //                               false value;
       //                    }
            
              int item=0;
             if (item>0) {
            System.out.println("item in the store!");
           }
           else{
            System.out.println("Not item in the store !");
           }

        //  =================>  if else if =====================
            int i=20;
            if (i==10) {
                System.out.println("i is equal 10");
            }else if (i==20) {
                System.out.println("i is equal 20");
            }else{
                System.out.println("i is not present.");
            }



            //===================>  Nested if statement  ===========================>
               int a=10;
            int b=20;
            if (a==10) {
                if (b!=20) {
                    System.out.println("second condition is true b ");
                }else{
                    System.out.println("First condition is true a:");
                }
               
            
            }

         }
}
