import java.util.Scanner;
public class Main {
 
    public static void main(String[] args){
        int A, B, PROD;
        Scanner ler;
        ler = new Scanner(System.in);
        A = ler.nextInt();
        B = ler.nextInt();
        PROD = A * B;
        System.out.println("PROD = " + PROD);
    }
 
}
