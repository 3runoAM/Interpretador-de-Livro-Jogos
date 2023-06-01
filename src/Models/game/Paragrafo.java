package Models.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Paragrafo {
    private String id;
    private String descricao;
    private String tipo; // tipos:
    private Map<String, Integer> escolhas = new HashMap<>(); // 1. Escolha comum
    private Models.game.Batalha Batalha; // 2. Batalha
    private ArrayList<Item> itens; // 3. Item(ns)

    /*Construtor*/
    public Paragrafo(String id) {
        this.id = id;
    }

    /*Getters&Setters*/
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Map<String, Integer> getEscolhas() {
        return escolhas;
    }
    public void setEscolhas(Map<String, Integer> escolhas) {
        this.escolhas = escolhas;
    }
    public Models.game.Batalha getBatalha() {
        return Batalha;
    }
    public void setBatalha(Models.game.Batalha batalha) {
        Batalha = batalha;
    }
    public ArrayList<Item> getItens() {
        return itens;
    }
    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
}
