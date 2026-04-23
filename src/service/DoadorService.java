package service;

import java.util.List; 

import repository.DoadorRepository;
import model.Doador;

public class DoadorService {
    private DoadorRepository repository = new DoadorRepository();
    
    public void cadastrarDoador(Doador doador){
        if (doador.getNome() != null && !doador.getNome().isEmpty()) {
            repository.salvar(doador);
            
        } else{
            System.out.println("Erro: Nome do doador é obrigatório!");
        }


    }

    public List<Doador> listarTodos(){
        return repository.listarTodos();

    }

    
}
