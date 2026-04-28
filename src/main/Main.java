package main;

import java.util.Scanner;
import model.ItemDoacao;
import service.BeneficiarioService;
import service.ItemDoacaoService;
import service.SolicitacaoService;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ItemDoacaoService itemService = new ItemDoacaoService();
        BeneficiarioService beneficiarioService = new BeneficiarioService();
        SolicitacaoService solicitacaoService = new SolicitacaoService();
        int opcao = -1;

        System.out.println("=== SISTEMA DE DOAÇÃO SOLIDÁRIA - CHECKPOINT 1 ===");

        do {
            System.out.println(" 1 - Cadastrar Item para Doação");
            System.out.println(" 2 - Listar Itens");
            System.out.println(" 3 - Solicitar Item" );
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

        ItemDoacao novo = new ItemDoacao(1, nome, categoria, descricao, quantidade, estadoConservacao, dataCadastro,
                status);

        service.cadastrarItem(novo);
        System.out.println("Item cadastrado com sucesso!");
    }

    private static void realizarSolicitacao(Scanner leitor, ItemDoacaoService itemService, BeneficiarioService beneficiarioService, SolicitacaoService solicitacaoService){
        System.out.println("Digite o id do ");

    }

}
