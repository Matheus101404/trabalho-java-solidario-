package repository;

import java.util.ArrayList;
import java.util.List;
import model.ItemDoacao;



public class ItemDoacaoRepository{
    private List<ItemDoacao> itens = new ArrayList<>();


    public void salvar(ItemDoacao item){
        itens.add(item);

    }    

    public List<ItemDoacao> listarTodos(){
        return itens;

    }   

    public List<ItemDoacao> buscarPorStatus(String status){
        List<ItemDoacao> filtrados = new ArrayList<>();
        for (ItemDoacao item : itens){
            if (item.getStatus().equalsIgnoreCase(status)){
                filtrados.add(item);
            }
        }
        return filtrados;
    }
    
    


    
}