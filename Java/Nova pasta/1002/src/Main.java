import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner ler;
        ler = new Scanner(System.in);
        double raio;
        double area;
        //float pi = 3.14159f;
        raio = ler.nextDouble();
        area = (raio * raio) * 3.14159;
        System.out.printf("A=%.4f\n", area);

    }
}
