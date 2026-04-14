package service;

import model.ItemDoacao;
import repository.ItemDoacaoRepository;

public class ItemDoacaoService {
    private ItemDoacaoRepository repository = new ItemDoacaoRepository();


    public void cadastrarItem(ItemDoacao item){
        if (item == null) {
            System.out.println("[!] Erro: Dados do intem não foram preenchidos corretamente.");
            return;
        }
            
        if (item.getNomeItem() == null || item.getNomeItem().isEmpty()){
                System.out.println("[!] Erro: Nome do item é obrigatorio.");
                return;
        }

        item.setStatus(ItemDoacao.STATUS_DISPONIVEL);
        repository.salvar(item);



        
      
            
        

    }
}
    
    

    

