public class Vetor {
    int codigo;
    double saldo;
    double limte;

    public void deposita(double valor){
        if(saldo + limite < valor){
            return false;
        }
        saldo -= valor;
        return false;
    }
    
}
