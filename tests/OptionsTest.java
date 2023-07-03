
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class OptionsTest {
    @Test
    public void conteudoDeveSerUmaArrayList(){
        Conteudo conteudo = new Conteudo();
        assertTrue(conteudo.isArrayList(), "Conteudo deve ser uma ArrayList");
    }

    public void testarCriacaoDaCategoria(){
        Conteudo conteudo = new Conteudo();
        conteudo.setCategoria("Animes");
        assertEquals("Animes", conteudo.getCategoria(0), "Categoria deve ser 'Animes'");
    }
}
