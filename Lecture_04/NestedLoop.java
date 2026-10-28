package Lecture_04;
public  class NestedLoop {

    //==> Nested Loop ==> A nested loop means a loop statement inside another loop statement. That
    //   is why nested loops are also called loop inside loop.

    // Syntax: 
     /*              for(initialization; condition;increment){
                       for(initialization; condition;increment){
             //  statement of inside loop.           
             // 
                       }
                } */
    public static void main(String[] args) {
         for(int s=1;s<=3;s++){// Outer loop.    1 se lekar 3 tak chalta hai ,yani 3 rows create karta hai.
            for(int j=1;j<=3;j++){ // Inner loop. Har row ke andar ye loop 1 se 3 tak number print karta hai.
                System.out.print(j+" ");
            }
            System.out.println();  //   OutPut : 1 2 3
//                                                  1 2 3
//                                                  1 2 3
        //
       // }
        // Question => 1: Square Star Pattern .
      /*           * * * * *
                   * * * * * 
                   * * * * * 
                   * * * * *
                    
      */


  int row=4;
  int col=5;

  for (int i=1;i<=row;i++){
    for(int j=1;j<=col;j++){
        System.out.print("* ");
    }
    System.out.println();
  }

  // Question =>2 Increasing Number Pattern  and Number Pyramid .
   /*           1
                1 2
                1 2 3
                1 2 3 4 */
    for(int k=1;k<=5;k++){
        for(int j=1;j<=k;j++){
            System.out.print(j);
        }
        System.out.println();
    }

// Question => 3 Repeated Number Patter .
/*                1 
                  1 2
                  3 3 3
                  4 4 4 4
                  5 5 5 5 5       
     */         
         for (int l=1;l<=5;l++){
            for(int j=1;j<=l;j++){
                System.out.print(l+" ");
            }
             System.out.println();   
         }


// Question =>4 
/*                        1 2 3 4 5
                          1 2 3 4
                          1 2 3
                          1 2 
                          1
 */
   for (int m=1;m<=5;m++){
    for(int j=1;j<=5-m+1;j++){
        System.out.print(j+" ");
    }
    System.out.println();
   }


  }
}
}