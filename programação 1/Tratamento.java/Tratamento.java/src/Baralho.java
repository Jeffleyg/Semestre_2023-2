/* 
public class Baralho {
    Carta[] cartas;
    int cartaAtual;

    public Baralho(){
        cartas = new Carta[52];
        cartaAtual = 0;

        String[] naipes = {"Copas", "Espadas", "Ouros", "Paus"};
        String[] valores = {"Às", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};

        int index = 0;

        for(String naipe : naipes){
            for(String valor : valores){
                cartas[index] = new Carta(valor, naipe);
                index++;
            }
        }

    }


    
}
*/
