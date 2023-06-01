package Models.game;

import Models.characters.Inimigo;
import Models.characters.Personagem;

public class Batalha {
    Personagem personagem;
    Inimigo inimigo;

    /*Construtor*/
    public Batalha(Personagem personagem, Inimigo inimigo) {
        this.personagem = personagem;
        this.inimigo = inimigo;
    }


    /*Getterts&Setters*/
    public Personagem getPersonagem() {
        return personagem;
    }
    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }
    public Inimigo getInimigo() {
        return inimigo;
    }
    public void setInimigo(Inimigo inimigo) {
        this.inimigo = inimigo;
    }


    /*Métodos*/

}
