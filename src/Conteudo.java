import java.util.ArrayList;

public class Conteudo {

    private ArrayList<String> categoria = new ArrayList<>();


    public String getCategoria(int i) {
        return categoria.get(i);
    }

    public void setCategoria(String categoria) {
        this.categoria.add(categoria);
        System.out.println("Categoria adicionada com sucesso!");
    }

    public void removeCategoria(int i){
        this.categoria.remove(i);
        System.out.println("Categoria removida com sucesso!");
    }
    public int getSize(){
        return this.categoria.size();
    }

    public boolean isArrayList (){
        if (categoria.getClass().getSimpleName().equals("ArrayList")){
            return true;
        }else {
            return false;
        }
    }
}
