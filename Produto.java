import java.util.Date;

public class Produto {
    private int id = 0;
    private String nome;
    private String descricao;
    private int codigo;
    private Date data;
    private String fornecedor;


    public Produto(String nome, String descricao,int codigo,Date data,String fornecedor){
        id = id++;
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.data = data;
        this.fornecedor = fornecedor;
    }
    public Produto(String nome,int codigo,Date data,String fornecedor){
        id = id++;
        this.nome = nome;
        this.descricao = "";
        this.codigo = codigo;
        this.data = data;
        this.fornecedor = fornecedor;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the fornecedor
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

}
