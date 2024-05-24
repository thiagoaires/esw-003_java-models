package models;

public class TransladoAereo extends ItemPacote{
    String companhiaAerea;
    String numeroVoo;

    TransladoAereo(String companhiaAerea, String numeroVoo){
        this.companhiaAerea = companhiaAerea;
        this.numeroVoo = numeroVoo;
    }

    String getCompanhiaAerea(){
        return companhiaAerea;
    }
    String getNumeroVoo(){
        return numeroVoo;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }
}
