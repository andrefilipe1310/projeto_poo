import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;



public class ProjetoPoo {

    public static void main(String[] args){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        //lista de produtos, fornecedores e estoque

        ArrayList<Produto> produtos = new ArrayList<Produto>();
        ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
        while(true){
            System.out.println("------------------------------------");
            System.out.println("Sistema de gerenciamento de estoque");
            System.out.println("------------------------------------");
            System.out.println("Escolha o modulo que deseja operar");
            System.out.println("1 - Produto\n2 - Fornecedor\n3 - Estoque\n0 - Sair");

            int escolha = scanner.nextInt();
            if(escolha == 1){// produto
                limpaTela();

                sublinhar("Produto");
                System.out.println("1 - Cadastrar\n2 - Buscar\n3 - Listar\n4 - Deletar\n0 - voltar ");
                escolha = scanner.nextInt();
                switch(escolha){
                    case 1://cadastrar produto
                        scanner.nextLine();//Controle do scanner
                        System.out.println("Digite o nome do produto: ");
                        String nome = scanner.nextLine();
                        System.out.println("Digite o codigo do produto: ");
                        int codigo = scanner.nextInt();
                        scanner.nextLine();//controle do scanner
                        System.out.println("Seu codigo tem descrição? (s - sim/ qualquer outra tecla - não)");
                        String decisao = scanner.nextLine();
                        String descricao = "";

                        if(decisao.equals("s")){
                            System.out.println("Digite a descrição: ");
                            descricao = scanner.nextLine();

                        }
                        else{
                            System.out.println("Nenhuma descrição foi adicionada!");
                        }
                        System.out.println("Digite o nome do fornecedor do produto");
                        String fornecedor = scanner.nextLine();
                        System.out.println("Digite a data de cadastro: (dia/mês/ano)");
                        String dataString = scanner.nextLine();
                        Date data = converterData(dataString);

                        //Date date = formatter.parse(data);
                        Produto produto = new Produto(nome,descricao,codigo,data,fornecedor);
                        produtos.add(produto);
                        limpaTela();
                        System.out.println("Produto cadastrado com sucesso!");
                        break;
                    case 2://buscar produto
                        if(produtos.size() > 0){
                            scanner.nextLine();//Controle do scanner
                            System.out.println("Digite o nome do produto: ");
                            nome = scanner.nextLine();
                            for (int i = 0; i < produtos.size(); i++) {
                                if(nome.equals(produtos.get(i).getNome())){
                                    limpaTela();
                                    System.out.printf("O produto %s que tem o codigo %d está na lista e foi cadastrado na data %s\n",produtos.get(i).getNome(),produtos.get(i).getCodigo(),produtos.get(i).getData());
                                }else {
                                    limpaTela();
                                    System.out.println("Produto não encontrado!");
                                }
                            }

                        }else{
                            limpaTela();
                            System.out.println("Não existe nenhum produto cadastrado!");

                        }
                        break;
                    case 3://Listar
                        if (produtos.size() > 0){
                            sublinhar("código        nome        cadastro        fornecedor");
                            for (Produto item:produtos) {
                                System.out.printf("%d        %s     %s      %s\n",item.getCodigo(),item.getNome(),item.getData(),item.getFornecedor());
                            }

                        }else {
                            limpaTela();
                            sublinhar("Você não tem nenhum produto para listar!");
                        }
                        break;
                    case 4://Deletar
                        if (produtos.size() > 0){// entrará se a lista de produtos for maior que zero
                            scanner.nextLine();//Controle do scanner
                            System.out.println("Digite o nome do produto que você deseja deletar: ");
                            String produtoNome = scanner.nextLine();

                            ArrayList<Integer> posicoes = new ArrayList();
                            for (int i = 0; i < produtos.size();i++) {
                                if (produtos.get(i).getNome().equals(produtoNome)){

                                    posicoes.add(i);

                                }

                            }
                            if (posicoes.size() == 1){ //remove o unico produto identificado na lista
                                produtos.remove(produtos.get(posicoes.get(0)));
                                System.out.println("Produto deletado com sucesso!");
                            }else if(posicoes.size() == 0){// retorna uma mensagem falando que não encontrou o produto
                                System.out.println("Nenhum produto com esse nome está cadastrado!");
                            }
                            else  {//opera caso o numero de produtos encontrados for maior que 1
                                System.out.println("Existe mais de um produto com esse nome!");
                                System.out.println("Digite o codigo do produto para diferenciar: ");
                                codigo = scanner.nextInt();
                                for (int j = 0; j < posicoes.size(); j++) {
                                    if (produtos.get(j).getCodigo() == codigo) {
                                        produtos.remove(produtos.get(posicoes.get(j)));
                                        limpaTela();

                                        sublinhar("Produto deletado com sucesso!");
                                        break;
                                    } else {
                                        limpaTela();
                                        sublinhar("Codigo não identificado em nenhum dos produtos!");

                                    }
                                }
                            }
                        }else { // condição caso não existam produtos cadastrados no sistema
                            limpaTela();
                            sublinhar("Nenhum produto cadastrado!");
                        }

                        break;
                    case 0:
                        break;
                    default:
                        break;





                }

            }
            else if(escolha == 2){ //fornecedor
                limpaTela();
                sublinhar("Fornecedor");
                System.out.println("1 - Cadastrar\n2 - Buscar\n3 - Listar\n4 - Deletar\n0 - voltar ");
                escolha = scanner.nextInt();
                switch (escolha){
                    case 1:
                        scanner.nextLine();//Controle do scanner
                        System.out.println("Digite o nome do fornecedor: ");
                        String nome = scanner.nextLine();
                        System.out.println("Digite o CNPJ do fornecedor: ");
                        int codigo = scanner.nextInt();
                        scanner.nextLine();//controle do scanner
                        System.out.println("Digite o logradouro do fornecedor: ");
                        String logradouro = scanner.nextLine();
                        System.out.println("Digite o bairro do fornecedor: ");
                        String bairro = scanner.nextLine();
                        System.out.println("Digite a cidade do fornecedor: ");
                        String cidade = scanner.nextLine();
                        System.out.println("Digite o bairro do estado: ");
                        String estado = scanner.nextLine();
                        System.out.println("Digite o CEP do fornecedor: ");
                        String cep = scanner.nextLine();
                        System.out.println("Digite o CPF do fornecedor: ");
                        String cpf = scanner.nextLine();
                        System.out.println("Digite o telefone do fornecedor: ");
                        String telefone = scanner.nextLine();
                        System.out.println();
                        System.out.println("Digite o email do fornecedor: ");
                        String email = scanner.nextLine();
                        System.out.println("Digite sua data de nascimento: (dia/mes/ano)");
                        String nascimento = scanner.nextLine();
                        //nome codigo logradouro bairro cidade estado cep cpf telefone email nascimento
                        Fornecedor fornecedor = new Fornecedor(nome,codigo, logradouro, bairro, cidade, estado, cep, cpf, telefone, email, nascimento);
                        fornecedores.add(fornecedor);
                        limpaTela();
                        sublinhar("Fornecedor cadastrado com sucesso!");

                        break;

                }

            }
            else if(escolha == 3){//estoque
                limpaTela();
            }
            else if (escolha == 0){//sair
                break;
            }else{//resposta invalida
                System.out.println("Resposta invalida! (digite um número valido)");

            }
        }
    }

    public static void limpaTela(){
        System.out.println("\n\n\n");
    }
    public static void sublinhar(String s){
        String linha = "";
        for (int i = 0; i < s.length(); i++) {
            linha = linha + "-";

        }
        System.out.println(linha);
        System.out.println(s);
        System.out.println(linha);
    }

   public static Date converterData(String dateStr) {
        try {
            // Define o padrão de formatação da data
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            // Converte a string para um objeto Date
            return dateFormat.parse(dateStr);
        } catch (ParseException e) {
            // Retorna null em caso de erro
            
            return null;
        }
    }
}



