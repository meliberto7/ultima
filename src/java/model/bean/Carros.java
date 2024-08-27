
package model.bean;


public class Carros {
    
    private int id_carro;
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private float preco_diaria;
    private int colunas;

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public int getId_carro() {
        return id_carro;
    }

    public void setId_carro(int id_carro) {
        this.id_carro = id_carro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getPreco_diaria() {
        return preco_diaria;
    }

    public void setPreco_diaria(float preco_diaria) {
        this.preco_diaria = preco_diaria;
    }
    
    
    
}
