package br.com.melfhcars.model;


public class Carro {

    private String placa;
    private String nomeCarro;
    private String ano;
    private String km;
    private String finalPlaca;
    private String valor;
    private String estado;

    private String transmissao;

    private String acionamento;

    private String documento;

    private String condicoes;
    private String fotoCarro;

    private String CpfLogado;

    public Carro() {
    }

    public Carro(String nomeCarro, String ano, String km, String valor, String estado,String fotoCarro, String placa) {
        this.nomeCarro = nomeCarro;
        this.ano = ano;
        this.km = km;
        this.valor = valor;
        this.estado = estado;
        this.fotoCarro =fotoCarro;
        this.placa = placa;
    }

    public Carro( String nomeCarro, String ano, String km, String finalPlaca, String valor, String estado, String transmissao, String acionamento, String documento, String condicoes, String fotoCarro) {
        this.nomeCarro = nomeCarro;
        this.ano = ano;
        this.km = km;
        this.finalPlaca = finalPlaca;
        this.valor = valor;
        this.estado = estado;
        this.transmissao = transmissao;
        this.acionamento = acionamento;
        this.documento = documento;
        this.condicoes = condicoes;
        this.fotoCarro = fotoCarro;
    }

    public Carro(String placa, String nomeCarro, String ano, String km, String finalPlaca, String valor, String estado, String transmissao, String acionamento, String documento, String condicoes, String fotoCarro) {
        this.placa = placa;
        this.nomeCarro = nomeCarro;
        this.ano = ano;
        this.km = km;
        this.finalPlaca = finalPlaca;
        this.valor = valor;
        this.estado = estado;
        this.transmissao = transmissao;
        this.acionamento = acionamento;
        this.documento = documento;
        this.condicoes = condicoes;
        this.fotoCarro = fotoCarro;
    }

    public Carro(String placa, String nomeCarro, String ano, String km, String valor) {
        this.placa = placa;
        this.nomeCarro = nomeCarro;
        this.ano = ano;
        this.km = km;
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public String getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    public String getAcionamento() {
        return acionamento;
    }

    public void setAcionamento(String acionamento) {
        this.acionamento = acionamento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCondicoes() {
        return condicoes;
    }

    public void setCondicoes(String condicoes) {
        this.condicoes = condicoes;
    }

    public String getCpfLogado() {
        return CpfLogado;
    }

    public void setCpfLogado(String cpfLogado) {
        CpfLogado = cpfLogado;
    }
}