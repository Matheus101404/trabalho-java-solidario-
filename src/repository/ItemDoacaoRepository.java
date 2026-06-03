package repository;

import model.ItemDoacao;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDoacaoRepository {
    private final String CAMINHO_ARQUIVO = "itens.txt";

    // 1. Método salvar atualizado com todos os 8 atributos
    public void salvar(ItemDoacao item) {
        List<ItemDoacao> atuais = listarTodos();
        int idAutomatico = atuais.size() + 1;
        item.setId(idAutomatico);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO, true))) {
            // Escreve os 8 atributos separados por ponto e vírgula
            writer.write(item.getId() + ";" 
                       + item.getNomeItem() + ";" 
                       + item.getCategoria() + ";" 
                       + item.getDescricao() + ";" 
                       + item.getQuantidade() + ";" 
                       + item.getEstadoConservacao() + ";" 
                       + item.getDataCadastro() + ";" 
                       + item.getStatus());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar o item no arquivo TXT: " + e.getMessage());
        }
    }

    // 2. Método listarTodos corrigido para ler os 8 atributos e usar o construtor certo
    public List<ItemDoacao> listarTodos() {
        List<ItemDoacao> lista = new ArrayList<>();
        File arquivo = new File(CAMINHO_ARQUIVO);

        if (!arquivo.exists()) {
            return lista;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(CAMINHO_ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                
                // Puxa cada índice do array baseado na ordem que gravamos
                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                String categoria = dados[2];
                String descricao = dados[3];
                int quantidade = Integer.parseInt(dados[4]);
                String estadoConservacao = dados[5];
                String dataCadastro = dados[6];
                String status = dados[7];

                // Agora o construtor recebe os 8 parâmetros perfeitamente!
                ItemDoacao item = new ItemDoacao(id, nome, categoria, descricao, quantidade, estadoConservacao, dataCadastro, status);
                lista.add(item);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler os itens do arquivo TXT: " + e.getMessage());
        }

        return lista;
    }

    // 3. Seu método original adaptado (Chama listarTodos() para filtrar)
    public List<ItemDoacao> buscarPorStatus(String status) {
        List<ItemDoacao> filtrados = new ArrayList<>();
        for (ItemDoacao item : listarTodos()) { // <-- Agora puxa do arquivo!
            if (item.getStatus().equalsIgnoreCase(status)) {
                filtrados.add(item);
            }
        }
        return filtrados;
    }

    // 4. Seu método original adaptado
    public List<ItemDoacao> buscarPorCategoria(String categoria) {
        List<ItemDoacao> filtrados = new ArrayList<>();
        for (ItemDoacao item : listarTodos()) { // <-- Agora puxa do arquivo!
            if (item.getCategoria().equalsIgnoreCase(categoria)) {
                filtrados.add(item);
            }
        }
        return filtrados;
    }

    // 5. Seu método original adaptado
    public ItemDoacao buscarPorId(int id) {
        for (ItemDoacao i : listarTodos()) { // <-- Agora puxa do arquivo!
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }
}
    


    
