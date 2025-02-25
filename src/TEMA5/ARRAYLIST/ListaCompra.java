package TEMA5.ARRAYLIST;

public class ListaCompra {

    private String alimento;

    public  ListaCompra(String alimento){
        this.alimento=alimento;
    }

    public String getAlimento() {
        return this.alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String toString() {
        return this.alimento;

    }
}
