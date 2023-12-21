public class Cliente {
    private String nomes;
    private int codigos;

    // metodos
    public Cliente(String nomes, int codigos){
        this.nomes = nomes;
        this.codigos = codigos;
    }

    public String getnomes(){
        return nomes;
    }
    
    public void setnomes(String nomes){
        this.nomes = nomes;
    }

    public int getCodigos(){
        return codigos;
    }

    public void setCodigos(int codigos){
        this.codigos = codigos;
    }
}
