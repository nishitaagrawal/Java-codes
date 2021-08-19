package Lab1;

import java.io.Console;
import java.io.IOException;
public class ConsoleInput {
    public void fibb(int m){
        int f1=0,f2=1,f3;
        for(int i=0;i<m;i++) {
            f3 = f2 + f1;
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
        }
    }
    public static void main(String[] args) throws IOException {
        ConsoleInput f=new ConsoleInput();
        int n4;
        Console con=System.console();
        n4=Integer.parseInt(con.readLine());
        f.fibb(n4);
    }
}
