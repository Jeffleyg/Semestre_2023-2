import java.util. Scanner;

public class main{
    public static void main(String[] args){
        Scanner teste = new Scanner(System.in);

        int NumeroPositivo = 0;
        float Soma = 0;

        for(int i = 0; i < 6; i++){
           float valorDigitado = teste.nextFloat();

            if(valorDigitado > 0){
                NumeroPositivo++;
                Soma += valorDigitado;
            }
        }
        teste.close();
        System.out.println(NumeroPositivo + " valores psitivos \n");

        if(NumeroPositivo > 0){
            float mediaPositivo = Soma / NumeroPositivo;
            System.out.printf("%.1f%n", mediaPositivo);
        }else {
            System.out.println("0.0");
        }
    }
}