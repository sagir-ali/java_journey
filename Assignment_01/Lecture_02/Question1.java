package Assignment_01.Lecture_02;
 //==> int a=20; ke liye a<<2 aur a>>1 ka answer kya hoga?
public class Question1 {
    public static void main(String[] args) {
        int a=20;
         a=(a<<2);
        System.out.println("Left shift:"+a);


    //       20 ka (a<<2)                     128     64      32      16       8       4       2      1
    //                                        0       0       0       1        0        1      0      0
    //                                    ----------------------------------------------------------------------
    //                                        0       1       0       1        0        0   ______   ______            Left shift
    //                                       ------------------------------------------------------------                                                                  
    //                                        0       1       0       1        0        0     __0___    __0___
    //                           
    //                   Anwer is : = 20 * (2^2);


   // ===> Right shift Operator===
      int b=20;
      b=(b>>1);                                    
      System.out.println("Right shift:"+b);
                                                            
      //                                     128      64      32      16      8    4      2     1
      //                                     0        0        0       1      0    1      0     0
      //                                 -------------------------------------------------------------   
      //                                  ______      0         0      0      1    0      1      0              //Right shift
      //                                  ---------------------------------------------------------------
      //                                              0         0      0      1    0      1      0
        
      //                     Answer is := 20 / 2=10;


    }
}