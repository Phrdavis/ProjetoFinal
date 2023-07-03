import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItensTest {

    @Test
    public void testarCraicaoDeItem(){
        Itens i = new Itens();
        i.setConteudo("Meus Filmes", 10, true, 0);

        assertEquals("Meus Filmes",i.getConteudo(0),"Conteudo deve ser 'Meus Filmes'");
        assertEquals(10,i.getNota(0),"Nota deve ser '10'");
        assertEquals(true,i.getCompleto(0),"Completo deve ser 'true'");
    }

    @Test
    public void completoDeveSerBoolean(){
        Itens i = new Itens();
        i.setConteudo("Meus Filmes", 10, true, 0);

        assertTrue(i.getCompleto(0),"Completo deve ser do tipo Boolean.");
    }

    @Test
    public void itensDevemSerArrayList(){
        Itens i = new Itens();
        i.setConteudo("Meus Filmes", 10, true, 0);

        assertTrue(i.isArrayList(),"Item deve ser uma Arraylist.");
    }
}
