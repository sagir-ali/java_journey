package Assignment_01.Lecture_02;
//==> Question=>2 Swap two number without using third variable ?
public class Question2 {

    public static void main(String[] args) {
        int a=20;
        int b=30;
       a=a^b;
       b=a^b;             // Using bitwise Operator is XOR (^)
       a=a^b;
        System.out.println(" Swap a into b: a "+a);
        System.out.println(" Swap b into a: b "+b);

          System.out.println("Arithmetic :"); 
       //   Using Arithmetic  Operator 
        int c=5;
        int d=8;
        c=c+d;
        d=c-d;
        c=c-d;

        System.out.println(" Swap c into d: c "+c);
        System.out.println(" Swap d into c: d "+d);

        





    }
}
