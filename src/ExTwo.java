
import java.util.Scanner;

public class ExTwo {
public static  void main(String args[]){
        int a=0,b=0,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number : ");
        String s1=sc.next();
        System.out.println("Enter Second Number : ");
        String s2=sc.next();
            
        try{
            a=Integer.parseInt(s1);
            b=Integer.parseInt(s2);
            c=a/b;
        }
        catch(ArithmeticException e){
            System.out.println("You Cant Divide By Zero. Please Give Number Once Again");
            String tmp=sc.next();
            try{
                c=a/Integer.parseInt(tmp);
            }catch(NumberFormatException e1){
                c=a/2;
            }
        }
        catch(NumberFormatException e){
            System.out.println("Please Provide Numbers Only");
        }
        finally
        {
            System.out.println("This Statement Is From finally Block");
        }
        System.out.println("RESULT : "+c);
        System.out.println("End of Main");
    }    
}
