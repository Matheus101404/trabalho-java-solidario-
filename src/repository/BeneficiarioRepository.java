package repository;

import java.util.ArrayList;
import java.util.List;
import model.Beneficiario;

public class BeneficiarioRepository {
    private List<Beneficiario> beneficiarios = new ArrayList<>();


    public void salvar(Beneficiario beneficiario){
        beneficiarios.add(beneficiario);

    }

    public List<Beneficiario> listarTodos(){
        return beneficiarios;

    }


    
}
