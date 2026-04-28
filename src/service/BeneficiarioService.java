package service;
import model.Beneficiario;
import repository.BeneficiarioRepository;
import java.util.List;

import java.util.List;

import model.Beneficiario;
import repository.BeneficiarioRepository;

public class BeneficiarioService {
    private BeneficiarioRepository repository = new BeneficiarioRepository();

    public void cadastrar(Beneficiario beneficiario){
        repository.salvar(beneficiario);
    public void cadastrarBeneficiario(Beneficiario beneficiario){
        if (beneficiario.getNome() != null && !beneficiario.getNome().isEmpty()) {
            repository.salvar(beneficiario);

            
        }else {
            System.out.println("Erro: Nome do Beneficiario é obrigatório!");
        }
    }

    public List<Beneficiario> listarTodos(){
        return repository.listarTodos();
    }

    public Beneficiario buscarPorId(int id){
        return repository.buscarPorId(id);
    }

    }

    
}
