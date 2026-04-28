package service;
import model.Solicitacao;
import model.Beneficiario;
import model.ItemDoacao;
import repository.SolicitacaoRepository;

public class SolicitacaoService {
    private SolicitacaoRepository repository = new SolicitacaoRepository();


    public void registrarSolicitacao(Solicitacao solicitacao){
        ItemDoacao item = solicitacao.getItem();

        if (item.getStatus().equalsIgnoreCase("DISPONIVEL")) {
            item.setStatus("SOLICITADO");
            repository.salvar(solicitacao);
            System.out.println("Sucesso!");

        }else{
            System.out.println("Erro: Item não está disponivel");

        }

    

    }

    
}
