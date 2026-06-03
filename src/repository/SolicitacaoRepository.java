package repository;

import model.Solicitacao;
import model.Beneficiario;
import model.ItemDoacao;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SolicitacaoRepository {
    private final String CAMINHO_ARQUIVO = "solicitacoes.txt";
    
    // Precisamos dos outros repositórios para remontar o objeto na leitura
    private final BeneficiarioRepository beneficiarioRepo = new BeneficiarioRepository();
    private final ItemDoacaoRepository itemRepo = new ItemDoacaoRepository();

    // 1. Salva a solicitação no arquivo TXT
    public void registrarSolicitacao(Solicitacao solicitacao) {
        List<Solicitacao> atuais = listarTodas();
        int idAutomatico = atuais.size() + 1;
        solicitacao.setId(idAutomatico);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO, true))) {
            // Gravamos as chaves (IDs) para referenciar os objetos vinculados
            writer.write(solicitacao.getId() + ";" 
                       + solicitacao.getBeneficiario().getId() + ";" // CPF do Beneficiário
                       + solicitacao.getItem().getId() + ";"         // ID do Item
                       + solicitacao.getQuantidade() + ";" 
                       + solicitacao.getJustificativa() + ";" 
                       + solicitacao.getStatus());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar a solicitação no arquivo TXT: " + e.getMessage());
        }
    }

    // 2. Lê o TXT e reconstrói os objetos completos usando os IDs salvos
    public List<Solicitacao> listarTodas() {
        List<Solicitacao> lista = new ArrayList<>();
        File arquivo = new File(CAMINHO_ARQUIVO);

        if (!arquivo.exists()) {
            return lista;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(CAMINHO_ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                
                int id = Integer.parseInt(dados[0]);
                String cpfBeneficiario = dados[1];
                int idItem = Integer.parseInt(dados[2]);
                int quantidade = Integer.parseInt(dados[3]);
                String justificativa = dados[4];
                String status = dados[5];

                // Buscamos os objetos completos nos outros arquivos através do ID
                Beneficiario beneficiario = beneficiarioRepo.buscarPorId(cpfBeneficiario);
                ItemDoacao item = itemRepo.buscarPorId(idItem);

                // Se os dois ainda existirem nos arquivos, recria a solicitação
                if (beneficiario != null && item != null) {
                    Solicitacao solicitacao = new Solicitacao(id, beneficiario, item, quantidade, justificativa, status);
                    lista.add(solicitacao);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler as solicitações do arquivo TXT: " + e.getMessage());
        }

        return lista;
    }
}