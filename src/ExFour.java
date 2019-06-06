public class ExFour {
    
    public static void div(int x, int y){
        System.out.println("Start-of-Div");
        try{
        System.out.println(x/y);
        }catch(ArithmeticException e){
            System.out.println("Handled In Div");
        }
        System.out.println("End-of-Div");
    }
    public static void callDiv(int p, int q){
        System.out.println("Start-of-CAllDiv");
        try{
        div(p,q);
        }catch(ArithmeticException e){
            System.out.println("Handled In CallDiv");
        }
        System.out.println("End-of-CallDiv");
    }
    public static void main(String args[]){
        System.out.println("Start-of-Main");
        int a=10;
        int b=0;
        try{
        callDiv(a,b);
        }catch(ArithmeticException e){
            System.out.println("Handled In Main");
        }
        System.out.println("End-of-Main");
    }
    
}
