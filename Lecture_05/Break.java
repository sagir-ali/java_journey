package Lecture_05;
// >== Jump Statement ===>
    // type of Jump Statement 
 //    1. break        2.  continue      3.   return 
public class Break {
    public static void main(String[] args) {

        //==========> Break statement ===>
    
        for(int i=1;i<=10;i++){
            if (i==5) {
                break;//  5 number that stop the loop.
         
            }
            System.out.print(i+" ");
        }

     //  ========= Continue statement =========
      for(int i=1;i<=10;i++){
        if (i==5) {
            continue;     //  1, 2, 3, 4 skip ,6,7, 8, 9,10 and print number 
        }
        System.out.println(i+" ");

      }

     // ======== return Statement  =======
    
       //  return is used to exit from a method,with or without a value.
       // 1. Method returning a value .
      //  2. Method not returniga value .

    

    }
}
