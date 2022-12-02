import java.util.Scanner;

public class BasicCalculator {

    public static void input(){
 System.out.println("Enter the values of a and b");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
         System.out.println("Enter the operarion you want to perform");
        char ch = s.next().charAt(0);
        calculation(a,b,ch);
    }

    public static void calculation(int a, int b,char ch) {   
       
        switch (ch) {
        case '+':
        System.out.println(a + b);
        break;
        case '-':
        System.out.println(a-b);
        break;
        case '*':
        System.out.println(a*b);
        break;
        case '/':
        try{
        System.out.println((double)a/b);
    }catch(Exception e){
        System.out.println(e);
    }
        break;
        case '%':
        System.out.println(a%b);
        break;
        default:
        System.out.println("Enter a valid basic operation");
    }input();
    }

    public static void main(String[] args) {
        input();
    }

}