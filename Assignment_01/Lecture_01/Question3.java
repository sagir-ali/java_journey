package Assignment_01.Lecture_01;
  //===Question 3=> char ch='A';ch=(char)(char+2);ke baad ch kya hoga? Aur int mein Cast karo to kya answer aayega?
public class Question3 {
    public static void main(String[] args) {
        char ch='A';
        ch=(char)(ch+2);
        System.out.println("ch ka answer:"+ch);
        
        int ch2=(int)(ch+2);
        System.out.println("Int ka Anwer Type casting:"+ch2);
    }
}
