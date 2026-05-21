package main;

import java.util.Scanner;

import model.Beneficiario;
import model.Doador;
import model.ItemDoacao;
import model.Solicitacao;
import service.BeneficiarioService;
import service.DoadorService;
import service.ItemDoacaoService;
import service.SolicitacaoService;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ItemDoacaoService itemService = new ItemDoacaoService();
        BeneficiarioService beneficiarioService = new BeneficiarioService();
        SolicitacaoService solicitacaoService = new SolicitacaoService();
        DoadorService doadorService = new DoadorService();
        int opcao = -1;

        System.out.println("=== SISTEMA DE DOAÇÃO SOLIDÁRIA ===");

        do {
            System.out.println();
            System.out.println(" 1 - Cadastrar Item para Doação");
            System.out.println(" 2 - Listar Itens");
            System.out.println(" 3 - Solicitar Item");
            System.out.println(" 4 - Cadastrar Doador");
            System.out.println(" 5 - Listar Doadores");
            System.out.println(" 6 - Cadastrar Beneficiario");
            System.out.println(" 7 - Listar Beneficiorios ");
            System.out.println(" 0 - Sair");
            System.out.print("Opção: ");

            try {
                opcao = leitor.nextInt();
                leitor.nextLine();

                switch (opcao) {
                    case 1:
                        cadastrarNovoItem(leitor, itemService);
                        break;

                    case 2:
                        System.out.println("--- ITENS CADASTRADOS ---");
                        itemService.listarTodos().forEach(
                                item -> System.out.println(item.getNomeItem() + " | Status: " + item.getStatus()));
                        break;

                    case 3:
                        realizarSolicitacao(leitor, itemService, beneficiarioService, solicitacaoService);
                        break;
                        

                    case 4:
                        cadastrarNovoDoador(leitor, doadorService);
                        break;

                    case 5:
                        System.out.println("--- DOADORES CADASTRADOS ---");
                        doadorService.listarTodos().forEach(doador -> System.out.println(doador.getNome()));
                        break;

                    case 6:
                        cadastrarNovoBeneficiario(leitor, beneficiarioService);
                        break;

                    case 7:
                        System.out.println("--- BENEFICIARIOS CADASTRADOS ---");
                        beneficiarioService.listarTodos()
                                .forEach(beneficiario -> System.out.println(beneficiario.getNome()));
                        break;

                    case 0:
                        System.out.println("Encerrando...");
                        break;

                    default:
                        System.out.println("Opção inválida!");

                }
            } catch (Exception e) {
                System.out.println("Erro: Digite apenas numeros!");
                leitor.nextLine(); // Limpa o erro do teclado
                opcao = -1; // Mantém o loop rodando
            }
        } while (opcao != 0);
    }

    private static void cadastrarNovoItem(Scanner leitor, ItemDoacaoService service) {
        System.out.println("Nome do Item: ");
        String nome = leitor.nextLine();

        System.out.println("Categoria: ");
        String categoria = leitor.nextLine();

        System.out.println("Descrição: ");
        String descricao = leitor.nextLine();

        System.out.println("Quantidade: ");
        int quantidade = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Estado de conservação: ");
        String estadoConservacao = leitor.nextLine();

        System.out.println("Data de Cadastro: ");
        String dataCadastro = leitor.nextLine();

        System.out.println("Status: ");
        String status = leitor.nextLine();

        ItemDoacao novo = new ItemDoacao(0, nome, categoria, descricao, quantidade, estadoConservacao, dataCadastro, status);

        service.cadastrarItem(novo);
        System.out.println("Item cadastrado com sucesso!");

    }

    private static void cadastrarNovoDoador(Scanner leitor, DoadorService service) {
        System.out.println("--- CADASTRO DO DOADOR ---");

        System.out.println("CPF do Doador: ");
        String id = leitor.nextLine();
        leitor.nextLine();

        System.out.println("Nome do Doador: ");
        String nome = leitor.nextLine();

        System.out.println("Telefone do Doador: ");
        String telefone = leitor.nextLine();

        System.out.println("Email do Doador: ");
        String email = leitor.nextLine();

        System.out.println("Endereço do Doador: ");
        String endereco = leitor.nextLine();

        Doador novo = new Doador(id, nome, telefone, email, endereco);
        service.cadastrarDoador(novo);
        System.out.println("Doador cadastrado com sucesso!");

    }

    private static void cadastrarNovoBeneficiario(Scanner leitor, BeneficiarioService service) {
        System.out.println("=== Cadastro Beneficiario ===");
        System.out.println();

        System.out.println("CPF do Beneficiario: ");
        String id = util.Validador.lerCPF(leitor); 

        System.out.println("Nome do Beneficiario: ");
        String nome = leitor.nextLine();

        System.out.println("Telefone do Beneficiareio: ");
        String telefone = util.Validador.lerTelefone(leitor);

        System.out.println("Email do Beneficiario: ");
        String email = leitor.nextLine();

        System.out.println("Endereço do Beneficiario: ");
        String endereco = leitor.nextLine();

        System.out.println("Selecione o tipo de Instituição: ");
        System.out.println("1 - Abrigo");
        System.out.println("2 - ONG");
        System.out.println("3 - Escola");
        int opcaoTipo = leitor.nextInt();
        leitor.nextLine();

        String tipo;
        if (opcaoTipo == 1) {
            tipo = "Abrigo";
        
        } else if (opcaoTipo == 2) {
            tipo = "ONG";
            
        } else {
            tipo = "Escola";
        }

        System.out.println("Prioridade do Beneficiario: ");
        System.out.println("1 - PCD/Idosos");
        System.out.println("2 - Crianças");
        System.out.println("3 - Geral");
        int opcaoPrioridade = leitor.nextInt();
        leitor.nextLine();

       String prioridade;
        
        switch (opcaoPrioridade) {
            case 1:
                prioridade = "PCD";
                break;

            case 2:
                prioridade  = "Idosos";
                break; 
                
            case 3:
                prioridade = "Crianças";
                break;   
        
            default:
                prioridade = "Geral";
                break;
        }

        Beneficiario novo = new Beneficiario(id, nome, telefone, email, endereco, tipo, prioridade);
        service.cadastrarBeneficiario(novo);
        System.out.println("Beneficiario cadastrado com sucesso!");

    }

    

    private static void realizarSolicitacao(Scanner leitor, ItemDoacaoService itemService, BeneficiarioService beneficiarioService, SolicitacaoService solicitacaoService) {
        System.out.println("=== SOLICITAÇÃO ===");
        System.out.println();

        System.out.println("Digite o CPF do Beneficiario: ");
        String idBeneficiario = util.Validador.lerCPF(leitor);
        Beneficiario beneficiario = beneficiarioService.buscarPorId(idBeneficiario);

        System.out.println("=== ITENS DISPONÍVEIS PARA DOAÇÃO ===");
        var todosItens = itemService.listarTodos();

        if (todosItens.isEmpty()) {
            System.out.println("=== ITENS DISPONÍVEIS PARA DOAÇÃO ===");
            return;
            
        }

        for (ItemDoacao item : todosItens){
            System.out.println("ID: [" + item.getId() + "]| ITEM: [" + item.getNomeItem() + "]| QUANTIDADE:" + item.getQuantidade());
        }
        

        System.out.println("Digite o id do Item: ");
        int idItem = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Digite a quantidade: ");
        int quantidade = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Justificativa: ");
        String justificativa = leitor.nextLine();

        ItemDoacao item = itemService.buscarPorId(idItem);

       
        

        
        if (beneficiario == null || item == null) {
            System.out.println("ERRO: Beneficiario ou item não encontrado!");
        } else{
            Solicitacao novo = new Solicitacao(0, beneficiario, item, quantidade, justificativa, ItemDoacao.STATUS_PENDENTE);
            solicitacaoService.registrarSolicitacao(novo);

            System.out.println("Solicitação realizada com sucesso!");

        }
    }



}   


