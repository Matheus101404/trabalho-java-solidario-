package repository;

import java.util.ArrayList;
import java.util.List;
import model.ItemDoacao;



public class ItemDoacaoRepository{
    private List<ItemDoacao> itens = new ArrayList<>();


    public void salvar(ItemDoacao item){
        int idAutomatico = itens.size() + 1;
        item.setId(idAutomatico);
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

    public List<ItemDoacao> buscarPorCategoria(String categoria){
        List<ItemDoacao> filtrados = new ArrayList<>();
        for(ItemDoacao item : itens){
            if(item.getCategoria().equalsIgnoreCase(categoria)){
                filtrados.add(item);
            }
        }
        return filtrados;

    } 
    
   public ItemDoacao buscarPorId(int id){
        for(ItemDoacao i : itens){
            if (i.getId() == id) {
                return i;
            }
        } 
        return null;
    } 
}
    
    


    
