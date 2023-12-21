
package Clases;


public class ClasseHome {
    private String usuarios;
    private String colheita;
    private String projetos;    

    public ClasseHome(String usuarios, String colheita, String projetos) {
        this.usuarios = usuarios;
        this.colheita = colheita;
        this.projetos = projetos;
    }

    public ClasseHome(String meu_usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    public String getColheita() {
        return colheita;
    }

    public void setColheita(String colheita) {
        this.colheita = colheita;
    }

    public String getProjetos() {
        return projetos;
    }

    public void setProjetos(String projetos) {
        this.projetos = projetos;
    }
    
    
}
