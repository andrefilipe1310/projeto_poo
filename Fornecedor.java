public class Fornecedor {
    //nome codigo logradouro bairro cidade estado cep cpf telefone email nascimento
    private String nome;
    private int codigo;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String cpf;
    private String telefone;
    private String email;
    private String nascimento;
    private int id = 0;

    public Fornecedor(String nome, int codigo, String logradouro, String bairro, String cidade, String estado, String cep, String cpf, String telefone, String email, String nascimento){
            this.id = id++;
            this.nome = nome;
            this.codigo = codigo;
            this.logradouro = logradouro;
            this.bairro = bairro;
            this.cidade = cidade;
            this.estado = estado;
            this.cep = cep;
            this.cpf = cpf;
            this.telefone = telefone;
            this.email = email;
            this.nascimento = nascimento;

    }
}