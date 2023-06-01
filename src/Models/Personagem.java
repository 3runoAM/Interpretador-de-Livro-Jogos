package Models;

import Models.Barra;
import Models.Inventario;

public class Personagem {
    private String nome;
    private Barra vida = new Barra("Energia");
    private Barra mana = new Barra("Mana");
    private Inventario inventario = new Inventario();

    /*Construtor*/
    public Personagem(String nome) {
        this.nome = nome;
    }


    /*Getters&Setters*/
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Barra getVida() {
        return vida;
    }
    public void setVida(Barra vida) {
        this.vida = vida;
    }
    public Barra getMana() {
        return mana;
    }
    public void setMana(Barra mana) {
        this.mana = mana;
    }
    public Inventario getInventario() {
        return inventario;
    }
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    /*Métodos*/

}
