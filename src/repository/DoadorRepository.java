package repository;

import java.util.ArrayList;
import java.util.List;
import model.Doador;

public class DoadorRepository {
    private List<Doador> doadores = new ArrayList<>();


    public void salvar(Doador doador){
        doadores.add(doador);

    }

    public List<Doador> listarTodos(){
        return doadores;

    }






    
}
