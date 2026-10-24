package Lecture_02;
  
  //====> Bitwise:=>Biwise operators operate directly on the binary representation.
   //Example: 0,1 ;
     //========> Type of Bitwise ====>
    // 1. Bitwise AND (&)Operator         2.Bitwise OR (|) Operator    3. Bitwise  XOR (^) .

public class Bitwise {
    public static void main(String[] args) {
        //AND operator 
        int a=5;      //  5 ka binary number : 0101 ;
        int b=7;      //  7 ka binary number:  0111

                    //     0  1  0   1
                    //  &  0  1  1   1
                   // -------------------
                //         0  1  0   1   ===in decimal is =5;

        int result=(a&b);
        System.out.println("AND operator:"+result);



          // OR (|) Operator 
           int  c=6;           //  6 ka binary number : 0110 ;
         int  d=5;             //  5 ka binary number:  0101

                    //     0 1 1 0
                    //  |  0 1 0 1 
                   // -------------------
                //         0 1 1 1 ===in decimal is =7;
        int res=(c|d);
        System.out.println("OR operator:"+res);
         /// XOR Operator (^) 
          int e=9;      //  9 ka binary number is : 1101
          int f= 3;      //  3 ka binary number is : 0011
           
                            //   1 0 0 1
          int re=(e^f);     // ^ 0 0 1 1
                          //-----------------
                           //    1  0 1 0
                       
           System.out.println("XOR operator:"+re);       
           
             //   Right shift Operator (>>);       2. Left Shift Operator (<<);


            // ===================Left shift Operator =====================(<<);

               int g=8;                     //                              128    64  32    16   8    4   2   1
                //                                                            0     0   0    0    1    0   0   0
               int r=(g<<1);                 //   (g<<1)                                                     
               //                                                             0      0    0    1    0    0   0 _______
               //                                                   -------------------------------------------------------
               System.out.println(" Left shift operator:"+r); //              0     0    0    1    0   0    0   __0_____

               //                                                        == Answer is :16 
                    
             //=======> Right Shift Operator ================(>>)
              
               int s=10;                     //                              128    64  32   16    8    4    2   1
                //                                                            0     0   0    0     1    0    1   0
               int ans=(s>>1);                 //   (s>>1)                                                     
                 //                                                          ____    0   0    0     0    1    0    1   0
                  //                                                -------------------------------------------------------
               System.out.println(" Right shift operator:"+ans); //            0     0   0     0    0     1    0     1    0     

               //                                                       == Answer is :5;
              
               
    }
}
