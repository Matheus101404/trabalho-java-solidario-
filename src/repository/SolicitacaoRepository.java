package repository;
import java.util.ArrayList;
import java.util.List;
import model.Solicitacao;

public class SolicitacaoRepository {
    private List<Solicitacao> solicitacoes = new ArrayList<>();
    private int proximoId = 1;




    public void salvar(Solicitacao solicitacao){
        solicitacao.setId(proximoId);
        solicitacoes.add(solicitacao);
        proximoId++;

    }

    public List<Solicitacao> listarTodos(){
        return solicitacoes;

    }

    
}
