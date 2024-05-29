package models;

public class LocacaoVeiculo extends ItemPacote{
    private String marca;
    private String modelo;

    public LocacaoVeiculo(double preco, String marca, String modelo) {
        super(preco);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

