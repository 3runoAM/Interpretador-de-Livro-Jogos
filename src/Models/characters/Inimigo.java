package Models.characters;

public class Inimigo {
    Personagem inimigo;
    public Inimigo(String nome, int tamanhoVida, int tamanhoMana) {
        this.inimigo = new Personagem(nome);
        inimigo.setInventario(null);
        inimigo.getVida().setTamanhoAtual(tamanhoVida);
        inimigo.getMana().setTamanhoAtual(tamanhoMana);
    }
}
