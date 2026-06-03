package repository;

import model.Beneficiario;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BeneficiarioRepository {
    private final String CAMINHO_ARQUIVO = "beneficiarios.txt";

    // 1. Salva o beneficiário no arquivo TXT
    public void salvar(Beneficiario beneficiario) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO, true))) {
            // Grava as 7 informações separadas por ponto e vírgula
            writer.write(beneficiario.getId() + ";" 
                       + beneficiario.getNome() + ";" 
                       + beneficiario.getTelefone() + ";" 
                       + beneficiario.getEmail() + ";" 
                       + beneficiario.getEndereco() + ";" 
                       + beneficiario.getTipo() + ";" 
                       + beneficiario.getPrioridade());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar o beneficiário no arquivo TXT: " + e.getMessage());
        }
    }

    // 2. Lê todos os beneficiários do arquivo TXT reconstruindo a lista
    public List<Beneficiario> listarTodos() {
        List<Beneficiario> lista = new ArrayList<>();
        File arquivo = new File(CAMINHO_ARQUIVO);

        if (!arquivo.exists()) {
            return lista;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(CAMINHO_ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                
                // Reconstrói as variáveis na ordem exata do construtor
                String id = dados[0];
                String nome = dados[1];
                String telefone = dados[2];
                String email = dados[3];
                String endereco = dados[4];
                String tipo = dados[5];
                String prioridade = dados[6];

                // Instancia usando os 7 parâmetros requisitados pelo modelo
                Beneficiario beneficiario = new Beneficiario(id, nome, telefone, email, endereco, tipo, prioridade);
                lista.add(beneficiario);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler os beneficiários do arquivo TXT: " + e.getMessage());
        }

        return lista;
    }

    // 3. Busca um beneficiário específico pelo ID (CPF) varrendo o arquivo TXT
    public Beneficiario buscarPorId(String id) {
        for (Beneficiario b : listarTodos()) {
            if (b.getId().equalsIgnoreCase(id)) {
                return b;
            }
        }
        return null;
    }
}
