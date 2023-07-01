import java.util.ArrayList;

public class Options {
    private ArrayList<String> op = new ArrayList<>();

    public String getOp(int i) {
        return op.get(i);
    }

    public void setOp(String op) {
        this.op.add(op);
    }

    public int getSyze(){
        return op.size();
    }

}
