package Models.status;

import Models.game.Item;

public class Inventario {
    private Item[][] inventario = new Item[3][4];

    /*Getters&Setters*/
    public Item[][] getInventario() {
        return inventario;
    }
    public void setInventario(Item[][] inventario) {
        this.inventario = inventario;
    }

    /*Método*/
    public void adicionarAoInventario(int linha, int coluna, Item item){
        inventario[linha][coluna] = item;
    }
    public void removerDoInventario(int linha, int coluna){
        inventario[linha][coluna] = null;
    }

}
