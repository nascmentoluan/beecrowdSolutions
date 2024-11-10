import java.util.Scanner;
public class Main {
 
    public static void main(String[] args){
        Scanner ler;
        ler = new Scanner(System.in);
        int A, B, SOMA;
        A = ler.nextInt();
        B = ler.nextInt();
        SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
    }
}