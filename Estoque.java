import java.util.ArrayList;

public class Estoque {
    private String nome;
    private int id = 0;
    private ArrayList<Integer> quantidades = new ArrayList<>();
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<String> listaNomesProdutos = new ArrayList<>();
    public Estoque(String nome){
        this.id = id++;
        this.nome = nome;

    }
}