/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/
//Pergunta 1
#include <stdio.h>

int main(int argc, char const *argv[])
{
    float horas, valor, salario, Salario;
    printf("Digite o numero de horas: ", horas);
    scanf("%f", &horas);
    
    printf("Digite o valor de horas de trabalho: ");
    scanf("%f", &valor);
    
    salario = horas * valor;
    Salario = salario + (salario * 0.05);
    
    printf("O salario final é : %.2f", Salario);
    return 0;
}

// pergunta 2

/*
#include <stdio.h>

int main(int argc, char const *argv[])
{
    
    float preço, valor;
    int forma;
    printf("Digite o preço do produtos: \n");
    scanf("%f", &preço);
    printf("\n");
    printf("Digite 1 para à vista e 2 para a prazo!!!! \n" );
    printf("\n");
    printf("Digite a forma de pagamento: \n");
    scanf("%d", &forma);
    if (forma == 1){
        valor = preço - (preço * 0.05);
    } else{
        valor = preço + (preço * 0.10);
    }

    printf("O valor a pagar é : R$ %.2f", valor);
    

    return 0;
}


// pergunta 3 

#include <stdio.h>

int main(int argc, char const *argv[])
{
    int hora_incio, hora_fim, duracao;
    printf("Início: ");
    scanf("%d", &hora_incio);
    
    printf("Fim: ");
    scanf("%d", &hora_fim);
    
    if (hora_incio > hora_fim){
        duracao = (24 - hora_incio) + hora_fim;
    } else {
        duracao = hora_fim - hora_incio;
    }

    printf("Duração: %d horas", duracao);

    return 0;
}

// pergunta 4 

#include <stdio.h>

int main(int argc, char const *argv[])
{
    int num[4], num_positivos = 0, num_negativos = 0;
    
    for(int i = 0; i < 4; i ++){
        printf("Digite o %de numero: ", i + 1);
        scanf("%d", &num[i]);
        
        if (num[i] >= 0){
            num_positivos++;
            
        } else {
            num_negativos++;
        }
        
    }
    
    printf("%d (+) e %d (-)", num_positivos, num_negativos);
    
    
    return 0;
}

// pergunta 5 

#include <stdio.h>

int main(int argc, char const *argv[])
{
    int i = 0;
    printf("Posição: ");
    scanf("%d", &i);
    
    if (i >= 1 && i <= 5) {
        printf("Top 5\n");
    }else if (i >= 6 && i <= 10 ) {
        printf("Top 10");
    }else if (i >= 11 && i <= 20) {
        printf("Top 20");
    }else if (i >= 21 && i <= 30) {
        printf("Top 30");
    }else {
        printf("Top 100");
    }
      
    return 0;
}

// pergunta 6 

#include <stdio.h>

int main(int argc, char const *argv[])
{
    int Idade;
    
    printf("Idade : ");
    scanf("%d", &Idade);
    
    if (Idade >= 1 && Idade < 16){
        printf("Não pode votar");
    }else if (Idade >=16 && Idade <= 17 ){
        printf("Voto facultativo");
    } else if (Idade >= 18 && Idade <= 70){
        printf(" voto obrigatorio");
    } else if (Idade >= 71){
        printf("Voto facultativo");
    } else{
        printf("Erro de idade !!! \nPor favor digite uma idade positiva, que é razoável!!!");
    }

    return 0;
}
*/