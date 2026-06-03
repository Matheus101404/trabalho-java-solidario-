package service;

import model.Solicitacao;
import repository.SolicitacaoRepository;
import java.util.List;

public class SolicitacaoService {
    private final SolicitacaoRepository solicitacaoRepository = new SolicitacaoRepository();

    // Seu método de registrar solicitação já deve estar aqui...
    public void registrarSolicitacao(Solicitacao solicitacao) {
        solicitacaoRepository.registrarSolicitacao(solicitacao);
    }

    // --- ADICIONE ESTE MÉTODO PARA O RELATÓRIO ---
    public void gerarRelatorioDoacoes() {
        System.out.println("\n=================================================================");
        System.out.println("           RELATÓRIO FINAL: DOAÇÕES E SOLICITAÇÕES               ");
        System.out.println("=================================================================");
        
        List<Solicitacao> lista = solicitacaoRepository.listarTodas();

        if (lista.isEmpty()) {
            System.out.println("Nenhuma doação ou solicitação registrada até o momento.");
            System.out.println("=================================================================");
            return;
        }

        // Varre a lista que veio do arquivo TXT e formata a saída
        for (Solicitacao s : lista) {
            System.out.printf("ID SOLICITAÇÃO: [%d] | STATUS: [%s]\n", s.getId(), s.getStatus());
            System.out.printf("BENEFICIÁRIO: %s (CPF: %s)\n", s.getBeneficiario().getNome(), s.getBeneficiario().getId());
            System.out.printf("ITEM PEDIDO: %s | QUANTIDADE: %d\n", s.getItem().getNomeItem(), s.getQuantidade());
            System.out.printf("JUSTIFICATIVA: %s\n", s.getJustificativa());
            System.out.println("-----------------------------------------------------------------");
        }
        System.out.println("=================================================================");
    }
}
