package br.com.melfhcars.model;


public class Carro {

    private String nomeCarro;
    private String ano;
    private String km;
    private String finalPlaca;
    private String valor;
    private String estado;
    private String uf;

    private String fotoCarro;

    public Carro() {
    }

    public Carro(String nomeCarro, String ano, String km, String valor, String estado) {
        this.nomeCarro = nomeCarro;
        this.ano = ano;
        this.km = km;
        this.valor = valor;
        this.estado = estado;
    }

    public String getFotoCarro() {
        return fotoCarro;
    }

    public void setFotoCarro(String fotoCarro) {
        this.fotoCarro = fotoCarro;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getFinalPlaca() {
        return finalPlaca;
    }

    public void setFinalPlaca(String finalPlaca) {
        this.finalPlaca = finalPlaca;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}