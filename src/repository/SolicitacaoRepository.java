package repository;
import java.util.ArrayList;
import java.util.List;
import model.Solicitacao;

public class SolicitacaoRepository {
    private List<Solicitacao> solicitacoes = new ArrayList<>();



    public void salvar(Solicitacao solicitacao){
        solicitacoes.add(solicitacao);

    }

    public List<Solicitacao> listarTodos(){
        return solicitacoes;

    }

    
}
