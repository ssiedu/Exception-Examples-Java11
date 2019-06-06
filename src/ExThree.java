
import java.util.Scanner;

public class ExThree {

    public static void main(String args[]) {
        int a = 0, b = 0, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        String s1 = sc.next();
        System.out.println("Enter Second Number : ");
        String s2 = sc.next();

        try {
            a = Integer.parseInt(s1);
            b = Integer.parseInt(s2);
            
            if(b>a){
                //ArithmeticException ob=new ArithmeticException();
                BigNumberException ob=new BigNumberException();
                throw ob;
            }
            
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Handled");
            c=a/2;
        } catch (BigNumberException e){
            System.out.println("You cant divide a small number by large number");
        }
        System.out.println("RESULT : " + c);
        System.out.println("End of Main");
    }
}
