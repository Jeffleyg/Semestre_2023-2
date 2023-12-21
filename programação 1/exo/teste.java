import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int positivos = 0;
        double somaPositivos = 0;
        
        for (int i = 0; i < 6; i++) {
            double valor = sc.nextDouble();
            if (valor > 0) {
                positivos++;
                somaPositivos += valor;
            }
        }
        
        sc.close();
        
        System.out.println(positivos + " valores positivos");
        if (positivos > 0) {
            double media = somaPositivos / positivos;
            System.out.printf("%.1f%n", media);
        } else {
            System.out.println("0.0");
        }
    }
}
