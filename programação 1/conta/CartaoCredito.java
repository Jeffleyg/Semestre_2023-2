public class CartaoCredito {
    private int numeros;
    private String DataDeValidacao;

    // metodos
    public CartaoCredito(int numeros,  String DataDeValidacao){
        this.numeros = numeros;
        this.DataDeValidacao = DataDeValidacao;
    }

    public void setnumeros (int numeros){
        this.numeros = numeros;
    }

    public int getnumeros(){
        return numeros;
    }

    public void setDataDeValidacao(String DataDeValidacao){
        this.DataDeValidacao = DataDeValidacao;
    }

    public String getDataDeValidacao(){
        return DataDeValidacao;
    }


}
