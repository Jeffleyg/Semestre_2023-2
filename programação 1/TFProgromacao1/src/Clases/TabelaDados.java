/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jeffley
 */
public class TabelaDados {
    private String linha;
    private String planta;
    private String DadosBrix;
    private String DadosPressao;
    private String DadosVerde;
    private String DadosSeco;

    public TabelaDados(String linha, String planta, String DadosBrix, String DadosPressao, String DadosVerde, String DadosSeco) {
        this.linha = linha;
        this.planta = planta;
        this.DadosBrix = DadosBrix;
        this.DadosPressao = DadosPressao;
        this.DadosVerde = DadosVerde;
        this.DadosSeco = DadosSeco;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getDadosBrix() {
        return DadosBrix;
    }

    public void setDadosBrix(String DadosBrix) {
        this.DadosBrix = DadosBrix;
    }

    public String getDadosPressao() {
        return DadosPressao;
    }

    public void setDadosPressao(String DadosPressao) {
        this.DadosPressao = DadosPressao;
    }

    public String getDadosVerde() {
        return DadosVerde;
    }

    public void setDadosVerde(String DadosVerde) {
        this.DadosVerde = DadosVerde;
    }

    public String getDadosSeco() {
        return DadosSeco;
    }

    public void setDadosSeco(String DadosSeco) {
        this.DadosSeco = DadosSeco;
    }

    
}
