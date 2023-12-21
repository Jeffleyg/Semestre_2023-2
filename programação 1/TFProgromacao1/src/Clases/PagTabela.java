/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.List;


/**
 *
 * @author jeffley
 */
public class PagTabela {
    private String data;
    private String Nome;
    private List<TabelaDados>tabeladados;

    public PagTabela(String data, String Nome, List<TabelaDados> tabeladados) {
        this.data = data;
        this.Nome = Nome;
        this.tabeladados = tabeladados;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public List<TabelaDados> getTabeladados() {
        return tabeladados;
    }

    public void setTabeladados(List<TabelaDados> tabeladados) {
        this.tabeladados = tabeladados;
    }
    
    
}
