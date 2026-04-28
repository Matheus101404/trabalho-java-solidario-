package service;
import model.Beneficiario;
import repository.BeneficiarioRepository;
import java.util.List;

public class BeneficiarioService {
    private BeneficiarioRepository repository = new BeneficiarioRepository();

    public void cadastrar(Beneficiario beneficiario){
        repository.salvar(beneficiario);
    }

    public List<Beneficiario> listarTodos(){
        return repository.listarTodos();
    }

    public Beneficiario buscarPorId(int id){
        return repository.buscarPorId(id);
    }
    
}
