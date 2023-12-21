/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jeffley
 */
public class Pagprojetos {
    String Data;
    String NomeProjeto;
    String DescripcaoProjeto;

    public Pagprojetos(String Data, String NomeProjeto, String DescripcaoProjeto) {
        this.Data = Data;
        this.NomeProjeto = NomeProjeto;
        this.DescripcaoProjeto = DescripcaoProjeto;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getNomeProjeto() {
        return NomeProjeto;
    }

    public void setNomeProjeto(String NomeProjeto) {
        this.NomeProjeto = NomeProjeto;
    }

    public String getDescripcaoProjeto() {
        return DescripcaoProjeto;
    }

    public void setDescripcaoProjeto(String DescripcaoProjeto) {
        this.DescripcaoProjeto = DescripcaoProjeto;
    }
    
    

}
