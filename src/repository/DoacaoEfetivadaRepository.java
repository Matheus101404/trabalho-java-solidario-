package repository;
import java.util.ArrayList;
import java.util.List;
import model.DoacaoEfetivada;

public class DoacaoEfetivadaRepository {
    private List<DoacaoEfetivada> doacoes = new ArrayList<>();



    public void salvar(DoacaoEfetivada doacao){
        doacoes.add(doacao);

    }

    public List<DoacaoEfetivada> listarTodos(){
        return doacoes;
        
    }
    
}
