import java.util.ArrayList;

public class Itens {
    private ArrayList<String> conteudo = new ArrayList<>();
    private ArrayList<Double> nota = new ArrayList<>();
    private ArrayList<Boolean> completo = new ArrayList<>();
    private ArrayList<Integer> titulo = new ArrayList<>();


    public int getTitulo(int i) {
        return titulo.get(i);
    }
    public String getConteudo(int i) {
        return conteudo.get(i);
    }
    public double getNota(int i) {
        return nota.get(i);
    }
    public boolean getCompleto(int i) {
        return completo.get(i);
    }

    public void setConteudo(String conteudo, double nota, boolean completo, int titulo) {
        this.conteudo.add(conteudo);
        this.nota.add(nota);
        this.completo.add(completo);
        this.titulo.add(titulo);
    }
    public void removeConteudo(int i){
        this.conteudo.remove(i);
        this.nota.remove(i);
        this.completo.remove(i);
        this.titulo.remove(i);
        System.out.println("Conteudo removido com sucesso!");
    }
    public int getSize(){
        return this.conteudo.size();
    }
}
