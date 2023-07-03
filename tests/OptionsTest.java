
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class OptionsTest {
    @Test
    public void OptionsDevemSerArrayList(){
        Options op = new Options();
        assertTrue(op.isArrayList(), "Options deve ser uma ArrayList");

        Integrantes op2 = new Integrantes();
        assertTrue(op2.isArrayList(), "Integrantes deve ser uma ArrayList");

        MenuOptions op3 = new MenuOptions();
        assertTrue(op3.isArrayList(), "MenuOptions deve ser uma ArrayList");

        SubMenuOptions op4 = new SubMenuOptions();
        assertTrue(op4.isArrayList(), "SubMenuOptions deve ser uma ArrayList");
    }

    @Test
    public void testarCriacaoDeOptions(){
        Options op = new Options();
        op.setOp("Adicionar Novo Elemento");
        assertEquals("Adicionar Novo Elemento", op.getOp(0), "Categoria deve ser 'Adicionar Novo Elemento'");

        Integrantes op2 = new Integrantes();
        op2.setOp("Davi Pinheiro de Souza");
        assertEquals("Davi Pinheiro de Souza", op.getOp(0), "Categoria deve ser 'Davi Pinheiro de Souza'");

        MenuOptions op3 = new MenuOptions();
        op3.setOp("Excluir Titulo");
        assertEquals("Excluir Titulo", op.getOp(0), "Categoria deve ser 'Excluir Titulo'");

        SubMenuOptions op4 = new SubMenuOptions();
        op4.setOp("Adicionar Conteudo");
        assertEquals("Adicionar Conteudo", op.getOp(0), "Categoria deve ser 'Adicionar Conteudo'");
    }
}
