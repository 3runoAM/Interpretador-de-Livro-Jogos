package Models;

public class Barra {
    private final int TAMANHOMAXIMO = 200;
    private final int TAMANHOMINIMO = 50;
    private int tamanhoAtual = TAMANHOMINIMO;
    private String tipo;

    /*Construtor*/
    public Barra(String tipo) {
        this.tipo = tipo;
    }


    /*Getters&Setters*/
    public int getTAMANHOMAXIMO() {
        return TAMANHOMAXIMO;
    }
    public int getTamanhoAtual() {
        return tamanhoAtual;
    }
    public void setTamanhoAtual(int tamanhoAtual) {
        this.tamanhoAtual = tamanhoAtual;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    /*Métodos*/
    public void incrementarBarra(int acrescimo){
        tamanhoAtual += acrescimo;
    }
    public void decrementarBarra(int decrescimo){
        tamanhoAtual -= decrescimo;
    }

}
