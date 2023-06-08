package Builders;

import Models.game.Paragrafo;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public interface ParagrafoBuilder {
    void buildTipo(String id) throws IOException;
    void buildDescricao() throws IOException;
    void buildEscolhas() throws IOException;
    void buildItems() throws IOException;
    void buildBatalha() throws IOException;
}
