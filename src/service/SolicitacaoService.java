package service;
import model.Solicitacao;
import model.ItemDoacao;
import repository.SolicitacaoRepository;

public class SolicitacaoService {
    private SolicitacaoRepository repository = new SolicitacaoRepository();


    public boolean registrarSolicitacao(Solicitacao solicitacao){
        ItemDoacao item = solicitacao.getItem();

        if (!item.getStatus().equalsIgnoreCase(ItemDoacao.STATUS_DISPONIVEL)) {
           System.out.println("Erro: Item não está disponível");
           return false;

        }else{
            item.setStatus(ItemDoacao.STATUS_RESERVADO);
            repository.salvar(solicitacao);
            System.out.println("Sucesso!");
            return true;

        }

    

    }

    
}
