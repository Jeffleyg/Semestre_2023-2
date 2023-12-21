package Clases;

public class Cadastrar {

    private String nomeCompleto;
    private String cpf;
    private String senha;

    public Cadastrar() {
        // Construtor padrão vazio
    }

    // Getter e Setter para nomeCompleto, cpf e senha

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
