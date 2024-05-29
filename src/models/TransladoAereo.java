package models;

public class TransladoAereo extends ItemPacote{
    private String companhiaAerea;
    private String numeroVoo;


    public TransladoAereo(double preco, String companhiaAerea, String numeroVoo) {
        super(preco);
        this.companhiaAerea = companhiaAerea;
        this.numeroVoo = numeroVoo;
    }

    String getCompanhiaAerea(){
        return companhiaAerea;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }

    String getNumeroVoo(){
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }
}
