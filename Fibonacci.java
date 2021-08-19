package Lab1;

public class Fibonacci {
    public void fibonacci(int m){
        int f1=0,f2=1,f3;
        for(int i=0;i<m;i++) {
            f3 = f2 + f1;
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
        }
    }
    public static void main(String[] args) {
        Fibonacci ff=new Fibonacci();
        int n=Integer.parseInt(args[0]);
        ff.fibonacci(n);
    }
}
